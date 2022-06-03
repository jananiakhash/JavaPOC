package com.n2s.exceptions;

public class MyExceptionsWithMethod {

	public static void main(String[] args) {
		MyExceptionsWithMethod ex_method = new MyExceptionsWithMethod();
		try {
			System.out.println(ex_method.calci(3, 0));
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Normal flow of program");

	}

	private int calci(int x, int y) throws ArithmeticException {
		int result;
		result = x / y;
		return result;

	}

}
