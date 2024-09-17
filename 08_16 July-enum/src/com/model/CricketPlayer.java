package com.model;

public class CricketPlayer {

	private int playerId;
	private String name;
	private int numberofmatches;
	private int runs;
	private int wickets;

	public CricketPlayer() {

	}

	public CricketPlayer(int playerId, String name, int numberofmatches, int runs, int wickets) {
		this.playerId = playerId;
		this.name = name;
		this.numberofmatches = numberofmatches;
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
		return numberofmatches;
	}
	
	public void setNumberOfMatches(int numberofmatches) {
		this.numberofmatches = numberofmatches;
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
		double average = runs/numberofmatches;
		return average;
		
	}
}
