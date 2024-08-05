package com.assignment;

import java.util.Random;
import java.util.Scanner;

public class PIGCalesthenics {
	public static void main(String[] args) {
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

		turn = gamelogic(userInput, scanner, randomNumber, score, totalScore, turn, random);

		System.out.println("Congratulations");
		System.out.println("You won in total turn " + (turn));
	}

	public static int gamelogic(char userInput, Scanner scanner, int randomNumber, int score, int totalScore, int turn,
			Random random) {
		do {
			System.out.print("Roll or hold? (r/h): ");
			userInput = scanner.next().charAt(0);
			if (userInput == 'r') {

				score = roll(random, score);

			} else if (userInput == 'h') {

				hold(totalScore, score, turn);
			}

		} while (totalScore <= 20);
		return turn;

	}

	public static int hold(int totalScore, int score, int turn) {
		System.out.println("Score for Turn = " + score);
		totalScore = score;
		System.out.println("Total score: " + totalScore);
		System.out.println("");

		return turn = turnless20(score, turn);

	}

	public static int roll(Random random, int score) {
		int randomNumber = random.nextInt(6) + 1;
		return generatevalue(randomNumber, score);
	}

	public static int turnless20(int score, int turn) {
		if (score < 20) {
			turn++;
			System.out.println("TURN " + turn);
		}
		return turn;

	}

	public static int generatevalue(int randomNumber, int score) {
		if (randomNumber != 1) {
			System.out.println("Die: " + randomNumber);
			score = score + randomNumber;
			return score;
		}
		System.out.println("Die: " + randomNumber);
		System.out.println("Turn over. No score.");
		System.exit(0);

		return score;
	}

}
