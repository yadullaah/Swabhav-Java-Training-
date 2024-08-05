package com.isp.violation.test;

import com.isp.violation.model.IWorker;
import com.isp.violation.model.Labour;
import com.isp.violation.model.Robot;

public class IWorkerTest {
	public static void main(String[] args) {

		IWorker labour = new Labour();
		labour.startWork();
		labour.stopWork();
		labour.eat();
		labour.drink();

		System.out.println();

		IWorker robot = new Robot();
		robot.startWork();
		robot.stopWork();
		robot.eat();
		robot.drink();
	}

}
