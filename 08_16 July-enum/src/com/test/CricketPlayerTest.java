package com.test;
import com.model.Book;
import com.model.CricketPlayer;
import java.util.Scanner;

public class CricketPlayerTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	CricketPlayer players[] = new CricketPlayer[2];
	
	for (int i = 0; i < players.length; i++) {
		System.out.println("Enter Player ID");
		int playerId = sc.nextInt();

		System.out.println("Enter Name");
		String name = sc.next();

		System.out.println("Enter Number of Matches Played");
		int numberofmatches = sc.nextInt();

		System.out.println("Enter Runs");
		int runs = sc.nextInt();

		System.out.println("Enter Wickets");
		int wickets = sc.nextInt();

		players[i] = new CricketPlayer(playerId, name, numberofmatches, runs, wickets);

	}
	
	for (int i = 0; i < players.length; i++) {
		System.out.println("Player ID is " + players[i].getPlayerId());
		System.out.println("Name " + players[i].getName());
		System.out.println("Number of matches are " + players[i].getNumberOfMatches());
		System.out.println("Runes are " + players[i].getRuns());
		System.out.println("Wickets are " + players[i].getWickets());
		System.out.println("Average is"+players[i].average());
		
	}
}
}
