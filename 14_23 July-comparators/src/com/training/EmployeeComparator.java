package com.training;

import java.util.Comparator;

public class EmployeeComparator {
	public static class NameComparator implements Comparator<Employee> {

		public int compare(Employee employee1, Employee employee2) {

			return employee1.getName().compareTo(employee2.getName());
		}

	}

	public static class EmployeeIDComparator implements Comparator<Employee> {

		@Override
		public int compare(Employee employee1, Employee employee2) {

			return employee1.getEmployeeId() - employee2.getEmployeeId();
		}

	}

	public static class SalaryComparator implements Comparator<Employee> {
		@Override
		public int compare(Employee employee1, Employee employee2) {

			return (int) (employee1.getSalary() - employee2.getSalary());

		}

	}

}
