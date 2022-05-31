package com.samples;

import java.util.jar.Attributes.Name;

class Student implements Cloneable{  
    int rollno;  
    String name;  
    static String college = "ITS";  
    //static method to change the value of static variable  
    static void change(){  
    college = "BBDIT";  
   
    }  
    //constructor to initialize the variable  
    Student(int r, String n){  
    rollno = r;  
    name = n;  
    }  
    //method to display values  
    void display(){System.out.println(rollno+" "+name+" "+college);} 
    
    @Override
    public Student clone()
    {
    	Student st = null ;
    	try {
			 st =  (Student)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return st;
    }
    
}  