package com.sample.Exceptions;

public class ExceThrowingClass extends Exception{
	
	

	public ExceThrowingClass() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ExceThrowingClass(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	

	public String getMessage() {
		try {

			int x = 5 / 0;

		} catch (ArithmeticException exc) {

			//throw new Exception();
		}
		return "";
	}

}
