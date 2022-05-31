package com.test.collectionSamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RunCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int id = 0;

		EmployeeDetails emp1 = new EmployeeDetails(101, "Raj");
		EmployeeDetails emp2 = new EmployeeDetails(102, "Neha");
		EmployeeDetails emp3 = new EmployeeDetails(103, "Ani");

		List<EmployeeDetails> arraylist = new ArrayList<EmployeeDetails>();
		arraylist.add(emp1);
		arraylist.add(emp2);
		arraylist.add(emp3);
		testLinkedList(arraylist);
		 
		 
		 System.out.println("----------------------------------------- ");
		 System.out.println("----------------------------------------- "+emp1.toString());
		 System.out.println("----------------------------------------- "+emp2.toString());
		 System.out.println("----------------------------------------- "+emp3.toString());
		 
		LinkedList<EmployeeDetails> linkedList = new LinkedList<EmployeeDetails>();
		linkedList.add(emp1);
		linkedList.add(emp2);
		linkedList.add(emp3);

		testLinkedList(linkedList);
	}
	
	//HashMap, ArrayList, Vector, HashSet,  - throw concurrent modification exception - modcount - fail fast
	//CopyOnWriteArrayList, ConcurrentHashMap   - FailSafe 

	private static void testLinkedList(List<EmployeeDetails> empList2) {
		/*
		 * Iterator<EmployeeDetails> it = empList2.iterator();
		 *  EmployeeDetails details = null;
		 *  while (it.hasNext()) {
		 *   details = it.next();
		 * System.out.print("Details -->:" + details.toString() + " --:-- ");
		 * details.setId(999); empList2.add(details); }
		 */

		Iterator<EmployeeDetails> it = empList2.iterator();
		EmployeeDetails details = null;
		for (Iterator<EmployeeDetails> itr = empList2.iterator(); itr.hasNext();) {
			details = itr.next();
			details.setId(details.getId() + 1);

		}
		empList2.add(details);
		System.out.println("Details 1-->:" + details.toString() + " --:-- ");
		System.out.println("Details 2-->:" + empList2 + " --:-- ");
		
	}

	private static void testLinkedList(LinkedList<EmployeeDetails> empList2) {
		Iterator<EmployeeDetails> it = empList2.iterator();
		EmployeeDetails details = null;
		
		//this code will avoid concurrent modification error 
		for (Iterator<EmployeeDetails> itr = empList2.iterator(); itr.hasNext();) {
			details = itr.next();
			details.setId(details.getId() + 1);

		}
		empList2.add(details);
		System.out.println("Details 1-->:" + details.toString() + " --:-- ");
		System.out.println("Details 2-->:" + empList2 + " --:-- ");
		
		//this code will give concurrent modification error 
		/*
		 * while (it.hasNext()) { details = it.next(); System.out.print(
		 * "Details -->:"+details.toString()+" --:-- "); details.setId(999);
		 * empList2.add(details); }
		 */

	}
}
