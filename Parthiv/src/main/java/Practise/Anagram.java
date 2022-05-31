package Practise;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
	
		String first = "School MASTER";
		String second = "The ClassROOM";

		char[] frstChr = first.toLowerCase().toCharArray();
		char[] secChr = second.toLowerCase().toCharArray();

		Arrays.sort(frstChr);
		Arrays.sort(secChr);

		System.out.println("frstChr :" + String.valueOf(frstChr));
		System.out.println("secChr  :" + String.valueOf(secChr));

		if (Arrays.equals(frstChr, secChr)) {
			System.out.println("true");
		} else {
			System.out.println("false");

		}

	}

}
