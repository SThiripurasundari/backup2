package com.samples;

import java.util.Arrays;

public class Move0ToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Move all zeroes to end of array
		// if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0},
		// it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}.

		tst();
		// https://www.geeksforgeeks.org/rearrange-array-alternating-positive-negative-items-o1-extra-space/?ref=lbp
	}

	private static void tst() {
		int[] input = { 1, 0, 8, 9, 0, 0, 2, 7, 0, 6, 6 };

		int startpt = 0;
		int endptr = input.length - 1;
		int swap;

		while (startpt < endptr) {
			if (input[startpt] == 0) {
				swap = input[startpt];
				input[startpt] = input[endptr];
				input[endptr] = swap;
				endptr--;

			} else {
				startpt++;
			}

		}

		System.out.println("Result " + Arrays.toString(input));

	}

}
