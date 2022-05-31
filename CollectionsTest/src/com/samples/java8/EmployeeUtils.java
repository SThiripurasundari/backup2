package com.samples.java8;

import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeUtils {

	public String getFullName(Employee empl) {

		return empl.getFirstName() + empl.getLastName();
	}

	public String getFullName2(Employee empl) {

		Function<Employee, String> fullname = (Employee e) -> e.getFirstName() + e.getLastName();

		return fullname.apply(empl);
	}
	public boolean getFullName3(Employee empl) {

		Function<Employee, Boolean> fullname = (Employee e) -> e.getYearsOfService() > 5;

		return fullname.apply(empl);
	}

	public boolean hasEmployeeLongerThan5(Employee ee) {

		Predicate<Employee> longerThanFive = (Employee e) -> e.getYearsOfService() > 5;

		return longerThanFive.test(ee);
	}

}
