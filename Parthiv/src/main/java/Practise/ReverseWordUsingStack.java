package Practise;

import java.util.Stack;

public class ReverseWordUsingStack {

	public static void main(String[] args) {

		Stack<Character> stack = new Stack<Character>();
		String word = "Hello";
		char[] chars = word.toCharArray();

		System.out.println(reverse(word));

		int n = chars.length;

		for (char object : word.toCharArray()) {

			System.out.println("each word  :  " + object);
			stack.push(object);
		}

		System.out.println("size :  " + stack.capacity() + stack.size() + stack.toString());

		for (int t = 0; t < n; ++t) {

			System.out.println("REVERSED :  " + stack.pop());

		}

	}

	public static String reverse(String str) {
		char[] charArr = str.toCharArray();
		int size = charArr.length;
		Stack stack = new Stack();

		int i;
		for (i = 0; i < size; ++i) {
			stack.push(charArr[i]);
		}

		for (i = 0; i < size; ++i) {
			charArr[i] = (char) stack.pop();
		}

		return String.valueOf(charArr);
	}

}
