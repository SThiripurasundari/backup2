package com.samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CollectionSamples {
	public static void main(String[] args) {

		
		// 2.Hashtable
		Hashtable<String, String> table = new Hashtable<String, String>();
		table.put("1", "1");
		table.put("2", "2");
		table.put("3", "3");

		Set<String> sets = table.keySet();

		System.out.println("SETS :" + sets);

		

	}
}
