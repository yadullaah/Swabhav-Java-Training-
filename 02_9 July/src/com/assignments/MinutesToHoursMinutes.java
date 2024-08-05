package com.assignments;

import java.util.Scanner;

public class MinutesToHoursMinutes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of minutes");
		int minutes = sc.nextInt();

		int hour = minutes / 60;
		int balanceminutes = minutes % 60;

		System.out.println(minutes + " minutes in Hour and Minutes are " + hour + " Hour and " 
		                                                + balanceminutes + " Minutes");
	}

}
