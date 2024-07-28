package com.n2s.exceptions;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 20;
		try {
			i = i / 0;
		} catch (ArithmeticException e) {
			// System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("Welcome");
		System.out.println("Maintaining the flow of exception");

	}

}
