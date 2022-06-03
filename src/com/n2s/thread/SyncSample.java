package com.n2s.thread;

public class SyncSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Table t=new Table();
		Thread t1=new Thread(new Thread1(t));
		Thread t2=new Thread(new Thread2(t));
		t1.start();
		t2.start();

	}

}

class Table {
	public synchronized void printTable(int i) {
		int j = 1;
		while (j <= 5) {
			System.out.println(i + " * " + j + " = " + (j * i));
			j++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Thread1 implements Runnable {

	Table t;

	public Thread1(Table t) {

		this.t = t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.printTable(3);
	}

}

class Thread2 implements Runnable {

	Table t;

	public Thread2(Table t) {

		this.t = t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.printTable(8);
	}

}
