package com.clone.sample;

public class RunClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Student st2 = new Student("Anitha", "30");
		Employee st1 = new Employee(st2);

		System.out.println("St2 " + st1.getName());
		System.out.println("St2 " + st1.getAge());
	}

}
