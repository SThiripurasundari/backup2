package com.samples;

import java.util.HashMap;
import java.util.Map;

//what two numbers when added give the target number 
public class findNumberPositionUsingDelta {

	public static void main(String[] args) {

		int expected = 9;
		int[] findFromThis = { 2, 3, 7, 4, 8 };
		int[] result = getTowSum(findFromThis, expected);
		 System.out.println("result" + result.toString());
		 System.out.println("result[0] :" + result[0] + "- result[1] :" + result[1]);

		// onemore approach
		//test1();

	}

	private static void test1() {
		int[] findFromThis = { 2, 3, 7, 4, 3 };
		int target = 9;
		Map<Integer, Integer> numberMap = new HashMap();
		for (int i = 0; i < findFromThis.length; i++) {
			numberMap.put(findFromThis[i], i);

		}

		for (int i = 0; i < findFromThis.length; i++) {
			int delta = target - findFromThis[i];
			if (numberMap.containsKey(delta)) {

				System.out.println("i" + i + ":" + numberMap.get(delta));
				// System.out.println("target :" +numberMap.get(delta)+findFromThis[i]);
			}

		}

	}

	public static int[] getTowSum(int[] findFromThis, int expected) {
		int delta;

		//	int[] findFromThis = { 2, 3, 7, 4, 8 };
		Map<Integer, Integer> numberMap = new HashMap();

		for (int i = 0; i < findFromThis.length; i++) {

			delta = expected - findFromThis[i];
			System.out.println("delta -" + delta);
			System.out.println("findFromThis[i] -" + findFromThis[i]);

			if (numberMap.containsKey(delta)) {
				System.out.println("Inside if");

				return new int[] { i, numberMap.get(delta) };

			}
			numberMap.put(findFromThis[i], i);
			System.out.println("MAp-->" + numberMap);
		}
		return new int[] { -1, 1 };
	}

}
