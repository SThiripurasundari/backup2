package com.sample.Exceptions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RunTest2 {

	static String variable1 = "size";

	public static void main(String[] args) {

		RunTest2 test = null;
		test.getType(variable1);
		//test.getAge(variable1);
		// TODO Auto-generated method stub

		ParentClass classP = new ParentClass();
		Map hash = new HashMap();
		hash.put(0, "");

		String e1 = "kumar";
		String e2 = "kumar";
		String e3 = e1;

		if (e1.equals(e3)) {

			System.out.println("true");
		}

		if (e1 == (e3)) {

			System.out.println("true");
		}

		// classP.getMessage(hash.get(0));
	}

	public static void getType(String test) {
		variable1 = "new test";
		System.out.println(variable1);

	}

	public void getAge(String test) {
		variable1 = "new test";

		System.out.println(test);
	}

}


// Agggregation and composition and asssociation - example 

//SOLID 
//how to check consecutive number in their in the complete string 
 
//