package com.n2s.lamdaexpression;

interface Drawable1 {
	public void draw();
}

public class WithoutLamdaExpression {

	public static void main(String[] args) {
		int width = 10;

		Drawable1 d1 = new Drawable1() {

			@Override
			public void draw() {
				System.out.println("draw method" + " " + width);

			}
		};

		d1.draw();
	}

}
