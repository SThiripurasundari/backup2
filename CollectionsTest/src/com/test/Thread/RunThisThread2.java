package com.test.Thread;

public class RunThisThread2 {

	public static void main(String[] args) {

		Q q = new Q();
		new Producer(q);
		new Producer(q);
		new Producer(q);
		new Consumer(q);
	}
}

class Q {
	int num = 0;
	boolean valueSet = false;

	public synchronized void get() {

		while (!valueSet)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Get :" + num);
		valueSet = false;

		notify();
	}

	public synchronized void put(int num) {

		while (valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.num = num;
		valueSet = true;
		System.out.println("put :" + num);
		notify();
	}

}

class Producer implements Runnable {

	Q q;
	Thread t = new Thread(this, "Producer");

	Producer(Q q) {
		this.q = q;
		t.start();
	}

	public synchronized void run() {
		int i = 0;
		while (true) {
			q.put(i++);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}

	}

}

class Consumer implements Runnable {
	Q q;
	Thread t = new Thread(this, "Consumer");

	Consumer(Q q) {
		this.q = q;
		t.start();
	}

	@Override
	public synchronized void run() {
		while (true) {
			q.get();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}

}
