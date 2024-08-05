package com.isp.solution.test;

import com.isp.solution.model.IWorkable;
import com.isp.solution.model.ILunchInterval;

import com.isp.solution.model.Labour;
import com.isp.solution.model.Robot;

public class IworkerTest {
	public static void main(String[] args) {

		Labour labour = new Labour();
		labour.startWork();
		labour.stopWork();
		labour.eat();
		labour.drink();

		System.out.println();

		Robot robot = new Robot();
		robot.startWork();
		robot.stopWork();
	}
}
