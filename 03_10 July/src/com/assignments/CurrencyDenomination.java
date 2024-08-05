package com.assignments;

import java.util.Scanner;

public class CurrencyDenomination {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount in multiples of 100");

		int inputamt = sc.nextInt();

		if (inputamt <= 50000) {
			if (inputamt % 100 == 0)

			{

				if (inputamt >= 2000) {
					int notes = inputamt / 2000;
					inputamt = inputamt - (notes * 2000);
					System.out.println("2000 * " + notes);
				}

				if (inputamt >= 500) {
					int notes = inputamt / 500;
					inputamt = inputamt - (notes * 500);
					System.out.println("500 * " + notes);
				}

				if (inputamt >= 200) {
					int notes = inputamt / 200;
					inputamt = inputamt - (notes * 200);
					System.out.println("200 * " + notes);
				}

				if (inputamt >= 100) {
					int notes = inputamt / 100;
					inputamt = inputamt - (notes * 100);
					System.out.println("100 * " + notes);
				}

			} else {
				System.out.println("Input amount should be multiple of 100");
			}
		} else {
			System.out.println("Input amount exceed limit of 500000");
		}
	}

}