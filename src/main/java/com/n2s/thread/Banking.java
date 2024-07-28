package com.n2s.thread;

public class Banking {

	// Inter thread communication sample

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer();

		Thread t1 = new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				c.deposit(10000);
			}
		};

		t1.start();
		t2.start();
	}

}

class Customer {

	public static int balance = 10000;

	synchronized void withdraw(int amount) {

		if (balance < amount) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				wait();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		balance = amount;
		System.out.println("withdraw completed...");
	}

	synchronized void deposit(int amount) {

		System.out.println("going to deposit...");
		balance += amount;
		System.out.println("deposit completed... ");
		notify();
	}
}
