package com.assignments;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Principal Amount");
		double principal = sc.nextDouble();

		System.out.println("Enter Rate of Interest");
		double rate = sc.nextDouble();

		System.out.println("Enter Number of Years");
		double time = sc.nextDouble();

		double compoundinterest = (principal * Math.pow((1 + (rate / 100)), time)) - principal;

		System.out.println("Compound Interest = " + compoundinterest);

	}

}
