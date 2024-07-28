package com.leetcode.apr2022.stack;

import java.util.Arrays;
import java.util.Stack;

public class AdjacentDuplicatesInString {

	public static void main(String[] args) {
		String s = "aabababcab";
	
		String s1 = removeDuplicates(s);
		System.out.println(s1);

	}

	private static String removeDuplicates(String s) {

		Stack<Character> st = new Stack<Character>();
		

		if (s.length() == 0) {
			return null;
		}
	
		for (char c : s.toCharArray()) {
			if (!st.empty()) {
				if (c == st.peek()) {
				 st.pop();
					

				} else {
					st.push(c);
				}

			} else {
				st.push(c);
			}
		}
		int i=0;
		char[] arr = new char[st.size()];
		
		for(char c:st) {
			arr[i++]=c;
		}
		return new String(arr);

	}

}
