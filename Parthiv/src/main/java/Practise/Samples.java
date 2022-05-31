package Practise;

public class Samples {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String test1= "TEST1";
		String test2= "TEST1";

		System.out.println("hashcode1-->"+test1.hashCode());
		System.out.println("hashcode2-->"+test2.hashCode());
	

		String test3 = new String("TEST1").toLowerCase();
		test1 = test1.toLowerCase();
		test2 = test2.toLowerCase();
		
		System.out.println("hashcode1-->"+test1.hashCode());
		System.out.println("hashcode2-->"+test2.hashCode());
		System.out.println("hashcode2-->"+test3.hashCode());

	}

}
