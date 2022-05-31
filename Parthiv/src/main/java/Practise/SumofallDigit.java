package Practise;

public class SumofallDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int givenNUmber = 1982;

		int addThis = 0;

		while (givenNUmber != 0) {
			int temp = givenNUmber % 10;
			addThis = addThis + temp;
			System.out.println("addThis :" + temp);
			givenNUmber = givenNUmber / 10;
			System.out.println("givenNUmber2 :" + givenNUmber);

		}
		System.out.println("addThis :" + addThis);

	}

}
