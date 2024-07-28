package com.leetcode.apr2022;

public class ReverseStringLC344 {

	public static void main(String[] args) {

		String s = "A man, a plan, a canal: Panama";
		
		boolean isPalindrome = isPalindrome(s);
		System.out.println(isPalindrome);

	}

	private static boolean isPalindrome(String s) {
		s=s.replaceAll("[^a-zA-Z0-9_-]", "");
		if (s.equalsIgnoreCase(reverse(s))) 
			return true;
		
	    return false;	

	}

	private static String reverse(String s) {

		char[] arr = s.toCharArray();
		int lo = 0;
		int hi = arr.length - 1;
		while (lo <= hi) {
			char temp = arr[hi];
			arr[hi] = arr[lo];
			arr[lo] = temp;
			lo++;
			hi--;
		}

		return new String(arr);

	}

}
