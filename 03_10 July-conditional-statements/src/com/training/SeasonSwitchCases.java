package com.training;

import java.util.Scanner;

public class SeasonSwitchCases {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of month ");
		int month = sc.nextInt();

		switch (month) {

		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Summer");
			break;
		case 10:
		case 11:
		case 12:
		case 1:
			System.out.println("Winter");
			break;

		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("Monsoon");
			break;

		}
	}
}