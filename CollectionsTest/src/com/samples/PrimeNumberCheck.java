package com.samples;

import java.util.ArrayList;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkForEven();

		/*
		 * for (int r = 1; r <= 100; r++) { if(checkForEven1(r)) {
		 * System.out.println("Its prime -->"+r);
		 * 
		 * }
		 * 
		 * }
		 */

	}

	private static boolean checkForEven1(int r) {
		// 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
		// 73, 79, 83, 89, 97.
		// int r =33;

		boolean prime = true;
		for (int i = 2; i <= r / 2; i++) {
			if (r % i == 0) {
				prime = false;

			}
		}
		return prime;
	}

	private static void checkForEven() {

		for (int r = 0; r < 100; r++) {
			boolean prime = true;
			for (int i = 2; i <= r / 2; i++) {
				if (r % i == 0) {
					prime = false;
					break;
				}

			}

			if (prime)
				System.out.println("Yes it prime-->" + r);

		}

	}
}
