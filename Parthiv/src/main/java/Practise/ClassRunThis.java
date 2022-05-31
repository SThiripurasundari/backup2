package Practise;

import java.io.IOException;
import java.util.Optional;

public class ClassRunThis {

	public static void main(String[] args) {
		ClassRunThis thisClass1 = new ClassRunThis();
		ClassRunThis2 thisClass2 = new ClassRunThis2();
		//System.out.println("class :" + thisClass2.getClass());
		// thisClass1.allClear();
		// thisClass2.allClear();
		// thisClass1.allClear2();
		// thisClass2.allClear2();
		
		  String[] words = new String[10];
		  words[1] = null;
		  words[5] = "T";
		
	        Optional<String> checkNull = 
	                      Optional.ofNullable(words[5]);  
	        if (checkNull.isPresent()) {  
	            String word = words[5].toLowerCase();  
	            System.out.print(word);  
	        } else  
	            System.out.println("word is null");  

	}
	
	

	public String throwNull() throws NullPointerException {
		System.out.println("all clear2 in class 2");
		return "";
		// throw new NullPointerException();
	}

	public String allClear2() {
		System.out.println("all clear2 in class 2");
		return "";
	}

	public String allClear() {
		System.out.println("all clear in class 1");
		return "";
	}

	void method() {
		System.out.println("SuperClass");
	}

}
