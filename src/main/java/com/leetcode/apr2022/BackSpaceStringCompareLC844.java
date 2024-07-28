package com.leetcode.apr2022;

import java.util.Scanner;
import java.util.Stack;

//"ab#c", t = "ad#c"

public class BackSpaceStringCompareLC844 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.next();
		String str2 = s.next();

	boolean isEmpty=	 backSpaceCompare(str1, str2);
    System.out.println(isEmpty);
	

	}

	public static boolean backSpaceCompare(String s, String t) {

		return processString(s).equals(processString(t));

	}

	private static String processString(String s) {
		Stack<Character> stack = new Stack<Character>();

		for (char c : s.toCharArray()) {
			
			if(c=='#') {
				if(!stack.empty()) {
					stack.pop();
				}
			}else {
				stack.push(c);
			}
		}
		
		

		return String.valueOf(stack);
	}
}
