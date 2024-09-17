package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.training.NewTask;

public class CallableExecutorDemo {
	public static void main(String[] args) {

		ExecutorService service = Executors.newCachedThreadPool();

		// Future<Integer> future = service.submit(new NewTask());

		List<NewTask> tasks = new ArrayList<NewTask>();
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		tasks.add(new NewTask());

		try {
			// System.out.println(future.get());

			// service.invokeAny(tasks);
			List<Future<Integer>> futures = futures = service.invokeAll(tasks);
			for (Future<Integer> future : futures)
				System.out.println(future.get());

		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

	}

}
