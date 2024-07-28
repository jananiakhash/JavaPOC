package com.leetcode.apr2022.stack;

public class MyStackTester {

	public static void main(String[] args) {
		
		MyStack st=new MyStack(5);
		
		st.push(100);
		st.push(200);
		st.push(300);
		st.push(400);
		st.pop();
		st.peek();
		st.push(500);
		st.push(600);
		st.push(700);
		
		System.out.println(st.isEmpty());
		System.out.println(st.length());
		System.out.println(st.peek());
		

	}

}
