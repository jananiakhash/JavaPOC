package com.leetcode.may2024;

import java.util.LinkedList;

public class Find_the_Index_of_the_First_Occurrence_in_a_String_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(strStr("issip", "mississippi"));

	}

	private static int strStr(String s, String t) {
		// TODO Auto-generated method stub
		
		int i= 0;
		int j= 0;
		int startIndex = -1;
		
		if(s.isEmpty())
			return -1;
		
		if(t.isEmpty())
			return -1;
		
		if(t.length() < s.length()) {
			return -1;
		}
		
		while (i< s.length() && j< t.length()) {
			if (s.charAt(i) == t.charAt(j)) {
				if(i== 0) {
					startIndex = j;
				}
				i++;
				j++;					
			}else {
				startIndex =-1;
				i=0;
				j++;
				
			}
		}
		
		
		return startIndex;
	}

}
