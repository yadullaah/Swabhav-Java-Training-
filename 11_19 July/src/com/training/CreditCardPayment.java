package com.training;

public class CreditCardPayment extends Payment {
	
	
	

	@Override
	public void payBill() {
		System.out.println("Pay through Credit Card");
		
	}

	@Override
	public void redeem() {
		System.out.println("Redeem through Credit Card");
		
	}
	

}
