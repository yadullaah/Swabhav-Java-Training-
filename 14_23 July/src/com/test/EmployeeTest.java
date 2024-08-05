package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.training.Employee;
import com.training.EmployeeComparator;
import com.training.Student;
import com.training.StudentComparator;

public class EmployeeTest {
	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee(5, "Subodh", 65000));
		employees.add(new Employee(1, "Yadullah", 90000));
		employees.add(new Employee(4, "Shubham", 70000));
		employees.add(new Employee(2, "Suhas", 85000));
		employees.add(new Employee(3, "Swabhav", 75000));

		System.out.println("Students not sorted");
		printemployees(employees);

		System.out.println();

		System.out.println("Students sorted according to Name");
		Collections.sort(employees, new EmployeeComparator.NameComparator());
		printemployees(employees);

		System.out.println();

		System.out.println("Students sorted according to Employee ID");
		Collections.sort(employees, new EmployeeComparator.EmployeeIDComparator());
		printemployees(employees);

		System.out.println();

		System.out.println("Students sorted according to Salary");
		Collections.sort(employees, new EmployeeComparator.SalaryComparator());
		printemployees(employees);

	}

	private static void printemployees(List<Employee> employees) {

		for (Employee employee : employees)
			System.out.println(employee);
	}

}
