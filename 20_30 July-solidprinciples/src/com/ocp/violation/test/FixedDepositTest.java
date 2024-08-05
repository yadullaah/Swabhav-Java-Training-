package com.ocp.violation.test;

import com.ocp.violation.model.FixedDeposit;
import com.ocp.violation.model.FestivalType;

public class FixedDepositTest {
	public static void main(String[] args) {

		FixedDeposit FD1 = new FixedDeposit(123, "Yadullah", 45000.0, 7, FestivalType.NEWYEAR);

		System.out.println(FD1.getInterestRates());
		
		System.out.println("Simple interest after " + FD1.getDuration() 
		                          + " years : " + FD1.calculateSimpleInterest());
	}

}
