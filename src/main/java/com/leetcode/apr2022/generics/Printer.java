package com.leetcode.apr2022.generics;

public class Printer<T> {
	T typeParameter;
	
	public Printer(T parameter) {
		
		this.typeParameter=parameter;
		
	}
		
	public void printValues() {
		System.out.println(typeParameter);
	}

}
