package Practise;

import java.util.ArrayList;

import javax.management.StringValueExp;

public class SubString {
	
	public boolean name = false;
	public String finalString = "";
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String first = "ABCDEFAB";
		String second = "XYZABCGHAB";
		ArrayList firstList = returnList(first);
		ArrayList secondList = returnList(second);

		String longestSubstring = compareLIst(firstList, secondList);
		System.out.println("longestSubstring " + longestSubstring);

	}

	private static String compareLIst(ArrayList firstList, ArrayList secondList)

	{
		char firstListChar;
		char secListChar;
		String firstString;
		String secondString = null;
		String returnThis = "";
		for (int i = 0; i < firstList.size(); i++) {
			firstString = String.valueOf(firstList.get(i));
			System.out.println(" firstString:" + firstString);
			
			if(returnCompare(firstString, secondString))
			for (int j = 0; j < secondList.size(); j++) {
				secondString = String.valueOf(secondList.get(j));
				System.out.println(" secondString:" + secondString);
				if (returnCompare(firstString, secondString)) {
					System.out.println("They are equal");
					returnThis = returnThis + firstString;
					i = i + 1;
					j = j + 1;

					if (returnCompare(String.valueOf(firstList.get(i)), String.valueOf(secondList.get(j)))) {

						returnThis = returnThis + String.valueOf(firstList.get(i + 1));

					}

				}

				System.out.println(" -------------------");
			}

		}
		return returnThis;

	}

	private static boolean returnCompare(String one, String two) {

		boolean returnCompare = false;
		returnCompare = one.equals(two);

		return returnCompare;
	}

	
	
	
	private static ArrayList returnList(String covToArray) {
		ArrayList firstList = new ArrayList();
		char invdChar;
		for (int i = 0; i < covToArray.length(); i++) {

			invdChar = covToArray.charAt(i);
			firstList.add(invdChar);

		}

		System.out.println("StringToArray :" + firstList.toString());

		return firstList;

	}

}
