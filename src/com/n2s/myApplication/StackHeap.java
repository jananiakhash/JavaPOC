package com.n2s.myApplication;

public class StackHeap {
	String name;
	int age;

	public StackHeap() {
		System.out.println("priya");

	}

	public StackHeap(String s, int i) {
		this.name = s;
		this.age = i;
		System.out.println(s + " " + i);

	}

	public static void main(String[] janani) {
		// TODO Auto-generated method stub

		StackHeap s = new StackHeap("janani", 30);

	}

	private static String display(String name) {
		return name;

	}

}
