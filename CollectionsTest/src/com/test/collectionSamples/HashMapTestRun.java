package com.test.collectionSamples;

import java.util.HashMap;
import java.util.Map;

public class HashMapTestRun {

	public static void main(String[] args) {

		// testHashMap();
		// testing();

		test1();

	}

	private static void test1() {

		HashMap map = new HashMap();

		/*
		 * map.put("Ani", "Test1"); map.put("Ani", "Test2"); map.put("Ani", "Test3");
		 * map.put("Ani", "Test4");
		 */
		EmployeeDetails details = new EmployeeDetails(0, "Anitha1");
		EmployeeDetails details2 = new EmployeeDetails(1, "Anitha1");
		EmployeeDetails details3 = new EmployeeDetails(0, "Anitha1");
	
		map.put(details, 1);
		map.put(details2, 2);
		map.put(details3, 3);
		System.out.println("map :" + map.toString());
		System.out.println("map :" + map.size());

	}

	private static void testing() {

		EmployeeDetails details = null;
		HashMap map = new HashMap<Integer, String>();
		for (int i = 0; i < 10; i++) {

			details = new EmployeeDetails(1, "Name:" + i);
			map.put(i, details);

		}

	}

	private static void testHashMap() {

		Map<Integer, String> map = new HashMap<Integer, String>();
		String test = null;
		for (int y = 0; y < 10; y++) {
			test = "Name :" + y + ":";
			map.put(y, test);

		}

		System.out.println(map.toString());

	}
}
