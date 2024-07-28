package com.n2s.myApplication;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Constructor c = new Constructor(8);
		new SubConstructor();
	}

	Constructor() {
		System.out.println("Default constructor");

	}

	Constructor(int x) {
		this(5, "priya");
		System.out.println("Single param" + "" + x);

	}

	Constructor(int x, String s) {
		System.out.println("Double param param" + " " + x + " " + s);

	}

}

class SubConstructor extends Constructor {
	public SubConstructor() {
		// TODO Auto-generated constructor stub
		super(4,"janani");
		System.out.println("subconstructor");
	}
}