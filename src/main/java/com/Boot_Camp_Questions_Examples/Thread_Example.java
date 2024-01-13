package com.Boot_Camp_Questions_Examples;

public class Thread_Example extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
		System.out.println("Thread " + Thread.currentThread().getId() + ": Value " + i);

		}
	}

	public static void main(String[] args) {
		Thread_Example thread1 = new Thread_Example();
		Thread_Example thread2 = new Thread_Example();
		
		thread1.start();
		thread2.start();

	}
}