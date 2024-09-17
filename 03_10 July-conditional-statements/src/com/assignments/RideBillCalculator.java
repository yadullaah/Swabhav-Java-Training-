package com.assignments;

import java.util.Scanner;

public class RideBillCalculator {

	public static void wantphotos(int amount) {
		System.out.println("Do you want photos? for Yes press 1, for No press 2");
		Scanner sc = new Scanner(System.in);
		int wantphotos = sc.nextInt();
		int finalamt = amount;
		if (wantphotos == 1) {
			System.out.println("Your total ride bill is $" + (finalamt + 3));
		} else {
			finalamt = amount;
			System.out.println("Your total ride bill is $" + finalamt);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your  height in centimetres");
		int height = sc.nextInt();
		int amount = 0;

		if (height > 120) {
			System.out.println("You can ride, Please enter your age");
			int age = sc.nextInt();

			if (age < 12) {
				amount = amount + 5;

			} else if (age >= 12 && age <= 18) {
				amount = amount + 7;

			} else if (age > 18 && age < 45) {
				amount = amount + 12;

			} else if (age > 45 && age < 55) {
				amount = amount;
			}
			wantphotos(amount);
		}

		else {
			System.out.println("Can't ride");
		}

	}
}
