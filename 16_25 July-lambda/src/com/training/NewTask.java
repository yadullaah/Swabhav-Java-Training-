package com.training;

import java.util.concurrent.Callable;

public class NewTask implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		return (int) (Math.random() * 1000);
	}

}
