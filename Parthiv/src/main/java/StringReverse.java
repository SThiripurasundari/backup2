
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String reversethis = "yppah     yad";
		String reversed = "";

		char[] charst = reversethis.toCharArray();
		System.out.println(charst.length);
		for (int q = charst.length - 1; q >= 0; q--) {

			
			System.out.println(q + ":" + Character.toString(charst[q]));

			reversed = reversed + charst[q];

			// Character.toString(charst[q]);

		}
		// int i = aList.size() - 1; i >= 0; i--

		System.out.println("Yes Got it :" + reversed);

		StringBuilder sb = new StringBuilder(reversethis);
		sb.reverse();
		System.out.println("Using String Buffer:" + sb);

		
		
		
		
	}

	
}
