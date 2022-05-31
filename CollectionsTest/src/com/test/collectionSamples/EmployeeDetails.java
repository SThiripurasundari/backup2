package com.test.collectionSamples;

import java.util.Objects;

public class EmployeeDetails implements Comparable<EmployeeDetails> {

	private int id;
	private String name;

	@Override
	public int hashCode() {

		int hash = Objects.hash(id, name);
		System.out.println("hash value i am called ");
		//return hash;
	return 100;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDetails other = (EmployeeDetails) obj;
		System.out.println("inside equal :" + other.id + "  : id :" + id);
		return id == other.id && Objects.equals(name, other.name);
	}

	public EmployeeDetails(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(EmployeeDetails o) {


		return this.getName().compareTo(o.getName());
		/*
		 * if (this.getId() < o.getId()) {
		 * 
		 * return -1; } else if (this.getId() > o.getId()) {
		 * 
		 * return 1; } else return 0;
		 */
	}


	
}
