
package Practise;

public class Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { -1, 0, 3, 5, 9, 12 };
		System.out.println(getPosition(nums, 12));
	}
	

	private static int getPosition(int[] nums, int target) {
		int l = nums.length;
		int t = 0;

		while (t < l) {

			if (nums[t] == target) {
				return t;

			}
			t++;
		}

		return -1;

	}

}
