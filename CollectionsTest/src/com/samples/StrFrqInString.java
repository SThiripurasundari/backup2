package com.samples;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StrFrqInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrFrqInString frq = new StrFrqInString();
		Map<Character, Integer> printMap = null;
		String test = "DCBAABBBCCCCDDDDDT";

		try {
			printMap = frq.checkFre(test);

			// Method 1 # using iterator on keyset
			Iterator<Character> it = printMap.keySet().iterator();
			while (it.hasNext()) {
				Character c = (Character) it.next();
				System.out.println("Roll no.: " + c + "     name: " + printMap.get(c));
			}

			// Method 3 - Using HashMap entry sets
			// Get an iterator
			Iterator i = printMap.entrySet().iterator();

			// Display elements
			while (i.hasNext()) {
				Map.Entry me = (Map.Entry) i.next();
				System.out.print(me.getKey() + ": ");
				System.out.println(me.getValue());
			}

			// Method 4 Lambda
			printMap.forEach((k, v) -> System.out.println("Company: " + k + ", Net worth: " + v));

			// Method 2 - using keySet/values itself not going to itertor
			for (Character State : printMap.keySet()) // using keyset() method for iteration over keySet
				System.out.println("State: " + State + printMap.get(State));
			for (Integer Capital : printMap.values()) // using values() for iteration over keys
				System.out.println("Capiatl: " + Capital);

			// method 5
			Set<Character> s = printMap.keySet();
			for (Character c : s) {
				System.out.print(c + ": ");
				System.out.println(printMap.get(c));

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private Map checkFre(String test) {
		char[] charArray = test.toCharArray();
		Map<Character, Integer> tempHold = new HashMap<Character, Integer>();
		int freq = 0;

		for (int i = 0; i < charArray.length; i++) {

			if (tempHold.containsKey(charArray[i])) {
				tempHold.put(charArray[i], tempHold.get(charArray[i]) + 1);
			} else {
				tempHold.put(charArray[i], 1);
			}

		}
		System.out.println("in method" + tempHold.toString());
		return tempHold;

	}

}
