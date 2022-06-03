package com.janani.interfacelearn;

public class CalculatorTester {

	public static void main(String[] args) {
		Addition myAdder = new Calculator(); // created object of concrete class
		System.out.println(myAdder.add(5, 7));
		myAdder.display1();
		Addition.display2();

	}

}
