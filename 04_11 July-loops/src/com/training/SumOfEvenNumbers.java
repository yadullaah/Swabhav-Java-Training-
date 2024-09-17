package com.training;

import java.util.Scanner;

public class SumOfEvenNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an even number");
		int a = sc.nextInt();
		int i = 1;
		int sum = 0;
		while (i <= a) {
			if (i % 2 == 0) {
				sum = sum + i;

			}
			i++;
		}
		System.out.println(sum);

	}
}
