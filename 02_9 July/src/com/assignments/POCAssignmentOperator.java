package com.assignments;

import java.util.Scanner;

public class POCAssignmentOperator {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First number");
		int number1 = sc.nextInt();
		System.out.println("Enter Second number");
		int number2 = sc.nextInt();
		number1 += number2;
		System.out.println("Compound Addition : " + number1);

		System.out.println("Enter First number");
		int number3 = sc.nextInt();
		System.out.println("Enter Second number");
		int number4 = sc.nextInt();
		number3 -= number4;
		System.out.println("Compound Substraction : " + number3);

		System.out.println("Enter First number");
		int number5 = sc.nextInt();
		System.out.println("Enter Second number");
		int number6 = sc.nextInt();
		number5 *= number6;
		System.out.println("Compound Multiplication : " + number5);

		System.out.println("Enter First number");
		int number7 = sc.nextInt();
		System.out.println("Enter Second number");
		int number8 = sc.nextInt();
		number7 /= number8;
		System.out.println("Compound Division : " + number7);

	}

}
