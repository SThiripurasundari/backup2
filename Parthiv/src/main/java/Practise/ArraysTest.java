package Practise;

import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] arg1 = { { "T", "H", "I" }, { "T", "H", "I" } };
		String[][] arg2 = { { "T", "H", "I" }, { "T", "H", "J" } };
		boolean we = Arrays.deepEquals(arg1, arg2);

		System.out.println("1" + we);
		/*
		 * Arrays.sort(arg2); Arrays.sort(arg1);
		 * 
		 * for(int i=0;i<arg1.length;i++) { System.out.println("1"+arg1[i]);
		 * System.out.println("1"+arg2[i]);
		 * 
		 * }
		 * 
		 * 
		 * boolean reult = Arrays.equals(arg1, arg2); System.out.println("res"+reult);
		 */

		/*
		 * String[] s1 = {"java", "swings", "j2ee", "struts", "jsp", "hibernate"};
		 * 
		 * String[] s2 = {"java", "struts", "j2ee", "hibernate", "swings", "jsp"};
		 * 
		 * Arrays.sort(s1);
		 * 
		 * Arrays.sort(s2);
		 * 
		 * for(int i=0;i<s1.length;i++) { System.out.println("1"+s1[i]);
		 * System.out.println("1"+s2[i]);
		 * 
		 * }
		 * 
		 * System.out.println(Arrays.equals(s1, s2));
		 */
	}

}
