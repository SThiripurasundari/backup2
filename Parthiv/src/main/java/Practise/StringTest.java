package Practise;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String first = "Name";
		String second = "Name";

		String three = first;

		first = "kumar";

		System.out.println("first " + first);
		System.out.println("second " + second);

		if (three.equals(second.trim())) {
			System.out.println("equals");
		}

		if (three == (second).trim()) {
			System.out.println("++ ");
		}

	}

}
