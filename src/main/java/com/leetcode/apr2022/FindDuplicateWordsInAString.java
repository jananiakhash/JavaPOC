package com.leetcode.apr2022;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputString = "Java is the best language is java and java";
		 findDuplicateWords(inputString);
		
		

	}

	private static void findDuplicateWords(String inputString) {
		
		String[] arr = inputString.split(" ");
		
        Map<String,Integer> map= new HashMap<String, Integer>();
        
        for(String word :arr) {
        	
        	if(map.containsKey(word)) {
        		map.put(word.toLowerCase(), map.get(word)+1);
        		
        	}else {
        		map.put(word.toLowerCase(), 1);
        	}
        }
        //extracting only the keys
        Set<String> wordsInString = map.keySet();
        
        for(String word:wordsInString) {
        	
        	if(map.get(word)>1) {
        		System.out.println(word +":"+ map.get(word));
        	}
        	
        }
 		
		
	}

}
