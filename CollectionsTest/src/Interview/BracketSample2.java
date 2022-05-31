package Interview;

import java.util.Stack;

public class BracketSample2 {

	public static void main(String[] args) {
		String input = "[()]{}{[()()()]}";

		Stack<Character> stack = new Stack<Character>();

		for (int t = 0; t < input.length(); t++) {
			Character ch = input.charAt(t);

			if (ch == '{' || ch == '[' || ch == '(') {
				stack.push(ch);

			} else {

				if (ch == '}' && stack.peek() == '{') {
					stack.pop();
				} else if (ch == ']' && stack.peek() == '[') {
					stack.pop();
				} else

				if (ch == ')' && stack.peek() == '(') {
					stack.pop();
				}

			}

		}

		if (stack.isEmpty()) {
			System.out.println("Is  matching");

		} else {
			System.out.println("Is not matching");

		}

	}

}
