package com.assigments;

import java.util.Scanner;

public class PatternPrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of lines");
		int lines = sc.nextInt();

		int number = 2; // since prime starts from 2 

		for (int i = 1; i <= lines; i++) {
			for (int j = 0; j < i; j++) {
				while (true) {
					int flag = 0;
					int k = 2;

					while (k <= Math.sqrt(number)) {
						if (number % k == 0) {
							flag = 1;
							break;
						}
						k++;
					}

					if (flag == 0) {
						System.out.print(number + "\t");
						number++;
						break;
					} else {
						number++;
					}
				}
			}
			System.out.println();
		}
	}
}
