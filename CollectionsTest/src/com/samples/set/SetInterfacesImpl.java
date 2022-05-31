package com.samples.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class SetInterfacesImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1
		// HashSet doesn't maintain the insertion order. Here, elements are inserted on
		// the basis of their hashcode.Each time u will get in different order but
		// duplicates removed
		HashSet<String> set = new HashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		set.add("ONE");
		set.add("two");
		set.add("One");

		System.out.println("Hashset -> 1. no duplicates 2. not ordered(order in which its added)  3. not sorted ");

		// 3.The toArray methods are provided as a bridge between collections
		// and older APIs that expect arrays on input.
		Object[] a = set.toArray();
		System.out.println("Elements of SET" + " as Array: " + Arrays.toString(a));

		// 3.LinkedHashset

		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("One");
		linkedHashSet.add("Two");
		linkedHashSet.add("Three");
		linkedHashSet.add("Four");
		linkedHashSet.add("Five");
		linkedHashSet.add("ONE");
		linkedHashSet.add("two");
		linkedHashSet.add("One");

		System.out.println(
				"Hashset -> 1. no duplicates 2.  ordered(order in which its added is maintained)   3. not sorted ");
		// 2. conversion constructor,
		List<String> list3 = new ArrayList<String>(linkedHashSet);
		for (String test : list3) {
			System.out.println("linkedHashSet ->" + test);
		}

		// Treeset
		System.out.println(
				"Hashset -> 1. no duplicates 2.  not ordered(order in which its added is maintained)   3. sorted ");
		TreeSet<String> treeset = new TreeSet<String>();
		treeset.add("One");
		treeset.add("Two");
		treeset.add("Three");
		treeset.add("Four");
		treeset.add("Five");
		treeset.add("ONE");
		treeset.add("two");
		treeset.add("One");
		Iterator<String> itr = treeset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		Iterator it = treeset.iterator();
		while (it.hasNext()) {
			System.out.println(""+it.next());
       
		}

		// collection c with duplicates when given as input and Hashset created then all
		// duplicates are removed
		// Collection<Type> noDups = new HashSet<Type>(c);
		// same work but order is maintained
		// Collection<Type> noDups = new LinkedHashSet<Type>(c);
	}

}
