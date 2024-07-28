package com.n2s.oops;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading methodOverloading = new MethodOverloading();
		methodOverloading.display("priya");
		methodOverloading.display(2.5f);
	}

	public int display(int x) {
		System.out.println("intx");
		return x;
	}

	public float display(float x) {
		System.out.println("float x");
		return x;
	}

	public int display(int x, int y) {
		System.out.println("intc");
		return x;
	}

	public String display(String s) {
		System.out.println("String");
		return "janani";
	}

}
