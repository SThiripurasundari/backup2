package com.samples;

public class ConcescutiveNumberInStr {

	public static void main(String[] args) {

		 //reverse();
		String arg2 = "17,18,19";
		calculate(arg2);

		String arg = "769";
		calculate1(arg);
	}

	private static void calculate1(String arg) {

		char[] charArray = arg.toCharArray();
		int previous = Integer.parseInt(String.valueOf(charArray[0]));
		System.out.println("previous" + previous);
		boolean isCont = true;
		for (int t = 1; t < charArray.length; t++) {
			if (isCont) {
				
				int a = Integer.parseInt(String.valueOf(charArray[t]));
				if (previous == a - 1) {
					isCont = true;
					previous = a;
					// System.out.println("true");
				} else {
					isCont = false;
					// System.out.println("false");
					break;
				}
			}

		}

		if (isCont) {
			System.out.println("true");
		} else {
			System.out.println("false");

		}

	}

	private static void calculate(String args2) {

		String[] strAray = args2.split(",");

		int previous = Integer.parseInt(strAray[0]);
		boolean isCont = true;
		for (int t = 1; t < strAray.length; t++) {

			if (isCont) {
				int a = Integer.parseInt(strAray[t]);
				if (previous == a - 1) {
					isCont = true;
					previous = a;

				} else {
					isCont = false;
				}
			}

		}

		if (isCont) {
			System.out.println("true");
		} else {
			System.out.println("false");

		}
	}

	private static void reverse() {
		String str = "Geeks", nstr = "";
		char ch;

		System.out.print("Original word: ");
		System.out.println("Geeks"); // Example word

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i); // extracts each character
			System.out.println("ch" + ch);

			nstr = ch + nstr; // adds each character in front of the existing string
			System.out.println("nstr" + nstr);
		}
		System.out.println("Reversed word: " + nstr);
	}
}
