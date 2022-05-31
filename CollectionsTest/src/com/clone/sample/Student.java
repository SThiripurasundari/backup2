package com.clone.sample;

public class Student implements Cloneable {

	public Student(String name, String age) {
		super();
		this.name = name;
		this.age = age;
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

	private String name;
	private String age;

	@Override
	protected Employee clone() throws CloneNotSupportedException {
		Employee emp = new Employee(this.name, this.age);
		//return (Employee) super.clone();
		return emp;
	}
}
