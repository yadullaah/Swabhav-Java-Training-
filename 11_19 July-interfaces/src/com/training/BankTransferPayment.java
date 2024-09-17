package com.training;

public class BankTransferPayment extends Payment {

	@Override
	public void payBill() {
		System.out.println("Pay through Bank Transfer");
		
	}

	@Override
	public void redeem() {
		System.out.println("Redeem throgh Bank Transfer");
		
	}

}
