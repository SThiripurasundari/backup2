package com.Thread.Synz;

public class MyThread2 extends Thread {
	Display d;
	String name;

	MyThread2(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {

		d.wish2(name);
	}
}
