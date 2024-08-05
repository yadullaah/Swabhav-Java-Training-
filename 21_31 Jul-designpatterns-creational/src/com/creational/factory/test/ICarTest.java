package com.creational.factory.test;

import com.creational.factory.model.CarFactory;
import com.creational.factory.model.CarName;
import com.creational.factory.model.ICar;
import com.creational.factory.model.Mahindra;
import com.creational.factory.model.Maruti;
import com.creational.factory.model.Tata;
import com.creational.factory.model.CarFactory;;

public class ICarTest {
	public static void main(String[] args) {

		CarFactory carfactory = new CarFactory();
		
		
		ICar car = carfactory.makeCar(CarName.MARUTI);
		car.start();
		car.stop();

		car = carfactory.makeCar(CarName.TATA);
		car.start();
		car.stop();

		car = carfactory.makeCar(CarName.MAHINDRA);
		car.start();
		car.stop();

	}

}
