package com.assignments;

public class POCComparisonOperator {
public static void main(String[] args) {
	int number1 = 2;
	int number2 = 4;
	
	if(number1 == number2)
		System.out.println("They are equal");
	
	if(number1 != number2)
		System.out.println("They are not equal");
	
	if(number1<number2)
		System.out.println(number2+" is greater than "+ number1);
	else
		System.out.println(number1+ " is greater than "+ number2);
}
}
