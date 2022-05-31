package com.samples.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class ListSamples {

	// ordered collections (or sequence)
	// contains duplicate
	// positional access +search +iterations +range view
	// List iterator - either direction , modify list during iteration, current
	// position
	// hasNext Next and remove + has previous +previous
	// ArrayList and LinkedList
	// remove from top
	// adds at the bottom
	//
	public static void main(String[] args) {

		// List<String> list = Arrays.asList(args);

		// Shuffle the data each time
		String[] arg = { "One", "Two", "Three", "Four", "Five", "Six" };
		List<String> list = new ArrayList<String>();
		for (String a : arg)
			list.add(a);
		// Collections.shuffle(list, new Random());
		// System.out.println(list);

		// retains elements from 0-2
		// list = list.subList(0, 2);

		// int i = list.subList(0, 2).indexOf(1);
		// System.out.println(" t-->" + i);

		// clears data from 0-2
		// list.subList(0, 2).clear();

		// This constructor is emtpy for forward iteration
		// The enhanced for statement does not allow you to modify the List.
		// Using an instance of the Iterator class allows you to delete elements,
		// but not replace an existing element or add a new one. That leaves
		// ListIterator:
		// nextIndex and .set method not there in iterator
		for (ListIterator<String> it = list.listIterator(); it.hasNext();) {
			String t = it.next();
			if (t.equals("Three")) {
				System.out.println(" t-->" + it.nextIndex());
				t = "Threeeee";
				it.set(t);
			}

			System.out.println("NEXT t-->" + t);
		}

		// This constructor takes starting point for reverse iteration
		for (ListIterator<String> it = list.listIterator(list.size()); it.hasPrevious();) {
			String t = it.previous();
			if (t.equals("Three")) {
				System.out.println(" t-->" + it.nextIndex());
			}

			System.out.println("Previous t-->" + t);
		}

	}

}
