package com.assignments;

import java.util.Scanner;

public class POCArithmeticOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number");
		double number1 = sc.nextDouble();

		System.out.println("Enter second number");
		double number2 = sc.nextDouble();

		System.out.println("Addition of given numbers = " + (number1 + number2));

		System.out.println("Substraction of given numbers = " + (number1 - number2));

		System.out.println("Multiplication of given numbers = " + (number1 * number2));

		System.out.println("Division of given numbers = " + (number1 / number2));

		System.out.println("Modulus of given numbers = " + (number1 % number2));

		// increment of number 1 and number 2

		number1++;
		System.out.println("Incremented value of first number is " + number1);

		number2++;
		System.out.println("Incremented value of second number is " + number2);

		// decrement of number 1 and number 2

		number1--;
		number1--;
		System.out.println("Decremented value of first number is " + number1);

		number2--;
		number2--;
		System.out.println("Decremented value of second number is " + number2);

	}

}
