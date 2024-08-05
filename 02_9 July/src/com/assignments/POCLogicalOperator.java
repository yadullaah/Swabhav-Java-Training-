package com.assignments;

public class POCLogicalOperator {
 public static void main(String[] args) {
	
	 int number1 = 2;
	 int number2 = 4;
	 
	 System.out.println("number1 < 3 and number2 > 3 = "+ (number1<3 && number2>3)); 
	 
	 System.out.println("number1 > 3 or number2 > 3 = "+ (number1>3 || number2>3)); 
	 
	 System.out.println("number1 is not greater than 3 = " + !(number1>3));
}
}
