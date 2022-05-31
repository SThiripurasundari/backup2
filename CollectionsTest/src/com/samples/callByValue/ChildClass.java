package com.samples.callByValue;

public class ChildClass extends ParentClass {
String test;
	int childInt = 10;
	void changeVlaueofChild(int x) {
		parentInt = x;
	}

	void getName() {
		System.out.println("get Name ");

	}

	void commonMethod() {
		System.out.println("In Child class ");

	}

}
