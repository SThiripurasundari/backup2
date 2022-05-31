package Practise;

public class GenericsWxample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Integer[] intList = { 12, 14, 11, 19, 10 }; String[] strList = { "", "", "",
		 * "" }; int x = 0; x = countGreaterThan(intList, 13); stringComp(strList, "");
		 * System.out.println("x:" + x);
		 */

		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.println("Array integerArray contains:");
		printArray(doubleArray); // pass an Integer array

	}

	public static <M> void printArray(M[] inputArray) {
		// Display array elements
		for (M element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

	public static <W extends Comparable<W>> int countGreaterThan(W[] List, W elem) {
		int count = 0;
		for (W elements : List) {
			if (elements.compareTo(elem) > 0) {
				count++;
			}
		}
		return count;
	}
	
}
