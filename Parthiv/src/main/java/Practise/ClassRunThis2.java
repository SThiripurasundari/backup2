package Practise;

import java.io.IOException;

public class ClassRunThis2 extends ClassRunThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassRunThis2 thisClass2 = new ClassRunThis2();
		thisClass2.throwNull();
		
	}
	
	//not good practise 
	public  String throwNull () throws RuntimeException
	{
		System.out.println("all clear2 in class 2");
		return "";
		//throw new NullPointerException();
	}
	

	public String allClear() throws IOException  {
		System.out.println("all clear in class 2");
		return "";
	}
	
	void method() throws IOException {
		 
	    // IOException is of type Checked Exception
	    // so the compiler will give Error
	 
	    System.out.println("SubClass");
	  }

}
