package com.training;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int number = sc.nextInt();

		calculateFactorial(number);

		if (number < 0) {
			System.out.println("Cannot  calculate factorial of negatives");
		}

	}

	private static int calculateFactorial(int number) {

		if (number == 0)
			return 1;

		int factorial = 1;
		for (int i = 0; i < number; i++) {
			factorial *= i;
		}
		return factorial;

	}
}
