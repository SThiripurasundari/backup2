package Practise;

public class LongestCommonSubstringMain {

	
	public static void main(String[] args) {
		
		String str1="grace";
		String str2="graceful";
		LongestCommonSubstringMain lcsMain=new LongestCommonSubstringMain();
		System.out.println("String 1: "+str1);
		System.out.println("String 2: "+str2);
		System.out.println("Longest common subString is: " +lcsMain.getLongestCommonSubstring(str1, str2));

	}
	public String getLongestCommonSubstring(String str1, String str2){
		String returnTHis = "";
		int m = str1.length();
		int n = str2.length();
		
		System.out.println("Length M: "+m);
		System.out.println("Length N :"+n);
			
		int max = 0;

		int[][] dp = new int[m][n];

		System.out.println("dp "+dp.length);
		int endIndex=-1;
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				if(str1.charAt(i) == str2.charAt(j)){
					System.out.println("str1.charAt(i): "+str1.charAt(i) + " i :"+i);
					System.out.println("str1.charAt(j): "+str2.charAt(j) + " j :"+j);
					// If first row or column
					if(i==0 || j==0){
						
						dp[i][j]=1;
						System.out.println("dp[i][j]): "+dp[i][j]);
						
					}else{
						// Add 1 to the diagonal value
						dp[i][j] = dp[i-1][j-1]+1;
						
						System.out.println("dp[i][j] else : "+dp[i][j]);
					}
					System.out.println("max "+max);
					if(max < dp[i][j])
					{
						System.out.println("inside max<dp[]i");
						max = dp[i][j];
						endIndex=i;
					}
				}

			}
		}
		
		System.out.println("endIndex : "+endIndex);
		System.out.println("max : "+max);
		
//		System.out.println("endIndex-max+1 : "+endIndex-max+1);
		returnTHis = str1.substring(endIndex-max+1,endIndex+1);
		System.out.println("returnTHis: "+returnTHis);
		// We want String upto endIndex, we are using endIndex+1 in substring.
		return returnTHis;
	}
}
