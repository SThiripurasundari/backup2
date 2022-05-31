package com.samples;

public class SortingIntMethod1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] data = { 1, 2, 1, 0, 0, 0, 1, 0 };

		int temp;
		// int i=0;
		int nzReplAt = 0;
		int end = data.length - 1;

		for (int i = 0; i < data.length; i++) {
			if (data[i] == 0) {
				temp = data[i];
				data[i] = data[nzReplAt];
				data[nzReplAt] = temp;
				// i++;
				nzReplAt++;

			}/* else if (data[i] == 2) {
				temp = data[i];
				data[i] = data[end];
				data[end] = temp;
				// i++;
				end--;

			}*/

		}

		for (int t = 0; t < data.length; t++) {

			System.out.println(+data[t]);

		}

	}

}
