package com.Thread.Synz;

public class MyThread3 extends Thread {
	Display d;
	String name;

	MyThread3(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {

		System.out.println("in MyThread3 ");
		d.wish3(name);
	}

}
