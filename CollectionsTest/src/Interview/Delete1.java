package Interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;

public class Delete1 {

	public static void main(String[] args) {

		getMinimumFromStack();

	}

	private static void getMinimumFromStack() {

		// ans should be 9
		//1 2 1 3 2 3 1 1 3
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(1);
		stack.push(3);
		stack.push(1);
		stack.push(1);
		stack.push(3);
		int minsofar = Integer.MAX_VALUE;

		for (int t = 0; t < stack.size(); t++) {
			int analyse = (Integer) stack.peek();

			if (analyse < minsofar) {
				minsofar = analyse;
				stack.pop();

			} else {
				continue;
			}

		}

		System.out.println("Minimum so far :" + minsofar);

	}

	private static void firstNonRepeatingChar() {

		String input = "zxvczbtxyzvy";
		char result;

		char[] charcters = input.toCharArray();

		for (int t = 0; t < charcters.length; t++) {

			String x = input.substring(t + 1, input.length());
			String y = String.valueOf(charcters[t]);

			if (!x.contains(y)) {

				System.out.println("Non Repeating " + y);
				result = charcters[t];
				break;

			}

		}

	}

	private static void formPigLatinWords() {
		String args = "aig Latin";
		String charSeq = "aeiou";
		String[] argsList = args.split("\\s");
		String temp;
		String endSentence = "";

		for (String eachWord : argsList) {

			String firstWord = eachWord.substring(0, 1);
			System.out.println("firstWord :" + firstWord);
			if (!charSeq.contains(firstWord)) {
				temp = eachWord.substring(1, eachWord.length()) + "-" + firstWord + "ay" + "   ";

				System.out.println("temp :" + temp);
				endSentence = endSentence + temp;
			} else {
				endSentence = eachWord + "  ";

			}

		}
		System.out.println("ENd  :" + endSentence);

	}

	private static void findPairForGivenNumber() {
		// N = 4, K = 6
		// arr[] = {1, 5, 7, 1} o/p =2

		int[] inputArray = { 10, 10, 2, 18, 20, 0 };
		int count = 0;
		int sum = 20;
		HashMap<Integer, Integer> map = new HashMap();

		for (int t = 0; t < inputArray.length; t++) {

			int x = inputArray[t];
			for (int p = t + 1; p < inputArray.length; p++) {

				if (x + inputArray[p] == sum) {

					System.out.println("NUmbers  :" + x + ":" + inputArray[p]);
					map.put(inputArray[p], x);
					count++;

				}

			}

		}

		System.out.println("Final count :" + count);
		Set s = map.keySet();
		Iterator<Integer> iter = s.iterator();

		while (iter.hasNext()) {

			iter.next();
		}

	}

	private static void seggreagetRBG() {
		// RBRGRGBBRGBGR

		String input = "RRGBRRBGGR";
		char[] inputInChar = input.toCharArray();
		int rPosition = 0;
		char temp;
		int currentPosition = 0;
		int GPosition = inputInChar.length - 1;

		while (currentPosition <= GPosition) {

			if (inputInChar[currentPosition] == 'R') {

				temp = inputInChar[rPosition];
				inputInChar[rPosition] = 'R';
				inputInChar[currentPosition] = temp;
				currentPosition++;
				rPosition++;

			} else if (inputInChar[currentPosition] == 'G') {

				temp = inputInChar[GPosition];
				inputInChar[GPosition] = 'G';
				inputInChar[currentPosition] = temp;
				GPosition--;

			} else {
				currentPosition++;
			}

		}
		System.out.println("Nd :" + Arrays.toString(inputInChar));

	}

	private static void swapKthElement() {

		// Given an array Arr of size N, swap the Kth element from beginning with Kth
		// element from end.
		/// 1 4 5 9 8 7 --> 1 8 5 9 4 7

		int[] input = { 1, 4, 5, 9, 8, 7 };
		int position = 2;

		int endPosition = input.length - position;

		int temp = input[position - 1];
		input[position - 1] = input[endPosition];
		input[endPosition] = temp;

		System.out.println("End :" + Arrays.toString(input));

	}

	private static void movingZeroToEndWithoutOrderChange() {
		int[] input = { 1, 0, 8, 9, 0, 0, 2, 7, 0, 10, 0 };
		int currentPtr = 0;
		int tempData = 0;
		int lastPositionOfZero = input.length - 1;

		while (currentPtr < lastPositionOfZero) {

			if (input[currentPtr] == 0) {

				int start = currentPtr;
				int end = lastPositionOfZero;

				while (start < end) {
					input[start] = input[start + 1];
					start++;

				}

				input[lastPositionOfZero] = 0;
				lastPositionOfZero--;
			} else {
				currentPtr++;
			}

		}

		System.out.println("End :" + Arrays.toString(input));

	}

