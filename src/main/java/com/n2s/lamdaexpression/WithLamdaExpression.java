package com.n2s.lamdaexpression;

public class WithLamdaExpression {

	public static void main(String[] args) {
		int width = 10;

		Drawable d2 = () -> {
			System.out.println("lamda" + " " + width);
		};
		d2.draw();

	}

}

interface Drawable {
	public void draw();

}
