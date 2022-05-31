package Practise;

public class Palindrome2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		String str = "ANIINA";
		String rev = "";
		int Character;
		System.out.println("str.length() :" + str.length());

		for (int t = str.length() - 1; t >= 0; t--) {
			System.out.println(" t:" + t);
			char c = str.charAt(t);
			System.out.println("c :" + c);
			System.out.println("rev 1:" + rev);
			rev = rev + String.valueOf(c);
			System.out.println("rev 2:" + rev);

		}
		if (str.equals(rev)) {

			System.out.println("equal");
		} else {

			System.out.println("notequal");
		}

	}

}
