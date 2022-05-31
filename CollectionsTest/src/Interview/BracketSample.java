package Interview;

import java.util.Stack;

public class BracketSample {

	public static void main(String[] args) {

		System.out.println("Result :" + isValid("[()]{}{[()()]()}"));

	}

	public static boolean isValid(String s) {

		Stack st = new Stack<>();

		for (int i = 0; i < s.length(); i++) {

			Character ch = s.charAt(i);

			if (!st.isEmpty() && ch == '}' && (char) st.peek() == '{') {
				System.out.println("1    " + st.peek());
				st.pop();

			} else if (!st.isEmpty() && ch == ')' && (char) st.peek() == '(') {
				System.out.println("2   " + st.peek());
				st.pop();

			} else if (!st.isEmpty() && ch == ']' && (char) st.peek() == '[') {
				System.out.println("3   " + st.peek());
				st.pop();

			} else {
				st.push(ch);
				System.out.println("4   " + st.size());
			}

		}

		if (st.isEmpty()) {
			return true;
		}

		return false;
	}

}
