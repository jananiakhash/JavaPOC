package com.leetcode.apr2022.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FourSum_LC18 {

	public static void main(String[] args) {
		int nums[] = { 4, 2, 7, 11, 1, 15, 8, 5 };
		int target = 9;
		
		List<List<Integer>> result =twoSum(nums, target);
		
		for(List<Integer> childList : result) {
			System.out.println(childList.get(0)+", "+childList.get(1));
		}

	}
	
	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList();
		//if()
		
    
		return result;
	}
	
	
	
	public static List<List<Integer>> twoSum(int[] nums, int target) {
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		List<List<Integer>> result = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			int a = nums[i]; //item from array a
			int b = target - a; //a's pair - b
			if (m.containsKey(b)) {
				List<Integer> childList = new ArrayList<Integer>();
				childList.add(a); //item from array a
				childList.add(b); //a's pair - b
				result.add(childList);
			}
			m.put(a, i);
		}
		return result;
	}


}
