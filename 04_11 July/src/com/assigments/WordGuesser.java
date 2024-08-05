package com.assigments;

import java.util.Scanner;
import java.util.Random;

public class WordGuesser {
	public static void main(String[] args) {
		String[] words = { "java", "programming", "openai", "hangman", "computer" };
		Random rd = new Random();
		String word = words[rd.nextInt(words.length)];

		char[] blanks = new char[word.length()];

		for (int i = 0; i < blanks.length; i++) {
			blanks[i] = '_';
		}
		int lives = 6;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Current word: ");
			System.out.println(blanks);
			System.out.print("Guess a letter: ");
			char guessedLetter = sc.next().charAt(0);

			boolean found = false;
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == guessedLetter) {
					blanks[i] = guessedLetter;
					found = true;
				}
			}
			if (!found) {
				lives--;
				System.out.println("Wrong guess. You lost a life. Lives left: " + lives);
				if (lives == 0) {
					System.out.println("You've run out of lives. Game over.");
					break;
				}
			} else {
				boolean allFilled = true;
				for (char c : blanks) {
					if (c == '_') {
						allFilled = false;
						break;
					}
				}
				if (allFilled) {
					System.out.println("Congratulations! You've guessed the word: " + word);
					break;
				}
			}
		}

	}
}