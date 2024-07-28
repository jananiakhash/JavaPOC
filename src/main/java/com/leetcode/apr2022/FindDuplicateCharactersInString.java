package com.leetcode.apr2022;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharactersInString {

	public static void main(String[] args) {
		String str="Programming";
		/*
		 * StringBuffer sb=new StringBuffer();
		 * 
		 * char[] arr=str.toCharArray();
		 * 
		 * for(int i=0;i<arr.length;i++) { for(int j=i+1;j<arr.length;j++) {
		 * if(arr[i]==arr[j]) { sb.append(arr[i]); }
		 * 
		 * } } System.out.println(sb);
		 */
		findDuplicateWords( str);
		

	}

	private static void findDuplicateWords(String inputString) {
		
		char[] arr=inputString.toCharArray();
		
        Map<Character,Integer> map= new HashMap<Character, Integer>();
        
        for(char c :arr) {
        	
        	if(map.containsKey(c)) {
        		map.put(c, map.get(c)+1);
        		
        	}else {
        		map.put(c, 1);
        	}
        }
        //extracting only the keys
        Set<Character> charInString = map.keySet();
        
        for(char c:charInString) {
        	
        	if(map.get(c)>1) {
        		System.out.println(c +":"+ map.get(c));
        		
        		
       		
        		
        	}
        	
        }
 		
		
	}

}
