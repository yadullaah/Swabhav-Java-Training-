package com.training;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int number = sc.nextInt();
		int flag = 0;
		int i = 2;

		if (i <= 1) {
			flag = 1;
		}
		
		// flag 1 = not prime and flag = 0 is prime

		while (i < number) {
			if (number % i == 0) {
				flag = 1;
				break;
			} 
			i++;
		}
		if (flag == 0) {
			System.out.println("It is a prime number");
		} else {
			System.out.println("It is not a prime number");
		}

	}

}
