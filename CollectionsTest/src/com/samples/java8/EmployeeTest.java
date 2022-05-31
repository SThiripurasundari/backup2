package com.samples.java8;

public class EmployeeTest {

	public static void main(String[] args) {

		EmployeeUtils utils = new EmployeeUtils();

		Employee empl = new Employee();
		empl.setFirstName("TS");
		empl.setLastName("Selv");

		String actual = utils.getFullName(empl);

		if (actual.equals("TSSelv")) {
			System.out.println("True");

		} else {

			System.out.println("False");

		}
		
		
		empl.setYearsOfService(1);
		
		if (utils.hasEmployeeLongerThan5(empl)) {
			System.out.println("True");

		} else {

			System.out.println("False");

		}
		if (utils.hasEmployeeLongerThan5(empl)) {
			System.out.println("True");

		} else {

			System.out.println("False");

		}
		
		

	}

}
