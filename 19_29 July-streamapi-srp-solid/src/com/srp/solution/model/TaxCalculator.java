package com.srp.solution.model;

public class TaxCalculator {
	
	public TaxCalculator(Invoice invoice) {
		super();
		this.invoice = invoice;
	}

	private Invoice invoice;
	
	public double calculateTax() {
		return invoice.getAmount() * invoice.getTax() / 100;

	}


}
