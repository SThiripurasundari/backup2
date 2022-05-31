package Practise;

import java.util.Arrays;

public class ArraysEqualCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str1 = { "ZR", "ZY", "ZZ" };
		String[] str2 = { "ZY", "ZR", "ZZ" };

		// System.out.println("Result 1-->" + checkEquals(str1, str2));
		System.out.println("Result 2-->" + checkEquals2(str1, str2));

	}

	private static boolean checkEquals(String[] str1, String[] str2) {
		boolean equals = true;

		Arrays.sort(str1);

		Arrays.sort(str2);
		Arrays.equals(str1, str2);

		for (int i = 0; i < str1.length; i++) {

			System.out.println("str1 -->" + str1[i] + "  :str2 -->" + str2[i]);
			if (!str1[i].equals(str2[i])) {
				System.out.println("not equals");
				equals = false;
				break;
			} else {
				System.out.println("they are equal");
			}
		}

		return equals;

	}

	private static boolean checkEquals2(String[] str1, String[] str2) {
		boolean equals = false;

		Arrays.sort(str1);

		Arrays.sort(str2);

		/*
		 * for (int i = 0; i < str1.length; i++) {
		 * 
		 * System.out.println("str1 -->" + str1[i] + "  :str2 -->" + str2[i]); if
		 * (str1[i].equals(str2[i])) { System.out.println(" equals"); equals = true;
		 * 
		 * } else { System.out.println("they not are equal"); equals = false; break; } }
		 */

		System.out.println(Arrays.equals(str1, str2));

		return equals;

	}
}
