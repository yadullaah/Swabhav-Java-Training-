package com.dip.violation.model;

public class TaxCalculator {

	DBLogger dbLogger;

	public TaxCalculator(DBLogger dbLogger) {
		super();
		this.dbLogger = dbLogger;
	}

	public TaxCalculator() {
		;
	}

	public double calculateTax(int amount, int rate) {

		int tax = 0;

		try {
			tax = amount / rate;
			System.out.println("Tax = " + tax);

		} catch (Exception e) {
			new DBLogger().log("Divide by zero");

			return rate;

		}

		return rate;

	}
}
