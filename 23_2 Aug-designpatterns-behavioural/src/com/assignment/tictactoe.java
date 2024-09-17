package com.assignment;

import java.util.Scanner;

public class tictactoe {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		char ticTacToe[][] = new char[3][3];
		boolean playerWins = false;
		int turn = 0;
		boolean drawGame = false;
		boolean result = false;
		boolean result1 = false;

		introduction(ticTacToe);

		internalGame(ticTacToe, turn, scanner, result, result1, drawGame, playerWins);

	}

	// printingResults(result, result1, drawGame);

	private static void introduction(char[][] ticTacToe) {
		// introduction

		System.out.println("Welcome to the Tic Tac Toe game!!!");
		System.out.println("This game is of two players ");
		System.out.println("Player 1 plays with 'X");
		System.out.println("whereas");
		System.out.println("Player 2 plays with 'O");
		System.out.println("lets begin!");

		System.out.println();

		// Initializing

		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				ticTacToe[i][j] = '-';
			}
		}

		// printing
		System.out.println("Initial Board");
		printBoard(ticTacToe);
	}

	private static void internalGame(char[][] ticTacToe, int turn, Scanner scanner, boolean result, boolean result1,
			boolean drawGame, boolean playerWins) {

		while (!result && !drawGame && !result1) {

			turn++;

			if (turn < 10) {
				System.out.println("Turn : " + turn);
				System.out.println("Enter your row ");
				int row = scanner.nextInt();

				System.out.println("Enter your column ");
				int column = scanner.nextInt();

				System.out.println("Enter your symbol");
				char symbol = scanner.next().charAt(0);

				ticTacToe[row][column] = symbol;

				printBoard(ticTacToe);

				// player.play;
				// if(player.getSymbol == 'x') {
				// player.setSymbol == 'o';
				// }
				// player.play;
				// if(player.getSymbol == 'o') {
				// player.setSymbol == 'x';
				// }

			} else {

				drawGame = true;

			}
			result = checkingForX(ticTacToe, playerWins);
			result1 = checkingForO(ticTacToe, playerWins);

		}
		if (result || result1 || drawGame) {
			printingResults(result, result1, drawGame);
		}

	}

	private static void printingResults(boolean result, boolean result1, boolean drawGame) {
		// printing results and checking
		System.out.println();
		System.out.println();
		System.out.println("------------------");
		System.out.println("FINAL RESULTS");
		System.out.println("------------------");
		System.out.println();

		if (result) {
			System.out.println("PLAYER 1 WINS!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
		if (result1) {
			System.out.println("PLAYER 2 WINS!!!!!!!!!!!!!!!!!!!!!!!!!!");
		}
		if (drawGame) {
			System.out.println("GAME DRAW!!");
		}
	}

	private static boolean checkingForX(char[][] ticTacToe, boolean playerWins) {

		// checking rows
		// checking first row

		for (int i = 0; i < ticTacToe.length; i++) {
			if (ticTacToe[i][0] == 'X' && ticTacToe[i][1] == 'X' && ticTacToe[i][1] == 'X' && ticTacToe[i][2] == 'X') {
				playerWins = true;
			}
		}
		// if (ticTacToe[0][0] == 'X' && ticTacToe[0][1] == 'X' && ticTacToe[0][1] ==
		// 'X' && ticTacToe[0][2] == 'X') {
		// playerWins = true;
		// }
		//
		// // checking second row
		// if (ticTacToe[1][0] == 'X' && ticTacToe[1][1] == 'X' && ticTacToe[1][1] ==
		// 'X' && ticTacToe[1][2] == 'X') {
		// playerWins = true;
		// }
		//
		// // checking third row
		// if (ticTacToe[2][0] == 'X' && ticTacToe[2][1] == 'X' && ticTacToe[2][1] ==
		// 'X' && ticTacToe[2][2] == 'X') {
		// playerWins = true;
		// }

		// checking columns

		for (int i = 0; i < ticTacToe.length; i++) {
			if (ticTacToe[0][i] == 'X' && ticTacToe[1][i] == 'X' && ticTacToe[1][i] == 'X' && ticTacToe[2][i] == 'X') {
				playerWins = true;
			}
			// int count =0;
			// if(ticTacToe[0][i] == 'X') {
			// count++;
			// }
			//
			// if(count==3) {
			// playerWins = true;
			// }
			// }

			// // checking first column
			// if (ticTacToe[0][0] == 'X' && ticTacToe[1][0] == 'X' && ticTacToe[1][0] ==
			// 'X' && ticTacToe[2][0] == 'X') {
			// playerWins = true;
			// }
			//
			// // checking second column
			// if (ticTacToe[0][1] == 'X' && ticTacToe[1][1] == 'X' && ticTacToe[1][1] ==
			// 'X' && ticTacToe[2][1] == 'X') {
			// playerWins = true;
			// }
			//
			// // checking third column
			// if (ticTacToe[0][2] == 'X' && ticTacToe[1][2] == 'X' && ticTacToe[1][2] ==
			// 'X' && ticTacToe[2][2] == 'X') {
			// playerWins = true;
			// }

			// checking diagonals

			// checking left to right diagonal
			if (ticTacToe[0][0] == 'X' && ticTacToe[1][1] == 'X' && ticTacToe[1][1] == 'X' && ticTacToe[2][2] == 'X') {
				playerWins = true;
			}

			// checking right to left diagonal
			if (ticTacToe[0][2] == 'X' && ticTacToe[1][1] == 'X' && ticTacToe[1][1] == 'X' && ticTacToe[2][0] == 'X') {
				playerWins = true;
			}
			return playerWins;
		}
		return playerWins;
	}

	private static boolean checkingForO(char[][] ticTacToe, boolean playerWins) {

		// checking rows
		// checking first row
		if (ticTacToe[0][0] == 'O' && ticTacToe[0][1] == 'O' && ticTacToe[0][1] == 'O' && ticTacToe[0][2] == 'O') {
			playerWins = true;
		}

		// checking second row
		if (ticTacToe[1][0] == 'O' && ticTacToe[1][1] == 'O' && ticTacToe[1][1] == 'O' && ticTacToe[1][2] == 'O') {
			playerWins = true;
		}

		// checking third row
		if (ticTacToe[2][0] == 'O' && ticTacToe[2][1] == 'O' && ticTacToe[2][1] == 'O' && ticTacToe[2][2] == 'O') {
			playerWins = true;
		}

		// checking columns

		// checking first column
		if (ticTacToe[0][0] == 'O' && ticTacToe[1][0] == 'O' && ticTacToe[1][0] == 'O' && ticTacToe[2][0] == 'O') {
			playerWins = true;
		}

		// checking second column
		if (ticTacToe[0][1] == 'O' && ticTacToe[1][1] == 'O' && ticTacToe[1][1] == 'O' && ticTacToe[2][1] == 'O') {
			playerWins = true;
		}

		// checking third column
		if (ticTacToe[0][2] == 'O' && ticTacToe[1][2] == 'O' && ticTacToe[1][2] == 'O' && ticTacToe[2][2] == 'O') {
			playerWins = true;
		}

		// checking diagonals

		// checking left to right diagonal
		if (ticTacToe[0][0] == 'O' && ticTacToe[1][1] == 'O' && ticTacToe[1][1] == 'O' && ticTacToe[2][2] == 'O') {
			playerWins = true;
		}

		// checking right to left diagonal
		if (ticTacToe[0][2] == 'O' && ticTacToe[1][1] == 'O' && ticTacToe[1][1] == 'O' && ticTacToe[2][0] == 'O') {
			playerWins = true;
		}
		return playerWins;
	}

	private static void printBoard(char[][] ticTacToe) {

		System.out.println("*****************");
		System.out.println();
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.print(ticTacToe[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("*****************");

	}

}