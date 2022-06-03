package com.n2s.exceptions;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		String s = null;
		try {
			System.out.println(s.length());
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (NullPointerException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

	}
}
