package com.srp.violation.test;

import com.srp.violation.model.Invoice;

public class InvoiceTest {
	public static void main(String[] args) {

		Invoice invoice = new Invoice(1, "Laptop", 2000.0, 10.0);
		
		invoice.printInvoice();
	}

}
