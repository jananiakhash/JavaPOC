package com.n2s.exceptions;

public class Exception3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 20;
		try {
			i = i / 0;
			System.out.println(i);

		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();

		} finally {
			System.out.println("finally always be executed");
			try {
				int x = 2 / 0;
				System.out.println(x);
			} catch (ArithmeticException ae) {
				ae.printStackTrace();
			}
		}
		System.out.println("Maintaining the flow of exception");
	}

}
