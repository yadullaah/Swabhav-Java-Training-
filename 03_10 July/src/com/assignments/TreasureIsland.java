package com.assignments;

import java.util.Scanner;

public class TreasureIsland {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Treasure Island, Your mission is to find the treasure");

		System.out.println("Select a direction, for right press 1 and for left press 2");
		int direction = sc.nextInt();

		if (direction != 2) {
			System.out.println("You fell into a hole, Game Over");
			System.exit(0);
		} else {
			System.out.println("If you want to swim press 1 or wait then press 2");

		}

		int choice = sc.nextInt();

		if (choice != 2) {
			System.out.println("You are attacked by trout, Game Over");
			System.exit(0);
		} else {
			System.out.println("Select a colour of door, press 1 for red, " + "press 2 for Yellow, press 3 for blue");
		}

		int colour = sc.nextInt();

		if (colour == 1) {
			System.out.println("You are burned by fire, Game Over");
		}

		else if (colour == 2) {
			System.out.println("You win");
		}

		else if (colour == 3) {
			System.out.println("You are eaten by beasts, Game over");
		} else {
			System.out.println("Game Over");
		}

	}
}