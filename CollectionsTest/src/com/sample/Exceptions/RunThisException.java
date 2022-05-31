package com.sample.Exceptions;

public class RunThisException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExceThrowingClass exClass = new ExceThrowingClass();
		
		try {
			exClass.getMessage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}
