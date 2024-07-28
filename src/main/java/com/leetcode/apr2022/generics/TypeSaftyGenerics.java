package com.leetcode.apr2022.generics;

public class TypeSaftyGenerics {
	
	public static void main(String[] args) {
		
	Printer<Integer>  thingsToPrint= new Printer<>(25);   
	
	thingsToPrint.printValues();
		
		
	}
	//Generics is used for typesafty 

}
