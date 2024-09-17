package com.training;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");

		int revnum = 0;
		int number = sc.nextInt();
		int temp = number;

		while (number > 0) {
			int rem = number % 10;

			revnum = revnum * 10 + rem;
			number = number / 10;
		}
		if (revnum == temp) {
			System.out.println("It is Palindrome");
		} else {
			System.out.println("It is not palindrome");
		}
		System.out.println("The reverse of a number is : " + revnum);
	}
}
