package com.Thread.Synz;

public class Display {

	public static synchronized void wish(String name) {
		for (int i = 0; i < 3; i++) {
			System.out.print("Good Morning: ");
			System.out.println(name);
			try {
				Thread.sleep(2000);

			} catch (InterruptedException e) {
			}
		}
	}

	public static synchronized void wish2(String name) {
		System.out.println("wishe 2 is called ");
		for (int i = 0; i < 3; i++) {
			System.out.print("Good Evening: ");
			System.out.println(name);
			try {
				Thread.sleep(2000);

			} catch (InterruptedException e) {
			}
		}
	}

	public void wish3(String name) {
		System.out.println("wishe 3 is called ");
		for (int i = 0; i < 3; i++) {
			System.out.print("Good night: ");
			System.out.println(name);

		}
	}

}
