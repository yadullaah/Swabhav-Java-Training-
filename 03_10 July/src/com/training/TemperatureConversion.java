package com.training;

import java.util.Scanner;

public class TemperatureConversion {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter temperature: ");
		double temperature = sc.nextDouble();

		System.out.println("Choose conversion:");
		System.out.println("1. Celsius to Fahrenheit");
		System.out.println("2. Fahrenheit to Celsius");
		System.out.println("3. Celsius to Kelvin");
		System.out.println("4. Kelvin to Celsius");
		System.out.println("5. Fahrenheit to Kelvin");
		System.out.println("6. Kelvin to Fahrenheit");

		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Celsius to Fahrenheit " + (((temperature) * (9 / 5)) + 32));
			break;

		case 2:
			System.out.println("Fahrenheit to celsius " + (((temperature - 32) * (5 / 9))));
			break;

		case 3:
			System.out.println("celsius to kelvin " + (temperature + 273.15));
			break;

		case 4:
			System.out.println("kelvin to celsius " + (temperature - 273.15));
			break;

		case 5:
			System.out.println("Fahrenheit to Kelvin " + (((temperature - 32) * (5 / 9)) + 273.15));
			break;

		case 6:
			System.out.println("kelvin to Fahrenheit " + (((temperature - 273.15) * (5 / 9)) + 32));
			break;

		}
	}
}
