package com.n2s.exceptions;

public class MyExceptionsWithThrowObject {

	public static void main(String[] args) {

		voterAgeValidations(13);
		System.out.println("rest of the code...");

	}

	private static void voterAgeValidations(int x) {

		if (x < 18) {
			throw new ArithmeticException("You are not eligible to vote");

		} else {
			System.out.println("You are eligible to vote");
		}

	}

}
