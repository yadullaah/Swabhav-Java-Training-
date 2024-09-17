package com.test;

import com.training.MyThread;

public class ThreadDemo {
	public static void main(String[] args) {
		
		MyThread thread1 = new MyThread("Thread1");
		
		
		
		for (int i = 5; i>0 ; i--)
		{
			System.out.println(Thread.currentThread().getName()+ ":"+i);
			
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	}


