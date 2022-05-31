package com.samples;

public class MissingNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Given input Array from 1 to n
		int[] input = { 10, 9, 6, 7, 4, 3, 5, 1, 2 };

		// Calculate n value
		int n = input.length + 1;

		// Calculate Sum of N Number
		// using Math formula n(n+1)/2
		int sumOfNNumbers = sumOfAllNNumbers(n);
		System.out.println("1 -->" + sumOfNNumbers);
		// Calculate Sum of all numbers in input array
		int sumOfInputArray = sumOfInputArrayNumbers(input);
		System.out.println("2 -->" + sumOfInputArray);
		// Calculate missing number
		// using subtraction
		int missingNumber = sumOfNNumbers - sumOfInputArray;

		// Print the Missing number
		System.out.println("Missing number in an array is : " + missingNumber);

	}

	public static int sumOfAllNNumbers(int n) {
		int sum = (n * (n + 1)) / 2;
		return sum;
	}

	public static int sumOfInputArrayNumbers(int[] input) {
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			sum = sum + input[i];
		}
		return sum;
	}
}
