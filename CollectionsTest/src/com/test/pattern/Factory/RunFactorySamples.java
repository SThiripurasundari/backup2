package com.test.pattern.Factory;

public class RunFactorySamples {
	
	

	public static void main(String[] args) {
		
		ChoclateFactory cho = new CandyFactory();
		ChoclateFactory gum = new GumFactory();
		cho.getChoclate("White").justPrint();
		cho.getChoclate("Dark").justPrint();
		gum.getChoclate("White").justPrint();
		gum.getChoclate("Dark").justPrint();
	   
		
	
		

	}

}
