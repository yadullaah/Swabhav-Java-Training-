package com.assignment.test;

import com.assignment.model.*;

public class HatDecoratorTest {
	public static void main(String[] args) {
		IHat hat = new PremiumHat();
		GoldenHat goldHat = new GoldenHat(hat);
		RibbonedHat ribbonhat = new RibbonedHat(goldHat);
		System.out.println(ribbonhat);
	}
}
