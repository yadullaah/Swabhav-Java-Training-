package com.assignments;

import java.util.Scanner;

public class AreaOfTrapezoid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter length of first base");
		int base1 = sc.nextInt();

		System.out.println("Enter length of second base");
		int base2 = sc.nextInt();

		System.out.println("Enter height of trapezoid");
		int height = sc.nextInt();

		double area = ((base1 + base2) / 2) * height;

		System.out.println("Area of Trapezoid = " + area);
	}
}