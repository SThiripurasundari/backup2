package com.sample.Maps;

import java.util.*;
import java.util.Map.Entry;

import com.test.collectionSamples.ArrayList;

public class MapsInterfaceImpl {

	public static void main(String[] args) {

		String[] args2 = { "java", "Freq", "if", "it", "is", "to", "be", "It", "is", "up", "to", "me", "To",
				"Delegate" };

		// no guarantees as to the order of the map; in particular, it does not
		// guarantee that the order will remain constant over time
		Map<String, Integer> hashMap = new HashMap<String, Integer>();

		for (String a : args2) {
			Integer freq = (Integer) hashMap.get(a);
			hashMap.put(a, (freq == null) ? 1 : freq + 1);
			System.out.println(hashMap);
		}
		System.out.println(hashMap.size() + " distinct words:");
		System.out.println(hashMap);

		// Tree Map - Data is sorted in alphabetical order
		Map treeMap = new TreeMap<String, Integer>();
		for (String a : args2) {
			Integer freq = (Integer) treeMap.get(a);
			treeMap.put(a, (freq == null) ? 1 : freq + 1);
			System.out.println("treeMap :" + treeMap);
		}
		System.out.println(treeMap.size() + " distinct words:");
		System.out.println("treeMap :" + treeMap);

		// Linked Map - order is maintained in which ordered they are being added
		Map<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
		for (String a : args2) {
			Integer freq = (Integer) linkedHashMap.get(a);
			linkedHashMap.put(a, (freq == null) ? 1 : freq + 1);
			System.out.println("Linked HashMap :" + linkedHashMap);
		}

		Set<String> set = linkedHashMap.keySet();
		for (String c : set) {
			System.out.println(" c " + c + "value" + hashMap.get(c));

		}

		linkedHashMap.forEach((id, name) -> {

			System.out.println("Key : " + id + " value : " + name);
		});
		
	
		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			System.out.println(" " + it.next());
		}

		
	
		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());
		}

		// String[] arg = { "One", "Two", "Three", "Four", "Five", "Six" };

		// Order is maintained
		/*
		 * Map.Entry<String, Integer> t = (Entry<String, Integer>) hashMap.entrySet();
		 * for (Map.Entry<String, Integer> e : hashMap.entrySet()) { Set set =
		 * hashMap.entrySet(); System.out.println(e.getKey() + ": " + e.getValue());
		 * System.out.println(linkedHashMap.size() + " distinct words:");
		 * System.out.println("Order in whicg its added is maintained  -" +
		 * linkedHashMap); }
		 */
	}

}
