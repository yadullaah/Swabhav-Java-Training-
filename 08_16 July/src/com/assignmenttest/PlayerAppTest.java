package com.assignmenttest;

import com.assignmentmodel.PlayerApp;

import java.util.*;

public class PlayerAppTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = 11;
		PlayerApp players[] = new PlayerApp[size];

		for (int n = 0; n < size; n++) {
			System.out.println("enter Player id of " + (n + 1) + " player");
			int playerId = sc.nextInt();
			sc.nextLine();
			System.out.println("enter player name ");
			String name = sc.nextLine();
			System.out.println("enter Number of matches ");
			int numberOfMatches = sc.nextInt();
			System.out.println("enter number of runs ");
			int runs = sc.nextInt();
			System.out.println("enter number of wickets ");
			int wickets = sc.nextInt();

			players[n] = new PlayerApp(playerId, name, numberOfMatches, runs, wickets);

		}

		for (int n = 0; n < size; n++) {
			double minAverage = players[n].average();
			for (int i = n + 1; i < size; i++) {
				double average = players[i].average();
				if (average < minAverage) {
					PlayerApp temp = players[n];
					players[n] = players[i];
					players[i] = temp;
					n--;
					break;

				} else if (average == minAverage) {
					PlayerApp temp = players[n + 1];
					players[n + 1] = players[i];
					players[i] = temp;
					i++;
				}
			}

		}

		for (int n = 0; n < size; n++) {
			players[n].display();
			System.out.println("Average :" + players[n].average());
			System.out.println();
		}

	}
}
