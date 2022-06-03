package com.n2s.oops;

public class Abstraction extends Calci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction a = new Abstraction();
		a.display();
		System.out.println(a.addition(x, y));
		System.out.println(a.subtraction(x, y));

	}

	@Override
	public int addition(int x, int y) {
		// TODO Auto-generated method stub
		return x + y;
	}

	@Override
	public int subtraction(int x, int y) {
		// TODO Auto-generated method stub
		return x - y;
	}

}

abstract class Calci {

	protected static final int x = 10;
	protected static final int y = 4;

	Calci() {
		System.out.println("am a superclass constructor");
	}

	public abstract int addition(int x, int y);

	public abstract int subtraction(int x, int y);

	public void display() {
		System.out.println("display1");
	}

}
