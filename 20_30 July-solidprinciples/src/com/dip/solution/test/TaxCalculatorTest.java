package com.dip.solution.test;

import com.dip.solution.model.TaxCalculator;

public class TaxCalculatorTest {
public static void main(String[] args) {
		
		TaxCalculator t1=new TaxCalculator();
		t1.calculateTax(100, 10);
		
		
		TaxCalculator t2=new TaxCalculator();
		t2.calculateTax(2000, 10);
	}

}
