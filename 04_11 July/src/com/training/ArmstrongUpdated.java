package com.training;
import java.util.Scanner;
public class ArmstrongUpdated {
public static void main(String[] args) {
	System.out.println("Enter a number");
	Scanner sc = new Scanner(System.in);


	int number = sc.nextInt();
	int sum = 0;
	int pow = 0;
	int rem;
    int temp2 = number;
	
	
	while(number>0) {
		pow++;
		number = number/10;
	}
	number=temp2;

	while (number > 0) {
		rem = number % 10;
		sum=sum +  (int)Math.pow(rem, pow);
		
		number = number / 10;
	}
	if (sum == temp2) {
		System.out.println("It is an armstrong number");
	} else {
		System.out.println("It is not an armstrong number");
	}
}
}
