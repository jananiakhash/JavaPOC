package com.leetcode.may2024;

public class IsSubsequence_LC_392 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Boolean isSubsequence =isSubsequence("abc", "ac");
		System.out.println(isSubsequence);

	}
	
	 public static boolean isSubsequence(String s, String t) {
		    if (s.isEmpty()) {
	            return true; 
	           }
	        if (t.isEmpty()) {
	            return false; 
	        }
	        
	        if(t.length()< s.length()){
	        	return false;
	        }

	        int i = 0;
	        int j = 0;

	        while (i < s.length() && j < t.length()) {
	            if (s.charAt(i) == t.charAt(j)) {
	                i++;
	            }
	            j++;
	        }

	        return i == s.length();
	    }
}
