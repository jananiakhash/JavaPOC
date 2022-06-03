package com.n2s.assignments;

public class Rev_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String org_String = "Appa";
		String rev_str = "";
		for (int i = org_String.length() - 1; i >= 0; i--) {
			rev_str = rev_str + org_String.charAt(i);
		}
		System.out.println(rev_str);

	}
}
