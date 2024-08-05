package com.training;

import java.util.Scanner;

public class AddNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();

		int number = a;
		int sum = 0;
		int rem;

		while (number > 0) {
			rem = number % 10;
			sum = sum + rem;
			number = number / 10;
		}

		System.out.println(sum);

	}

}
