package com.training;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int number = a;
		int sum = 0;
		int rem;

		int temp = a;

		while (number > 0) {
			rem = number % 10;
			int cube = rem * rem * rem;
			sum = sum + cube;
			number = number / 10;
		}
		if (sum == temp) {
			System.out.println("It is an armstrong number");
		} else {
			System.out.println("It is not an armstrong number");
		}

	}
}
