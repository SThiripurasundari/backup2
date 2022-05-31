package com.samples.java8;

import java.util.*;
import java.util.Random;
import java.util.function.IntBinaryOperator;

public class SamplesJava8 {

	public static void main(String[] args) {

		Greeting greet = new Greeting() {

			public void print() {
				System.out.println("Test");
			}
		};

		greet.print();
		System.out.println(System.getProperty("java.runtime.version"));

		Greeting gree2 = () -> System.out.println("Lambda");
		gree2.print();

		IntBinaryOperator calculator = (int x, int y) -> {

			Random ran = new Random();
			return x + y + ran.nextInt(10);
		};

		System.out.println(calculator.applyAsInt(2, 4));

		IntBinaryOperator calculator2 = (int x, int y) -> {

			return x - y;
		};

		System.out.println(calculator2.applyAsInt(10, 4));

	}

}