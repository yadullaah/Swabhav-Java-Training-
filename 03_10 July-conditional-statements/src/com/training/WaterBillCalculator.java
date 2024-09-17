package com.training;

import java.util.Scanner;

public class WaterBillCalculator {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of units consumed");
		int units = sc.nextInt();

		int metercharge = 75;

		if (units <= 100) {
			System.out.println("Total water bill is " + ((units * 5) + metercharge));
		}
		if (units <= 250) {
			System.out.println("Total water bill is " + ((units * 10) + metercharge));
		} else {
			System.out.println("Total water bill is " + ((units * 20) + metercharge));
		}
		
		
		
	}
}
