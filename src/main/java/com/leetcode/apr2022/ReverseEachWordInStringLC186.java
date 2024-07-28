package com.leetcode.apr2022;

public class ReverseEachWordInStringLC186 {

	public static void main(String[] args) {
		String str="Sky is blue";
		
		char[] s = str.toCharArray();
		reverse(s,0,s.length-1);
		reverseEachWord(s);
		
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]);
		}
		
		
	}

	private static void reverseEachWord(char[] arr) {
		 int n = arr.length;
	        int lo = 0, hi = 0;

	        while (lo < n) {
	            // go to the end of the word
	            while (hi < n && arr[hi] != ' ') {
	            	hi++;
	            }
	            // reverse the word
	            reverse(arr, lo, hi - 1);
	            // move to the next word
	            lo = hi + 1;
	            ++hi;
	        }
			
			
		}
	

	private static void reverse(char[] s,int lo,int hi) {
	
		
		
		while(lo<hi) {
			char temp=s[lo];
			s[lo]=s[hi];
			s[hi]=temp;
			lo++;
			hi--;
		}
		
	}
	
	

}
