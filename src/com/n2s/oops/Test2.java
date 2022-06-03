package com.n2s.oops;

public class Test2 {

	public static void main(String[] janani) {
		System.out.println(janani[2]);
	}

	public static void display() {
		System.out.println("good");
	}

	public void print() {
		System.out.println("print  parent");
	}

}

class Child extends Test2 {

	// This method is hidden by display() in Base
	public static void display() {
		System.out.println("Static or class method from Derived");
	}

	// This method overrides print() in Base
	public void print() {
		System.out.println("Non-static or Instance method from Derived");
	}
}