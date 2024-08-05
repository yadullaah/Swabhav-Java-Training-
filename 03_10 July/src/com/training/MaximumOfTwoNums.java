package com.training;

import java.util.Scanner;

public class MaximumOfTwoNums {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();

		System.out.println("Enter second number");
		int b = sc.nextInt();

		if (a > b) {
			System.out.println("The maximum number is " + a);
		}

		else if (b > a) {
			System.out.println("The maximum number is " + b);
		}
		else {
			System.out.println("Both are equal");
		}

	}

}
