package com.training;

public class BitWiseOperator {
public static void main(String[] args) {
	
	int a = 7;
	int b = 5;
	
	System.out.println("Left shift "+ (a<<1));
	
	System.out.println("Right shift "+ (a>>1));
	
	System.out.println("and "+ (a & b));
	
	System.out.println("or "+ (a | b));
}
}
