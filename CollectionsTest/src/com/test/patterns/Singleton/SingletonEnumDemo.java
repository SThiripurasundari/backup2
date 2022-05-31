package com.test.patterns.Singleton;

public class SingletonEnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ABC obj1 = ABC.TEST;
		obj1.show();
		obj1.i = 10;
		obj1.show();

		ABC obj2 = ABC.TEST;
		obj2.i = 90;
		obj1.show();
	}

}

enum ABC {//special type of class
	
	TEST; //--> public static ABC getInstance(){} -and has inbuild constructor 
	int i = 10;
	public void show() {
		System.out.println("i value " + i);

	}
}
