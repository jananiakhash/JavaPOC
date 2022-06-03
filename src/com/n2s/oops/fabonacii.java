package com.n2s.oops;

public class fabonacii {
	static int n1 = 0, n2 = 1, n3 = 0;

	public static void main(String[] args) {
		int count = 10;
		System.out.print(n1 + " " + n2);
		fabonociRecursive(count - 2);

	}

	public static void fabonociRecursive(int i) {
		if (i > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			fabonociRecursive(i - 1);
		}

	}

}
