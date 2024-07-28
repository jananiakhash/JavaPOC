package com.leetcode.may2024;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {
		
		int[] nums= {3,4,2};
		int [] indexArray = twoSum(nums, 6);
		
		System.out.println(Arrays.toString(indexArray));

		
	}
	 public static int[] twoSum(int[] nums, int target) {
			 Map<Integer, Integer> map = new HashMap<>();
				 for(int i=0; i< nums.length; i++) {
					 int a = nums[i];
					 int b= target - a;
					 if(map.containsKey(b)) {
						int b_index = map.get(b);
						return new int[] {i,b_index};
					 }else {
						 map.put(nums[i], i);
					 }
				 }
			 
		       return new int[2] ;  
		    }   
	    
}
