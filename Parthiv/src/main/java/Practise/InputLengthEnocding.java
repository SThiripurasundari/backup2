package Practise;

import java.util.HashMap;
import java.util.Set;

public class InputLengthEnocding {

	public static void main(String[] args) {

		String input = "AABBBCDDD";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] charArray = input.toCharArray();

		for (int t = 0; t < charArray.length; t++) {

			char c = charArray[t];

			if (map.containsKey(c)) {

				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);

			}

		}

		Set<Character> s = map.keySet();
		String test = "";

		for (char c : s) {

			test = test + c + map.get(c);

		}

		System.out.println("Ans " + test);

	}

}
