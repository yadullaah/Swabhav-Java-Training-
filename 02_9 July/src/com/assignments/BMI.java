package com.assignments;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Weight in Kilograms");
		double weight = sc.nextDouble();

		System.out.println("Enter Height in metres");
		double height = sc.nextDouble();

		double bmi = weight / (height * height);

		System.out.println("Body Mass Index = " + bmi);
	}

}
