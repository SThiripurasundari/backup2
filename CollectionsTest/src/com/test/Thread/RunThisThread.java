package com.test.Thread;

public class RunThisThread {

	public static void main(String[] args) {

		// Thread implemenation
		A threadImplObj = new A();

		// Runnable implementation
		Runnable runnableImpThread = new B();
		Thread thread2 = new Thread(runnableImpThread);
		
		Runnable Obj3 = new C();
		Thread thread3 = new Thread(Obj3);
		
		threadImplObj.start();
		try {
			Thread.sleep(20);
		} catch (Exception e) {
		}
		thread2.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
		}
		thread3.start();
	}

}

class A extends Thread {

	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("In am in print Class A");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}

	}
}

class B implements Runnable {

	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("In am in run Class B");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}

	}
}



class C implements Runnable {

	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("In am in run Class C");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}

	}
}