package com.leetcode.apr2022;

public class DigitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1522;
		int count = 0;
		while (a != 0) {
			a = a / 10;
			count++;
		}

		System.out.println(count);
	}

}
