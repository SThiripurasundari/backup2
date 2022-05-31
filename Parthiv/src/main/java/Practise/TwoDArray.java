package Practise;

public class TwoDArray {

	public static void main(String[] args) {  
	    int[][] arr = new int[3][3];  
	   String test = "QAW";
	    for (int i =0;i<3;i++)  
	    {  
	        for(int j=0;j<3;j++)  
	        {  
	            System.out.print("Enter Element");  
	            arr[i][j]=sc.nextInt();  
	            System.out.println();  
	        }  
	    }  
	    System.out.println("Printing Elements...");  
	    for(inti=0;i<3;i++)  
	    {   
	        System.out.println();  
	        for(intj=0;j<3;j++)  
	        {  
	            System.out.print(arr[i][j]+"\t");  
	        }  
	    }  
	}  
}
