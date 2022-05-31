package com.test.collectionSamples;

public class LargetSamllestinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sortThis[] = { -20, 34, 21, -87, 92 ,100,500,-500};
		int largest = 0;
		int smallest = 0;

		if (sortThis[0] > sortThis[1]) {
			largest = sortThis[0];
			smallest = sortThis[1];

		} else {
			smallest = sortThis[0];
			largest = sortThis[1];
		}

		for (int o = 2; o < sortThis.length; o++) {
			if (sortThis[o] > largest) {
				largest = sortThis[o];
			} else if (sortThis[o] < smallest) {

				smallest = sortThis[o];
			}

			
			System.out.println("large"+largest);
			System.out.println("small"+smallest);
		}

	}

}
