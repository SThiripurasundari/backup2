package Practise;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * String first = "abc"; String second = "xyz";
		 * 
		 * System.out.println("second Before :"+second);
		 * System.out.println("first before :"+first); first = first +second;
		 * 
		 * second = first.substring(0, first.length() - second.length()); first =
		 * first.substring(second.length());
		 * 
		 * System.out.println("second :"+second); System.out.println("first :"+first);
		 */
		
		String first = "abcd";
		String second  = "xyz";
		System.out.println(second.length());
		
		first = first+second;
		System.out.println(first.length()-second.length());
		second = first.substring(0,first.length()-second.length());
		System.out.println(second.length());
		
		first = first.substring(second.length());
		
		System.out.println(" 777 "+first +second);
		
		
	}

}
