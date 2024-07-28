package com.n2s.myApplication;

import java.util.Scanner;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i <= 10; i++) {

			if (i == 7) {
				break;
			}
			System.out.println(i);

		}

		Scanner scanner = new Scanner(System.in);

		String my_Str = scanner.next();
		String rev_Str = "";

		for (int i = my_Str.length() - 1; i >= 0; i--) {
			rev_Str = rev_Str + my_Str.charAt(i);

		}
		if (my_Str.equalsIgnoreCase(rev_Str)) {
			System.out.println(my_Str + " " + "is a Palindrome string");

		} else {
			System.out.println(my_Str + " " + "is not a Palindrome string");
		}

		for (int counter = 10; counter >= 0; counter--) {

			if (counter == 4) {
				continue;
			}
			System.out.println(counter);
		}

		int counter = 10;
		while (counter >= 0) {
			if (counter == 7) {

				counter--;
				break;
			}

			System.out.println(counter);
			counter--;
		}

	}

}
