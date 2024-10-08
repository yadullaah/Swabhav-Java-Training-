package com.srp.solution.model;

public class InvoicePrinter {

	private Invoice invoice;
	private TaxCalculator taxCalculator;

	public void printInvoice() {

		System.out.println("Id: " + invoice.getId());
		System.out.println("Description: " + invoice.getDescription());
		System.out.println("Amount: " + invoice.getAmount());
		System.out.println("Tax :" + taxCalculator.calculateTax());
		System.out.println("Total Amount :" + (invoice.getAmount() + taxCalculator.calculateTax()));

	}

	public InvoicePrinter(Invoice invoice, TaxCalculator taxCalculator) {
		super();
		this.invoice = invoice;
		this.taxCalculator = taxCalculator;
	}

}
