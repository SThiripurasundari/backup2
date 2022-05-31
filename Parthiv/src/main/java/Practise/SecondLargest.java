package Practise;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stu

		int[] intArry1 = { 88, 17, 10, 0, 75, 2, 90, 0, 6 };

		// Method1
		// Arrays.sort(intArry1);
		// System.out.println("Final Second Largest :" + intArry1[intArry1.length - 2]);

		// Method 2
		callArrayIterator(intArry1);

	}

	private static void callArrayIterator(int[] intArry) {

		int firstLarget;
		int secondLarget;

		if (intArry[0] > intArry[1]) {
			firstLarget = intArry[0];
			secondLarget = intArry[1];

		} else

		{
			firstLarget = intArry[1];
			secondLarget = intArry[0];

		}
		System.out.println("firstLarget:" + firstLarget + "secondLarget :" + secondLarget);

		for (int u = 2; u < intArry.length; u++) {
			System.out.println("intArry[u]--->" + intArry[u]);
			if (intArry[u] > firstLarget) {
				secondLarget = firstLarget;
				firstLarget = intArry[u];

			} else if (intArry[u] > secondLarget) {
				secondLarget = intArry[u];

			}

			System.out.println("firstLarget:" + firstLarget + "secondLarget :" + secondLarget);
		}

		System.out.println("Larget  :" + firstLarget + "second  Larget :" + secondLarget);
	}

}
