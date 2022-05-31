package com.samples.java8;

public class Employee {

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getYearsOfService() {
		return yearsOfService;
	}
	public void setYearsOfService(int yearsOfService) {
		this.yearsOfService = yearsOfService;
	}
	public int getNumberofDirectReportee() {
		return numberofDirectReportee;
	}
	public void setNumberofDirectReportee(int numberofDirectReportee) {
		this.numberofDirectReportee = numberofDirectReportee;
	}
	public Employee getManager() {
		return manager;
	}
	public void setManager(Employee manager) {
		this.manager = manager;
	}
	private String firstName;
	private String lastName;

	private int yearsOfService;
	private int numberofDirectReportee;
	private Employee manager;
	

}
