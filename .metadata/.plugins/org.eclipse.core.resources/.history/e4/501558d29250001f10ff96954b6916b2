package com.aurionpro.structural.decorator.test;

import com.aurionpro.structural.decorator.model.GoldenHat;
import com.aurionpro.structural.decorator.model.IHat;
import com.aurionpro.structural.decorator.model.PremiumHat;
import com.aurionpro.structural.decorator.model.RibbonedHat;

public class HatDecoratorTest {
public static void main(String[] args) {
	IHat hat = new PremiumHat();
	GoldenHat goldHat = new GoldenHat(hat);
	RibbonedHat ribbonhat = new RibbonedHat(goldHat);
//	System.out.println(ribbonhat.getName());
	System.out.println(ribbonhat);
}
}
