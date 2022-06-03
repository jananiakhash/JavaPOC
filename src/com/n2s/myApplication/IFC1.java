package com.n2s.myApplication;

public interface IFC1 {

	public static final int ifc1_x = 5;
	public static int z = 10;

	public abstract int addition(int x, int y);

	default public void display1() {
		System.out.println("display");
	}

	public static void disply2() {
		System.out.println(z);
	}
//This is introduced from java 9
	
	/*
	 * private void disply3() { System.out.println("display3");
	 * 
	 * }
	 */
	 
}