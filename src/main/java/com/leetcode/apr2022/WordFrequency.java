package com.leetcode.apr2022;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordFrequency {

	public static void main(String[] args) {
		String sentence = "bitty bought butter Butter bitter bitty bought better butter";
		String word="Bitty";
		Map<String, Integer> frequency=	findWordFrequency(sentence,word.toLowerCase());
		System.out.println(word +":"+frequency);

	}

	private static Map<String, Integer> findWordFrequency(String sentence,String word) {
		Map<String,Integer> map=new HashMap<String, Integer>();
		String[] arr=sentence.split(" ");
		for(String str:arr) {
			String s=str.toLowerCase();
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			}else {
				map.put(s, 1);
			}

		}		
		System.out.println("Map :: "+map);		
		//return map.get(word);
		return map;
	}

}
