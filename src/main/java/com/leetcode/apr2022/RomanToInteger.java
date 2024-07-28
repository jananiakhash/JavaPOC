package com.leetcode.apr2022;

public class RomanToInteger {
	
public static void main(String[] args) {
	
	
		String s= intToRoman(56);
		System.out.println(s);
	
}

public static String intToRoman(int num) { 
	final String[] thousands = {"", "M", "MM", "MMM"};
     final String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}; 
      final String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
      final String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    return thousands[num  / 1000] + hundreds[num % 1000 / 100] + tens[num % 100 / 10] + ones[num % 10];
}

}