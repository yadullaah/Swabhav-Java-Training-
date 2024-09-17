package com.calculator.test;
import com.calculator.model.*;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 10;
		
		System.out.println("Addition of a and b is "+ CalculatorModel.addition(a, b));
		
		System.out.println("Substraction of a and b is "+ CalculatorModel.substraction(a, b));
		
		System.out.println("Multiplication of a and b is "+ CalculatorModel.multiplication(a, b));
		
		System.out.println("Division of a and b hmmm is "+ CalculatorModel.division(a, b));
	}
	
}
