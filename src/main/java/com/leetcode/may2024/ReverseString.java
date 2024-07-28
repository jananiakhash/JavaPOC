package com.leetcode.may2024;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Janani";
        reverseString(s);
	}

	 public static void reverseString(String s) {
		 
		 char[] c = s.toCharArray();
	        int i=0;
	        int j= s.length() -1;

	        while(i < j){
	           char temp = c[i];
	           c[i]= c[j];
	           c[j]=temp;
	           i++;
	           j--;   
	        }
	        
	        System.out.println(String.valueOf(c));
	        
	    }}

