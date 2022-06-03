package com.n2s.oops;

public class FinalSample extends SuperSample {

	public static final int value = 4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// value=5;
		// FinalSample s = new FinalSample();
		// s.display6();
		SuperSample s1 = new SuperSample();
		s1.display6();
	}

	/*
	 * @Override public void display6() {
	 * 
	 * System.out.println("inside final sample"); }
	 */
}

class SuperSample {
	public final void display6() {

		System.out.println("inside super sample");
	}
}