package Practise;

public class LongestSubstring {

	public static void main(String[] args) {
		String arr[] = { "gab", "ab", "abc" };

		// Function call
		String stems = findstem(arr);
		System.out.println(stems);

	}

	public static String findstem(String arr[]) {
		// Determine size of the array
		int n = arr.length;

		System.out.println("n :" + n);

		// Take first word from array as reference
		String s = arr[0];
		int len = s.length();

		// going to hold result
		String result = "";

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j <= len; j++) {

				// generating all possible substrings
				// of our reference string arr[0] i.e s
				String stem = s.substring(i, j);

				System.out.println(" ---------------------------------------------------- ");

				System.out.println(" Substring formed  : " + stem);
				int k = 1;
				for (k = 1; k < n; k++) {
					// Check if the generated stem is
					// common to all words
					System.out.println(" Next Word in Array :" + arr[k]);
					if (!arr[k].contains(stem)) {
						System.out.println("Substring formed is not present in array of words " + k);
						break;
					}
					System.out.println(" k " + k);
				}

				// If current substring is present in
				// all strings and its length is greater
				// than previous result formed
				System.out.println("res length " + result);
				System.out.println("Stem length " + stem);
				System.out.println("K :" + k + ":" + "n :" + n);
				// IMPORTANT : to check if the stem formed is present in all the rest of words
				// of array then only k=n [n = no of words in array , k the iterator
				if (k == n && result.length() < stem.length()) {
					System.out.println("yes inide  " + k + ":" + n);
					result = stem;
				}
			}

		}
		return result;
	}
}
