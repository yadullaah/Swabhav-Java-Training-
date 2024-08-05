package com.test;

import java.util.Scanner;

public class MultipleMethods {

	public static void main(String[] args) {
		// int x = 10;
		// byte y = (byte) (x +10+ 10.5);
		// System.out.println(y);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();

		System.out.println("The sum is :" + (addition(a, b)));
		System.out.println("The difference is :" + (substraction(a, b)));
		System.out.println("The sum is :" + (multiplication(a, b)));
		System.out.println("The sum is :" + (division(a, b)));

	}

	public static int division(int a, int b) {
		multiplication(a, b);
		return a / b;
	}

	public static int multiplication(int a, int b) {

		return a * b;
	}

	public static int substraction(int a, int b) {
		division(a, b);
		return a - b;
	}

	public static int addition(int a, int b) {
		substraction(a, b);
		return a + b;

	}
}
