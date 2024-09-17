package com.test;

import java.util.Scanner;

import com.model.EmployeeModel;
public class EmployeeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	

		System.out.println("Employee 1");
		System.out.println("Enter Employee ID: ");
		int id=sc.nextInt();

		System.out.println("Enter Employee Name: ");
		String name=sc.next();

		System.out.println("Enter Employee Salary: ");
		int salary=sc.nextInt();
		
		EmployeeModel employee1=new EmployeeModel(id,name,salary);
		EmployeeModel employee2 = new EmployeeModel(id,name, salary);

//		System.out.println("Employee 2");
//		System.out.println("Enter Employee ID: ");
//		emp2.setEmployeeID(sc.nextInt());
//
//		System.out.println("Enter Employee Name: ");
//		emp2.setEmployeeName(sc.next());
//
//		System.out.println("Enter Employee Salary: ");
//		emp2.setEmployeeSalary(sc.nextInt());

		System.out.println("The Employee ID of " + employee1.getEmployeeName() + " is " + employee1.getEmployeeID()
				+ " and Salary is " + employee1.getEmployeeSalary());
		System.out.println("The Employee ID of " + employee2.getEmployeeName() + " is " + employee2.getEmployeeID()
				+ " and Salary is " + employee2.getEmployeeSalary());
	
	}
}
