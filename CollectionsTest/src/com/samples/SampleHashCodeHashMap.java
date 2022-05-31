package com.samples;

import java.util.HashMap;

import com.test.collectionSamples.EmployeeDetails;

public class SampleHashCodeHashMap {

	public static void main(String[] args) {
	
	
		EmployeeDetails details  = new EmployeeDetails(10, "Anitha");
		EmployeeDetails details2 = new EmployeeDetails(11, "Anitha");
		EmployeeDetails details3 = new EmployeeDetails(10, "Anitha");
		EmployeeDetails details4 = new EmployeeDetails(10, "Anitha");
		EmployeeDetails details5 = new EmployeeDetails(10, "Anitha");

	
		HashMap map = new HashMap();
		map.put(details, "1");
		map.put(details2, "1");
		map.put(details3, "1");
		//map.put(details4, "1");
		//map.put(details5, "1");

		System.out.println(map.size());
		System.out.println("data in hashmap :" + map);

	/*	HashMap map2 = new HashMap();
		map2.put("01", "ABC");
		map2.put("02", "  ABC");
		map2.put("01", "ABC");
		map2.put("01", "ABC");
		System.out.println(map2.size());
		System.out.println("data in hashmap :" + map2);*/

		// update(details, str1, t);

		// System.out.println("name :" + details.getName());
		// System.out.println("str1 :" + str1);
		// System.out.println("t :" + t);

	}

	public static void update(EmployeeDetails details, String str1, int t) {
		details.setName("Arvindrrrrrrrrrrrrrrrrrrr");
		str1 = "Employee Lsr ";
		t = 100;
		EmployeeDetails details2 = new EmployeeDetails(10, "Parthiv");
		details = details2;

		System.out.println("name in methid :" + details.getName());
	}

}
