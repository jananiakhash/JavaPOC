package com.leetcode.apr2022;

public class PalindromeNumberLC9 {
	
	static int n=-121;
	static int s=0;
	static int r;
	static int temp=n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(n>0) {
			r=n%10;
			n=n/10;
			s=s*10+r;
		}
		
		if(temp==s) {
			System.out.println("Given number is palindrome");
		}else {
			System.out.println("Given number is not palindrome");
		}

	}

}
