package com.samples.java8;

interface Parser {

	String parse(String str);

}

class MyPrinter {

	public void print(String str, Parser p) {
		System.out.println("Ans ->" + p.parse(str));
	}

}

class StringParser {
	public static String convert(String s) {
		if (s.length() <= 3) {
			s = s.toUpperCase();
		} else {

			s = s.toLowerCase();
		}
		return s;

	}

	public static String convert2(String s) {
		if (s.length() <= 3) {
			s = s.substring(0, 3);
		} else {

			s = s.substring(1, 3);
		}
		return s;

	}

}

public class PrintExample {

	public static void main(String[] args) {

		String str = "Antha TS";
		MyPrinter printer = new MyPrinter();

		// ano class
//		printer.print(str, new Parser() {
//
//			@Override
//			public String parse(String str) {
//				return StringParser.convert(str);
//			}
//		});

		// step 2
		printer.print(str, s -> StringParser.convert(str));

		// step 3
		printer.print(str, (StringParser::convert2));

	}

}
