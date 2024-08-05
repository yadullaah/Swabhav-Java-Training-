package com.test;

import com.training.BankTransferPayment;
import com.training.CreditCardPayment;
import com.training.PayPalPayment;
import com.training.Payment;

public class PaymentTest {
	public static void main(String[] args) {

		
		Payment payment;
		
		
		CreditCardPayment creditcardpayment = new CreditCardPayment();
		creditcardpayment.payBill();
		creditcardpayment.redeem();

		payment = new PayPalPayment();
		payment.payBill();
		payment.redeem();

		payment = new BankTransferPayment();
		payment.payBill();
		payment.redeem();
		
	}

}
