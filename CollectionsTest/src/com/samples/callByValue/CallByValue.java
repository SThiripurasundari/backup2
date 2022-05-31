package com.samples.callByValue;

import com.test.collectionSamples.EmployeeDetails;

//https://www.softwaretestinghelp.com/java/java-pass-by-reference-and-pass-by-value/

public class CallByValue {

	public static void main(String[] args) {

		EmployeeDetails emp = new EmployeeDetails(1, "Ani");
		CallByValue value = new CallByValue();

		Integer x = 10, y = 20;
		System.out.println("Emp ID before:" + emp.getId());
		value.change(x, y, emp);
		System.out.println("x:" + x + "   y :" + y);
		System.out.println("Emp ID :" + emp.getId());

	}

	public void change(Integer x, Integer y, EmployeeDetails emp) {
		Integer temp = (x);
		x = y;
		y = temp;
		x = 500;
		emp.setId(500);

	}

}
