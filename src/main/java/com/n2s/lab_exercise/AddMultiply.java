package com.n2s.lab_exercise;

public class AddMultiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2, b = 3;
		System.out.println(addition(a, b));
		System.out.println(multiply(a, b));

	}

	private static int addition(int i, int j) {
		int result = 0;
		result = i + j;
		return result;
	}

	private static int multiply(int i, int j) {
		// TODO Auto-generated method stub

		int result = 0;
		result = i * j;
		return result;
	}

}
