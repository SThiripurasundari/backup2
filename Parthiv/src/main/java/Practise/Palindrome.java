package Practise;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ANIINA";
		/*
		 * StringBuilder sb=new StringBuilder(str); sb.reverse();
		 * System.out.println("2 :"+sb);
		 * 
		 * String rev=sb.toString(); System.out.println("3 : "+rev);
		 * 
		 * if(str.equals(rev)){ System.out.println("equal"); }else{
		 * System.out.println("not equal"); }
		 */

		// String differntMethod = reverse(str);

		String differntMethod = method2(str);
		System.out.println("final:" + differntMethod);
		if (str.equals(differntMethod)) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}

	}

	public static String method2(String input) {
		String resutStr = "";

		char[] charArray = input.toCharArray();
		int r = charArray.length - 1;
		System.out.println("charArray :" + r);

		for (int i = r; i >= 0; i--) {
			System.out.println("charArray :" + charArray[i]);

			resutStr = resutStr + charArray[i];

			System.out.println("resutStr :" + resutStr);

		}

		return resutStr;
	}

	public static String reverse(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}
		String returnValue = "";
	
		returnValue = input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() - 1));

		return returnValue;

	}

}
