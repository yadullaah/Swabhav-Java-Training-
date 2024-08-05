package com.test;

import java.util.Scanner;

public class InputStudentTest {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner (System.in);
	
	
	for (int i = 0; i<5 ; i++) {
		System.out.println("Enter roll number");
		int rollnumber = scanner.nextInt();
		
		System.out.println("Enter name");
		String name = scanner.next();
		
		System.out.println("Enter percentage");
		int percentage = scanner.nextInt();
		
	}
	
}
}
