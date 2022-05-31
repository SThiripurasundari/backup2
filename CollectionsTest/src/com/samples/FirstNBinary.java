package com.samples;

import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

public class FirstNBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pass = "test";
		char[] passChar = pass.toCharArray();
		boolean isDigi = Character.isDigit(passChar[0]);

		printBinary(10);

	}

	public static void printBinary(int n) {
		if (n <= 0) {
			System.out.println("nothing to print");
			return;
		}

		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);

		for (int i = 1; i <= n; i++) {

			Integer current = queue.remove();
			System.out.println("current :" + current);
			queue.add(current * 10);
			queue.add(current * 10 + 1);
			System.out.println("queue :" + queue.toString());
		}
		System.out.println("");

	}

}
