package com.Thread.Synz;

public class RunThreadSyn {
	public static void main(String arg[]) {
		Display d1 = new Display();
		Display d2 = new Display();
		Display d3 = new Display();
		MyThread t1 = new MyThread(d1, "Dhoni1");
		MyThread2 t2 = new MyThread2(d2, "Yuvaraj2");
		MyThread3 t3 = new MyThread3(d3, "Anitha");

		t1.start();
		t2.start();
		t3.start();

	}

}
