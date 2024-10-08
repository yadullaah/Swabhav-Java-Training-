package com.srp.solution.test;

import com.srp.solution.model.Invoice;
import com.srp.solution.model.TaxCalculator;
import com.srp.solution.model.InvoicePrinter;

public class InvoiceTest {
	public static void main(String[] args) {

		Invoice invoice = new Invoice(1, "Laptop", 2000.0, 10.0);
		
		TaxCalculator taxCalculator = new TaxCalculator (invoice);
		
		InvoicePrinter printer = new InvoicePrinter (invoice, taxCalculator);
		
		printer.printInvoice();
	}


}
