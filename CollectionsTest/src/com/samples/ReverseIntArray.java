package com.samples;

public class ReverseIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4562;
		int rev_num = 0;
		while (num > 0) {
			rev_num = rev_num * 10 + num % 10;
			System.out.println(rev_num);
			num = num / 10;
			System.out.println(num);
		}
		System.out.println(rev_num);

	}

}
