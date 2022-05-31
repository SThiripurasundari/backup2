package com.test.finalTest;

import java.io.Serializable;

public class RuntHisForFinal implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final int age = 18;

	void display() {
		System.out.println("In am Mainclass");
	}

	public static void main(String[] args) {

		RuntHisForFinal obj = new RuntHisForFinal();
		// gives compile time error
		obj.display();
		obj = null;
		 System.gc();
		System.out.println("End of the garbage collection");
	}

	protected void finalize() {
		System.out.println("Called the finalize() method");
	}
}
