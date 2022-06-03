package com.n2s.oops;

public class MethodOverridding extends Superridding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverridding m = new MethodOverridding();
		m.logic();
		
	}
@Override
	public void logic() {
	
		System.out.println("methodoverridding");
		super.logic();
	}

}

class Superridding {
	public void logic() {
		System.out.println("Superridding");
	}
}