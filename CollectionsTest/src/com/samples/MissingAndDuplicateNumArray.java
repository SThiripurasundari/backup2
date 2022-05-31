package com.samples;

import java.util.Arrays;

public class MissingAndDuplicateNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = { 1, 1, 3, 4 };
		Arrays.sort(input);
		int size = input.length;
		
		int data = input[size-1];
		System.out.println("i length :" + data);
		int[] register = new int[data];

	
		for (int i : input) {
			//System.out.println("i :" + i);

			if(register[i] >= 1)
			{
				System.out.println("isndie  :" + register.toString());
				register[i] = register[i]+1;
				
			}
			else
			register[i] = 1;
		

		}
		System.out.println("missing numbers in given array");

		for (int i = 1; i < register.length; i++) {
			if (register[i] == 0) {
				System.out.println("missing "+i);
			}else if (register[i] > 1) 
			{
				System.out.println("dublicte :"+i);
				
			}
		}
	}

}
