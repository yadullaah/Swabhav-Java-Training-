package com.training;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int number = sc.nextInt();
		int temp = number;
		int i = 1;
		int sum = 0;

		while (i < number) {
			if (number % i == 0) {
				sum = sum + i;
				i++;
			} else {
				i++;
			}
		}
		if (sum == temp) {
			System.out.println("It is a perfect number");
		} else {
			System.out.println("It is not a perfect number");
		}

	}
}
