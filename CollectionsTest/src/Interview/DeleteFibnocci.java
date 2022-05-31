package Interview;

import java.util.Arrays;

public class DeleteFibnocci {

	public static void main(String[] args) {
		int[] output = { 0, 1, 1, 2, 3, 5, 8, 13 };

		/*
		 * int firstData = 0; int secondData = 1; int sum = 0;
		 * System.out.println(firstData); System.out.println(secondData); for (int x =
		 * 0; x < 10; x++) {
		 * 
		 * sum = firstData + secondData; System.out.println(sum);
		 * 
		 * firstData = secondData; secondData = sum;
		 * 
		 * }
		 */
		
		int[] outputData  = new int[8];
		outputData[0] =0;
		outputData[1] = 1;
		
		for(int t = 2;t<8;t++)
		{
			outputData[t] = 
					outputData[t-1]+
					outputData[t-2] ; 
			
			
		}
		
		
		System.out.println(""+Arrays.toString(outputData));
		
		
		

	}

}
