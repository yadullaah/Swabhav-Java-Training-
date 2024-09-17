package com.assignments;

import java.util.Scanner;

public class CharacterShifter {
	public static void shiftString(String string, int shift) {

		shift = shift % 26;

		if (shift < 0) {
			shift = shift + 26;
		}

		for (int i = 0; i < string.length(); i++) {

			char ch = string.charAt(i);

			if (Character.isLetter(ch)) {

				if (Character.isLowerCase(ch)) {
					ch = (char) ('a' + (ch + shift - 'a') % 26);
					System.out.print(ch);
				}

				else {
					ch = (char) ('A' + (ch + shift - 'A') % 26);
					System.out.print(ch);
				}

			}

			else {
				System.out.println("Enter a string with only alphabets");
				break;
			}

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string ");
		String string = sc.next();

		System.out.println("Enter number of shifts ");
		int shift = sc.nextInt();

		CharacterShifter.shiftString(string, shift);

	}
}
