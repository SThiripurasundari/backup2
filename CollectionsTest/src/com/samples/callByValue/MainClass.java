package com.samples.callByValue;

public class MainClass {

	public static void main(String[] args) {
		
		
		// Access to all attributes and methods in parent 
		ParentClass p1 = new ParentClass();
		p1.parentInt = 10;
		p1.changeValueofIntinParent(100);
		p1.commonMethod();
	
		// Access to all attributes and methods in parent + overridden method of parent in child
		ParentClass p = new ChildClass();
		p.parentInt = 10;
		p.changeValueofIntinParent(100);
		p.commonMethod();// calls the child method
	
		
		
		//access to all attributes of parent and child 
		ChildClass c1 = new ChildClass();
		c1.childInt = 23;
		c1.parentInt = 34;
		c1.changeValueofIntinParent(0);
		c1.changeVlaueofChild(0);
		c1.commonMethod();
		c1.getName();

		
		//ChildClass c2 = (ChildClass) p;  -- This will throw runtime exception
		// Create child assign to parent and again assign to child
		ChildClass c2 = (ChildClass) p;
		c2.childInt = 10;
		c2.parentInt = 100;
		c2.changeValueofIntinParent(0);
		c2.changeVlaueofChild(0);
		c2.commonMethod();

	}

}
