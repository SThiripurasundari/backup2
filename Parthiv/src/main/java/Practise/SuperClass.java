
package Practise;

public class SuperClass {

	public static void main(String args[]) {

		SuperClass superclass =  new SuperClass();
		SuperClass subclass = new SubClass();
		
		superclass.method();
		subclass.method();
		
		superclass.method2();
		subclass.method2();
		
		
		
		
	}
	public static void method() {
		System.out.println("SuperClass");
	}

	public void method2() {
		System.out.println("Method-2 of the Super class is executed.");
	}

}
