package com.n2s.exceptions;

public class Exception4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		try {
			if (i == 5)
				throw new ArithmeticException("Invalid number");
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

		System.out.println("Maintaining the flow of application");
	}

}
