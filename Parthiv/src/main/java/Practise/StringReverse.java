package Practise;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String reversethis = "yppah sey mA";
		String[] strArray = reversethis.split("\\s");

		String reversed = "";
		for (int i = 0; i < strArray.length; i++) {
			reversed = reversed + "  " + reverseThis(strArray[i]);

			System.out.println("Sentence Reversed :" + reversed);
		}

	}

	private static String reverseThis(String reversethis) {
		String reversed = "";

		System.out.println("reversethis : " + reversethis);

		char[] charst = reversethis.toCharArray();
		System.out.println(charst.length);
		for (int q = charst.length - 1; q >= 0; q--) {

			System.out.println(q + ":" + Character.toString(charst[q]));

			reversed = reversed + Character.toString(charst[q]);

		}

		System.out.println("Yes Got it :" + reversed);
		return reversed;
	}

}
