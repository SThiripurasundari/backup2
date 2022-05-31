package com.samples;

public class SampleJavaConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String t = "100";
		System.out.println("1 :"+Integer.parseInt(t));
		System.out.println("1 :"+Integer.valueOf(t));
		
		int i=200;  
		String s=String.valueOf(i);  
		System.out.println(s+100);
		
		//Long String
		String s1="9990449935";  
		long l=Long.parseLong(s1);  
		System.out.println(l);  
		
		
		String s3="hello";    
		for(int j=0; j<s3.length();j++){  
		        char c = s3.charAt(j);  
		        System.out.println("char at "+j+" index is: "+c);  
		}   
		String s4="hello";    
		char[] ch=s4.toCharArray();    
		for(int k=0;k<ch.length;k++){    
		System.out.println("char at "+k+" index is: "+ch[k]);   
		}  
		
		
		char c='S';  
		String s5=String.valueOf(c);  
		System.out.println("String is: "+s5);  
		
	}

}
