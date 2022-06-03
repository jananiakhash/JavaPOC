package com.janani.thread;

public class Application1 {

	public static void main(String[] args) {
		System.out.println("Thread name :: " + Thread.currentThread().getName());

		Runnable myRunnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread name :: " + Thread.currentThread().getName());
				// THIS IS CALLED BY CHILD THREAD
				myPrint();
			}
		};
		Thread myThread = new Thread(myRunnable, "janThread");
		myThread.start();

		// THIS IS CALLED BY MAIN THREAD
		myPrint();
	}

	public static void myPrint() {
		int i = 10;
		while (i > 0) {
			System.out.println(Thread.currentThread().getName() + " :: i = " + i);
			mySleep();
			i--;
		}
	}

	public static void mySleep() {
		try {
			System.out.println(Thread.currentThread().getName() + " thread Sleep started...");
			Thread.sleep(1);
			System.out.println(Thread.currentThread().getName() + " thread Sleep ended...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
