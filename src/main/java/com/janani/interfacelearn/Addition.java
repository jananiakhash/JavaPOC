package com.janani.interfacelearn;

public interface Addition {

	public abstract int add(int x, int y);

	default public void display1() {
		System.out.println("Inside Addition.display1()");
	}

	public static void display2() {
		System.out.println("Inside Addition.display2()");

	}

}
