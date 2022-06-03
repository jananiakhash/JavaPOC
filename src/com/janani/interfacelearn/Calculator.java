package com.janani.interfacelearn;

public class Calculator implements Addition, Subtract {

	@Override
	public int sub(int x, int y) {
		return x-y;
	}

	@Override
	public int add(int x, int y) {
		return x+y;
	}
	
	@Override
	public void display1() {
		System.out.println("Inside Calculator.display1() - UPGRADE");
	}

}
