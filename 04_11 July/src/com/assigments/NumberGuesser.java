package com.assigments;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		boolean playAgain;

		do {
			int random = rd.nextInt(100) + 1;

			int count = 0;
			boolean hasWon = false;
			int maxAttempts = 5;

			System.out.println("Random number generated!");

			while (count < maxAttempts) {
				count++;
				System.out.println("Guess a number? ");
				int guess = sc.nextInt();

				if (guess > random) {
					System.out.println("Sorry, too high");
				} else if (guess < random) {
					System.out.println("Sorry, too low");
				} else {
					System.out.println("You won: in attempt: " + count);
					System.out.println("You guessed the correct number :"+ random);
					hasWon = true;
					break;
				}
			}

			if (!hasWon) {
				System.out.println("You've reached the maximum attempts. The number was: " + random);
			}

			System.out.println("Do you want to play the game again? (yes/no)");
			String response = sc.next();
			playAgain = response.equals("yes");
		} while (playAgain);

	}
}
