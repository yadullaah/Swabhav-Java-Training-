package com.abstractcarfactroy.test;

import com.abstractcarfactory.model.*;

public class ICarTest {
	public static void main(String[] args) {
		
		
		ICarFactory marutifactory = new MarutiFactory();
		
		ICar maruti = marutifactory.makeCar();
		maruti.start();
		
		
	}

}
