package com.samples;

public class Fibnacci {

	public static void main(String[] args) {

		// 0,1,1,2,3,5,8

		int previous = 0;// 1 //2 //3
		int current = 1; // 1 //1 //2
		int answer = 0; // 2 //3
		System.out.println(previous);
		// System.out.println(current);

		for (int t = 0; t < 10; t++) {

			answer = current + previous;
			System.out.println(answer);
			current = previous;
			previous = answer;

		}

		// in case we need to not use recurrsion then count =10; if(count>0){
		/*
		 * long[] fib = new long[n];
		 *  fib[0] = 1; 
		 *  fib[1] = 1; 
		 *  for (int i = 2; i < n; ++i)
		 * { fib[i] = fib[i - 2] + fib[i - 1]; } 
		 * return fib;
		 */

		//
	}

}
