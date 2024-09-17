package com.training;

import java.util.Scanner;

public class CheckVowel {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a letter");
		char letter = sc.nextLine().charAt(0);

		if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
			System.out.println("It is a vowel");
		} else {
			System.out.println("It is not a vowel");
		}

	}

}
