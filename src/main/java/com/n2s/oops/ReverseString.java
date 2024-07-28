package com.n2s.oops;

public class ReverseString {

	public static void main(String[] args) {

		String s = "RADAR", rev_str = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev_str = rev_str + s.charAt(i);

		}
		System.out.println(rev_str);

		if (rev_str.equalsIgnoreCase(s)) {
			System.out.println(s + " " + "is a palindrome string");
		}
	}

}
