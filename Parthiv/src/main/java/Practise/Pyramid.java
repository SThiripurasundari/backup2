package Practise;

public class Pyramid {

	public static void main(String[] args) {

		int noOfRows = 5;

		// Initializing rowCount with 1

		int rowCount = 1;

		System.out.println("Here Is Your Pyramid");

		// Implementing the logic

		for (int i = noOfRows; i > 0; i--) {
		

			// Printing i spaces at the beginning of each row
			// System.out.println("noOfRows"+i);

			for (int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}

			// Printing 'rowCount' value 'rowCount' times at the end of each row
			// System.out.println("rowCount:"+rowCount);
			for (int j = 1; j <= rowCount; j++) {
				System.out.print(rowCount +" ");
			}

			System.out.println();

			// Incrementing the rowCount

			rowCount++;
		}
	}

}
