package com.samples.callByValue;

public class ParentClass {

	int parentInt = 10;

	void changeValueofIntinParent(int x) {

		parentInt = x;

	}
	
	
	void commonMethod()
	{
		System.out.println("In Parent class ");
		
	}

}
