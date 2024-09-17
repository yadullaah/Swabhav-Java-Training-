package com.test;

import java.util.Scanner;

import com.exceptions.AgeNotValid;
import com.model.Voter;

public class VoterTest {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter voter id");
		int voterId = scanner.nextInt();

		System.out.println("Enter first name");
		String firstName = scanner.next();

		System.out.println("Enter last name");
		String lastName = scanner.next();

		System.out.println("Enter age");
		int age = scanner.nextInt();
		
		Voter voter = null;
		
		try {
			voter  = new Voter(voterId, firstName, lastName, age);
			
		} catch (AgeNotValid exception) {
			System.out.println(exception.getMessage());
		}
		System.out.println(voter);
		

	}

}
