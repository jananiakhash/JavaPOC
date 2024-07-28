package com.n2s.oops;

public class StaticSample {
	public static int x = 5;
	public int y = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 2;
		System.out.println("1.Inside main method");
		display5();
		X.message();
		System.out.println("2.x value is" + x);

	}

//static method
	static void display5() {
		x = 15;
		System.out.println("3.Inside static method diaplay");
	}

//static block
	static {
		x = 7;
		System.out.println("4.Inside static block");
	}

//static class
	static class X {

		static void message() {
			x = 13;
			System.out.println("5.inside static class method");
		}
	}
}