	private static void movingZeroToEnd() {
		int[] input = { 1, 0, 8, 9, 0, 0, 2, 7, 0, 6, 6 };
		int currentPtr = 0;
		int tempData = 0;
		int start = 0;
		int lastPositionOfZero = input.length - 1;

		while (currentPtr < lastPositionOfZero) {

			if (input[currentPtr] == 0) {
				start = currentPtr;
				while (start < lastPositionOfZero) {
					input[start] = input[start + 1];
					start++;
				}
				input[lastPositionOfZero] = 0;
				lastPositionOfZero--;
			} else {
				currentPtr++;
			}

		}

		System.out.println("End :" + Arrays.toString(input));

	}

	private static void checkMissingNUmber() {

		int[] input = { 1, 1, 3, 4 };

		int lastNumber = input[input.length - 1];
		System.out.println("lastNumber :" + lastNumber);

		int[] outputArray = new int[lastNumber + 1];
		System.out.println("lenth :" + outputArray.length + Arrays.toString(outputArray));
		for (int y : input) {

			if (outputArray[y] >= 0) {

				outputArray[y] = outputArray[y] + 1;

			} else {

				outputArray[y] = 1;

			}
			System.out.println("lenth :" + Arrays.toString(outputArray));

		}

		System.err.println("output :" + Arrays.toString(outputArray));
		for (int i = 1; i < outputArray.length; i++) {
			if (outputArray[i] == 0) {
				System.out.println("missing " + i);
			} else if (outputArray[i] > 1) {
				System.out.println("dublicte :" + i);

			}
		}

	}

	private static void checkConsecNumber3() {
		String inputString = "1000,1001";
		boolean isCons = true;

		String[] strArray = inputString.split(",");
		int intData1 = Integer.parseInt(strArray[0]);

		for (int t = 1; t < strArray.length; t++) {
			System.out.println("intData1 :" + intData1);
			int intData2 = Integer.parseInt(strArray[t]);
			intData1++;
			System.out.println("intData2 :" + intData2);
			if (!(intData2 == intData1)) {

				isCons = false;
				break;

			}

			intData1 = intData2;

		}

		if (isCons)
			System.out.println("True");
		else
			System.out.println("False");

	}

	private static void checkConsecNumber2() {

		String inputString = "100102";
		boolean isCons = false;

		for (int t = 1; t < inputString.length(); t++) {

			String nextTempString = inputString.substring(0, t);
			int intValueOfTempString = Integer.parseInt(nextTempString);

			while (nextTempString.length() < inputString.length()) {
				intValueOfTempString++;
				nextTempString = nextTempString + String.valueOf(intValueOfTempString);
			}

			if (nextTempString.equals(inputString)) {
				isCons = true;
				break;

			}

		}

		if (isCons)
			System.out.println("True");
		else
			System.out.println("False");

	}

	public static void checkConsecNumber() {

		String inputStr = "123454";
		boolean isCons = false;

		for (int y = 1; y < inputStr.length(); y++) {

			String nextNumber = inputStr.substring(0, y);
			int intValueOfTempString = Integer.parseInt(nextNumber);

			while (nextNumber.length() < inputStr.length()) {
				intValueOfTempString++;
				nextNumber = nextNumber + String.valueOf(intValueOfTempString);
				System.out.println("Ans :" + nextNumber);
			}

			if (nextNumber.equals(inputStr)) {
				isCons = true;
				break;
			}

		}

		if (!isCons) {
			System.out.println("Not Cons ");

		} else {
			System.out.println("Yes they are Conse");

		}

	}

	public static void test2() {

		int[] intA = { 1, 12, 9, 45, 6, 10, 8 };
		int req = 46;
		HashMap<Integer, Integer> map = new HashMap();
		int data = 0;

		for (int t = 0; t < intA.length; t++) {

			data = req - intA[t];
			if (map.containsKey(intA[t])) {

				System.out.println(" Answer is :" + t + "and " + map.get(intA[t]));

			} else {
				map.put(data, t);
				System.out.println("map  " + map.toString());

			}
		}

	}

	public static void test1() {
		int[] input = { 2, 0, 2, 0, 1, 0, 0, 2, 0 };

		int lengthInput = input.length - 1;
		int zeroPosition = 0;
		int currentPosition = 0;
		int tempData = 0;

		while (currentPosition <= lengthInput) {
			if (input[currentPosition] == 1) {
				currentPosition++;

			} else if (input[currentPosition] == 2) {
				tempData = input[lengthInput];
				input[lengthInput] = input[currentPosition];
				input[currentPosition] = tempData;
				lengthInput--;

			} else

			{

				tempData = input[zeroPosition];
				input[zeroPosition] = input[currentPosition];
				input[currentPosition] = tempData;
				zeroPosition++;
				currentPosition++;

			}

		}

		System.out.println("input after " + Arrays.toString(input));

	}

}
