package com.diamondIssue;

public interface InterFace2 {
	
	default void methodInInter()
	{
		
		System.out.println("I am in methodInInterface2");
	}
	
	 void methodInInterface1();
	 void methodInInterface2();


}
