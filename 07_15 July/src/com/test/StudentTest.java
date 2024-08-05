package com.test;
import java.util.Scanner;

import com.model.*;
public class StudentTest {
	public static void main(String[] args) {
		StudentModel student = new StudentModel ();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name");
		String name = sc.next();
		student.setname(name);

		System.out.println("Enter age");
		int age = sc.nextInt();
		student.setage(age);

		System.out.println("Enter percentage");
		double percentage = sc.nextDouble();
		student.setpercentage(percentage);
		
		
		System.out.println("Name is "+ student.getname() + " Age is "+
		student.getage() + " Percentage is "+ student.getpercentage()  );
		
		student.grade();

	}

}
