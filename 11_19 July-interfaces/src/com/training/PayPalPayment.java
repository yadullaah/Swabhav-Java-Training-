package com.training;

public class PayPalPayment extends Payment {

	@Override
	public void payBill() {
		System.out.println("Pay through PayPal");
		
	}

	@Override
	public void redeem() {
		System.out.println("Redeem through PayPal");
		
	}

}
