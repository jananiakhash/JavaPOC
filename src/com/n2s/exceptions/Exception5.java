package com.n2s.exceptions;

import java.io.IOException;

public class Exception5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			validateAge(17);

		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Maintaining the flow of application");
	}

	public static int validateAge(int age) throws InvalidAgeException, IOException {
		int i = 0;

		if (age >= 18) {
			i = 1;
		} else {
			throw new InvalidAgeException("You are not elegible to vote");
		}

		return i;

	}

}
