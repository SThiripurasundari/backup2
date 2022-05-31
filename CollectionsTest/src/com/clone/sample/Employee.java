package com.clone.sample;

public class Employee implements Cloneable {

	private String name;

	public Employee(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Employee(Student std) {
		super();
		this.name = std.getName();
		this.age = std.getAge();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	private String age;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
