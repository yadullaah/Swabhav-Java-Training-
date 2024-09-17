package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.training.Car;;

public class CarTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Car> cars = new ArrayList<>();

		readcars(cars, scanner);

		displaycars(cars);

		displayMaxMileageCar(cars);
	}

	private static void readcars(List<Car> cars, Scanner scanner) {

		for (int i = 0; i < 4; i++) {
			System.out.println("Enter carID");
			int carId = scanner.nextInt();
			System.out.println("Enter company name");
			String companyname = scanner.next();
			System.out.println("Enter price");
			double price = scanner.nextDouble();
			System.out.println("Enter mileage");
			int mileage = scanner.nextInt();

			cars.add(new Car(carId, companyname, price, mileage));

		}

	}

	private static void displaycars(List<Car> cars) {
		for (Car car : cars)
			System.out.println(car);
	}

	private static void displayMaxMileageCar(List<Car> cars) {

		Car maxMileageCar = cars.get(0);
		for (Car car : cars) {
			if (car.getMileage() > maxMileageCar.getMileage()) {
				maxMileageCar = car;
			}
		}

		System.out.println("Car with maximum mileage:");
		System.out.println(maxMileageCar);
	}

}
