package com.samples;

public class Arrange101 {

	public static void method12Iteration() {

		int[] data = { 1, 0, 1, 0, 1, 0, 1, 0, };

		int temp = 0; // Temporary variable to store the element

		for (int i = 0; i < data.length - 1; i++) // Holds each Array element
		{
			for (int j = i + 1; j < data.length; j++) // compares with remaining Array elements
			{
				if (data[i] > data[j]) // Compare and swap
				{
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}

		}

		for (int t = 0; t < data.length; t++) {

			System.out.print(+data[t]);

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data2 = { 1, 1, 1, 0, 0 };

		 method12Iteration();
		// sort012(data2);
	}

	// int[] data2 = { 1, 0, 1, 0 };
	public static void sort012(int arr[]) {
		int i = 0, nz = 0, nt = arr.length - 1;
		while (i <= nt) {
			if (arr[i] == 0) {
				int temp = arr[i];
				arr[i] = arr[nz];
				arr[nz] = temp;
				int tempi = i;
				i++;
				nz++;
				System.out.println("In loop data == 0 and i value is " + tempi + "   and  nz is  " + nz);

				for (int t = 0; t < arr.length; t++) {

					System.out.println(+arr[t]);

				}
			}

			else if (arr[i] == 2) {
				int temp = arr[i];
				arr[i] = arr[nt];
				arr[nt] = temp;
				nt--;
			} else {

				for (int t = 0; t < arr.length; t++) {

					System.out.println("-------" + arr[t]);

				}
				i++;
			}
		}

	}

}
