package com.samples;

public class FIbnocci2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int previous =0;
		int current =1;
		int answer =0;
		System.out.println(previous);
		System.out.println(current);
		for(int i=0;i<10;i++)
		{
			answer = previous + current;
			System.out.println(answer);
			previous = current;
			current = answer;
			
			
			
			
		}
		

	}

}
