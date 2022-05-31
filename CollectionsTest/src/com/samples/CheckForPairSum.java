package com.samples;

import java.util.Arrays;
import java.util.HashSet;

public class CheckForPairSum {

	public static void main(String[] args) {

		method2();
		int[] intA = { 1, 4, 45, 6, 10, 8 };
		int req = 46;
		
		Arrays.sort(intA);
		int l = 0, r = intA.length - 1;

		while (l < r) {
			if (intA[l] + intA[r] == req) {
				break;
			} else if (intA[l] + intA[r] > req) {
				r--;
			} else {
				l++;
			}

		}
		System.out.println("Answer :" + intA[l] + ":" + intA[r]);
	}

	public static void method2() {
		int[] arr = { 4,10,1,8,2 };
		
		int sum = 18;
		HashSet s = new HashSet();
		for (int x = 0; x < arr.length; x++) {
			int temp = sum - arr[x];
			if (s.contains(temp)) {
				System.out.println("ANswer is :" + arr[x] + ":  " + temp);

			}
			s.add(arr[x]);

		}
	}

}
