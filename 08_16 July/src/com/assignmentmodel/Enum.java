package com.assignmentmodel;

enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Enum {

	public static void main(String[] args) {
	
		Day today = Day.SUNDAY;
		
		switch (today) {
		case SUNDAY:
			System.out.println("Today is Sunday. Relax!");
			break;
		case MONDAY:
			System.out.println("Today is Monday. Let's work!");
			break;
		case TUESDAY:
			System.out.println("Today is Tuesday. Keep going!");
			break;
		case WEDNESDAY:
			System.out.println("Today is Wednesday. Halfway there!");
			break;
		case THURSDAY:
			System.out.println("Today is Thursday. Almost Friday!");
			break;
		case FRIDAY:
			System.out.println("Today is Friday. Weekend is coming!");
			break;
		case SATURDAY:
			System.out.println("Today is Saturday. Enjoy the weekend!");
			break;
		default:
			System.out.println("Invalid day!");
			break;
		}
	}
}
