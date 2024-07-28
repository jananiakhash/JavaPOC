package com.n2s.thread;

public class ThreadSample1 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadSample1 sample1 = new ThreadSample1();
		Thread t = new Thread(sample1);
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello");
			/*
			 * try { Thread.sleep(1000); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 */
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		int i = 0;
		while (i < 5) {
			System.out.println("Thread is running");
			i++;
			/*
			 * try { Thread.sleep(1000); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 */
		}

	}

}
