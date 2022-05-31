package com.samples.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateUsingHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] stringARray = { "i", "came", "i", "saw", "i", "left", "saw" };

		Set<String> uniques = new HashSet<String>();
		Set<String> dups = new HashSet<String>();

		for (String a : stringARray) {
			System.out.println("a" + a);
			boolean added = uniques.add(a);
			if (!added) {
				System.out.println("Inside boolean  if" + a);
				dups.add(a);
			}
		}
		System.out.println("Unique words:    " + uniques);
		// Destructive set-difference
		uniques.removeAll(dups);

		System.out.println("Unique words:    " + uniques);
		System.out.println("Duplicate words: " + dups);

		HashSet<String> set = new HashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");

		HashSet<String> set2 = new HashSet<String>();
		set2.add("Five");
		set2.add("Six");
		set2.add("two");
		set2.add("One");
		
		
		Set<String> symmetricDiff = new HashSet<String>(set);
		symmetricDiff.addAll(set2);
		System.out.println("1"+symmetricDiff);
		
		
		Set<String> tmp = new HashSet<String>(set);
		//intersection of set and set2 which is data = "One"
		tmp.retainAll(set2);
		System.out.println("2"+tmp);
		
		
		//set difference of two sets 
		symmetricDiff.removeAll(set2);
		System.out.println("3"+symmetricDiff);

	}

}
