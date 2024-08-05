package com.assigments;

import java.util.Random;
import java.util.Scanner;

public class PIG {public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	int randomNumber = 0;
	System.out.println("Let's Play PIG!");
	int totalScore = 0;
	char userInput = 0;
	int count = 0;
	int score = 0;
	int turn = 1;
	System.out.println("Turn = " + turn);
	
	do {
		System.out.print("Roll or hold? (r/h): ");
		userInput = scanner.next().charAt(0);
		if (userInput == 'r') {
			randomNumber = random.nextInt(6) + 1;
			if (randomNumber != 1) {
				System.out.println("Die: " + randomNumber);
				score = score + randomNumber;
			} else {
				System.out.println("Die: " + randomNumber);
				System.out.println("Turn over. No score.");
				System.exit(0);
			}
		} else if (userInput == 'h') {
			System.out.println("Score for Turn = " + score);
			totalScore = score;
			System.out.println("Total score: " + totalScore);
			System.out.println("");

			if (score < 20) {
				turn++;
				System.out.println("TURN " + turn);
			}

		}

	} while (totalScore <= 20);
	System.out.println("Congratulations");
	System.out.println("You won in total turn " + (turn));
}
	
}
