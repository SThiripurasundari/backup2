package com.test.Thread;

public class RunThisThread3 {

	public static void main(String[] args) {
		GetAndPut gp = new GetAndPut();
		new ProdcuerAccessingPut(gp);
		new ConsumerAccessingGet(gp);
		new ProdcuerAccessingPut(gp);
		new ProdcuerAccessingPut(gp);
		System.out.println("--------");

	}

}

class ConsumerAccessingGet implements Runnable {

	GetAndPut get;
	Thread t = new Thread(this, "Consumer");

	ConsumerAccessingGet(GetAndPut gp) {
		this.get = gp;
		t.start();
	}

	@Override
	public void run() {
		while (true) {
			get.get();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class ProdcuerAccessingPut implements Runnable {

	GetAndPut put;
	Thread t = new Thread(this, "Producer");

	ProdcuerAccessingPut(GetAndPut gp) {
		this.put = gp;
		t.start();
	}

	@Override
	public void run() {
		while (true) {
			put.put();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class GetAndPut {

	int i = 0;

	public synchronized void get() {
		System.out.println("I am in Get" + i);

	}

	public synchronized void put() {

		i++;
		System.out.println("I am in put"+i);

	}

}