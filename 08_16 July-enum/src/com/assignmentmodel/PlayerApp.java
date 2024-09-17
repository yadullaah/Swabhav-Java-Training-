package com.assignmentmodel;

public class PlayerApp {

	private int playerId;
	private String name;
	private int numberOfMatches;
	private int runs;
	private int wickets;

	public PlayerApp(int playerId, String name, int numberOfMatches, int runs, int wickets) {

		this.playerId = playerId;
		this.name = name;
		this.numberOfMatches = numberOfMatches;
		this.runs = runs;
		this.wickets = wickets;

	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfMatches() {
		return numberOfMatches;
	}

	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public double average() {
		double average = runs / numberOfMatches;
		return average;
	}

	public void display() {
		System.out.println(" Player Id : " + getPlayerId());
		System.out.println(" Name : " + getName());
		System.out.println(" Number of Matches " + getNumberOfMatches());
		System.out.println(" runs " + getRuns());
		System.out.println(" wicktes  " + getWickets());

	}

}
