package com.samples;

import java.util.*;

public class DuplicateRemWithoutColl  extends ArrayList<String>  {

	// objet .equals
	//list .contains to check duplicates 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AbstractList<String> list = new Stack<String>();
		list.add("GFG");
		list.add("for");
		list.add("Geeks");
		list.add("computer");
		list.add("portal");
		list.subList(0, 2).clear();
		 //List<String> unmodifiableList = Collections.unmodifiableList(list);
		 //unmodifiableList.add("name");

		System.out.println("List-->" + list);

		DuplicateRemWithoutColl arr = new DuplicateRemWithoutColl();
		arr.add("GFG");
		arr.add("for");
		arr.add("Geeks");
		arr.add("computer");
		arr.add("portal");
		
		//// since removeRange() is a protected method
		// ArrayList has to be extend the class otherwise in normal case it wil not work 
		arr.removeRange(0, 2);
		System.out.println("arr-->" + arr);
	}

}
