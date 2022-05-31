package com.samples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class CollectorTestSample {

	public static void main(String[] args) {
		String workOnThis = "APP AWE APP AWE APP TYRE APP TYRE QQQQQ";
		String[] strArry = workOnThis.split("\\s");

		System.out.println("strArray :" + strArry.toString());
		Map<String, Integer> maps = new HashMap<String, Integer>();

		// maps.computeIfAbsent("k5", k -> 200 + 300);

		ConcurrentHashMap map2 = new ConcurrentHashMap<String, String>();
		map2.put(maps, map2);

		for (String indWord : strArry) {
			if (maps.containsKey(indWord)) {
				maps.put(indWord, maps.get(indWord) + 1);

			} else {

				maps.put(indWord, 1);
			}

		}

		sortByValueInDecreasingOrder(maps);
		System.out.println("maps " + maps);

	}

	public static List<Entry<String, Integer>> sortByValueInDecreasingOrder(Map<String, Integer> wordMap) {

		Collections.sort(al, Comparator.comparing((Student instrument) -> instrument.getName()));

		Set<Entry<String, Integer>> entries = wordMap.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<>(entries);

		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});
		return list;
	}

}
