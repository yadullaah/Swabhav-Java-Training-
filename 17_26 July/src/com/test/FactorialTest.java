package com.test;

import com.training.IFactorial;

public class FactorialTest {
	public static void main(String[] args) {
		
		IFactorial fact = number1 -> {
			int answer = 1;
			 for(int i =number1; i>2; i--) {
				 answer *= i;
			 }
			 return answer;
			
			
		};
		System.out.println(fact.factorial(5));
	}

}
