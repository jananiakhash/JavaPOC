package com.leetcode.apr2022;

import java.util.Stack;

public class BalancedBracket {

	public static void main(String[] args) {

		checkForBalancedBaacskets("]");

	}

	private static void checkForBalancedBaacskets(String str) {
		Stack<Character> stack=new Stack();
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)== '(' || str.charAt(i)== '['|| str.charAt(i)=='{')
		{
			stack.push(str.charAt(i));
			
		}
		else if(!stack.empty() && ((str.charAt(i)=='}'&&stack.peek()=='{')||
                                  (str.charAt(i)==')'&&stack.peek()=='(')||
                                  (str.charAt(i)==']'&&stack.peek()=='[') ))
			
		{
			stack.pop();
			
			
		}
		else {
			stack.push(str.charAt(i));
		}
	}
	if(stack.empty()) {
		System.out.println("Balanced");
	}else {
		System.out.println("unbalanced");
	}
		
		
	}

}
