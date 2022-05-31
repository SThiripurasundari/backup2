package com.samples;

public class TestingSampes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int sum = TestingSampes.sum(3, 4);
		System.out.println("" + sum);*/
		
		int sum2 = TestingSampes.sum2(7, 4);
		System.out.println("" + sum2);
	}

	public static int sum(int a, int b) {
		for (int i = 1; i <= b; i++, a++);
		return a;
	}

	
	public static int sum2(int a, int b) {
		int val1 = a ^ b;
		System.out.println("val1 ;"+val1);
		int val2 = (a & b) << 1;
		System.out.println("val2 ;"+val2);
		int value = val1 + val2;
		return value;
	}
}
