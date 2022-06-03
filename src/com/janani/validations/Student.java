package com.janani.validations;

import java.util.Scanner;

public class Student {
	static String username, password;

	int i = 10;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to N2S");

		System.out.println("Enter username");
		username = sc.nextLine();

		System.out.println("Enter password");
		password = sc.nextLine();

		validate();

	}

	private static void validate() {

		if (username.length() == 0) {
			System.out.println("Please enter username");

		} else if (password.length() == 0) {
			System.out.println("Please enter password");

		} else if (password.length() < 6) {

			System.out.println("Password should be minimum 6 characters");
		}

		else {
			System.out.println("Registered successfully");
		}

	}

	
	/*
	 * if(i<0)
	 * 
	 * { System.out.println("number is negative");
	 * 
	 * }else { System.out.println("number is positive"); }
	 */
	
	
	
	
	
}
