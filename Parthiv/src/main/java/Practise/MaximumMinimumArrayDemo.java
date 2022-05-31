package Practise;

public class MaximumMinimumArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] xyz = new int[] { -20, 34, 21 };
		 largestAndSmallest(xyz);

		// double squareRoot = Math.sqrt(64);
		// System.out.println("number"+squareRoot);
	}

	public static void largestAndSmallest(int[] numbers) {
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		for (int number : numbers) {
			System.out.println("number" + number);
			if (number > largest) {
				largest = number;
				System.out.println("largest  :" + largest);
			}

			if (number < smallest) {
				smallest = number;
				System.out.println("smallest   :" + smallest);
			}

		}

		System.out.println("Final larget  :" + largest);
		System.out.println("final smallest :" + smallest);
	}

}
