package com.test.collectionSamples;

import java.util.*;
import java.util.ArrayList;

public class SortEmpID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDetails emp1 = new EmployeeDetails(134, "Raj");
		EmployeeDetails emp2 = new EmployeeDetails(191, "Neha");
		EmployeeDetails emp3 = new EmployeeDetails(101, "Zni101");
		EmployeeDetails emp4 = new EmployeeDetails(101, "Xni102");
		EmployeeDetails emp5 = new EmployeeDetails(101, "Ani4");
		EmployeeDetails emp6 = new EmployeeDetails(789, "Yni");
		EmployeeDetails emp7 = new EmployeeDetails(121, "Raji");
		EmployeeDetails emp9 = new EmployeeDetails(141, "D2ni");
		EmployeeDetails emp8 = new EmployeeDetails(111, "B1ni");
		EmployeeDetails emp10 = new EmployeeDetails(154, "Ani3");

		
		
		/*
		 * ArrayList<EmployeeDetails> al = new ArrayList<EmployeeDetails>();
		 * al.add(emp3);
		 */
		
		List<EmployeeDetails> arraylist = new ArrayList<EmployeeDetails>();
		arraylist.add(emp1);
		arraylist.add(emp2);
		arraylist.add(emp3);
		arraylist.add(emp4);
		arraylist.add(emp5);
		arraylist.add(emp6);
		arraylist.add(emp7);
		arraylist.add(emp8);
		arraylist.add(emp9);
		arraylist.add(emp10);

		for (int i = 0; i < arraylist.size(); i++) {

			System.out.println("  " + arraylist.get(i).toString());

		}
		System.out.println("  after -----------------------------");

		Collections.sort(arraylist);
		for (int i = 0; i < arraylist.size(); i++) {

			
			System.out.println("  " + arraylist.get(i).toString());

		}

	}

}
