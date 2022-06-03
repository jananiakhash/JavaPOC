package com.n2s.exceptions;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 20;
		String s = null;

		try {
			System.out.println(s.length());
			i = i / 0;
			System.out.println(i);
		} catch (ArithmeticException ae) {
			// TODO: handle exception
			ae.printStackTrace();
		} catch (NullPointerException ne) {
			// TODO: handle exception
			ne.printStackTrace();
		} catch (Exception e) { // exception should be the last member in the hierarchy
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Maintaining the flow of exception");
	}

}
