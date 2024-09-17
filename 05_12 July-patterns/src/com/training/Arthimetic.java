package com.training;

import java.util.Scanner;

public class Arthimetic {
	public static void main(String[] args) {

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

	private static int division(int a, int b) {
		return a / b;
	}

	private static int multiplication(int a, int b) {
		return a * b;
	}

	private static int substraction(int a, int b) {

		return a - b;
	}

	private static int addition(int a, int b) {
		return a + b;

	}

}
