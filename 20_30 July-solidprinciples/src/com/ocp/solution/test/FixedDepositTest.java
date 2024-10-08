package com.ocp.solution.test;

import com.ocp.solution.model.DiwaliInterest;
import com.ocp.solution.model.FixedDeposit;

public class FixedDepositTest {
	public static void main(String[] args) {

		FixedDeposit FD1 = new FixedDeposit(101, "Yadullah", 45000.0, 7, new DiwaliInterest());

		System.out.println("Simple interest after " + FD1.getDuration() + " years : "
		                                   + FD1.calculateSimpleInterest());
	}
}
