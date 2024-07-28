package com.leetcode.apr2022.hashMap;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_LC1 {

	public static void main(String[] args) {
		int nums[] = { 4, 2, 7, 11, 1, 15, 8, 5 };
		int target = 9;
		int arr[]=twoSum(nums, target);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			int a = nums[i];
			int b = target - a;
			if (m.containsKey(b)) {
				int b_index = m.get(b);
				return new int[] { i, b_index };
			}
			m.put(a, i);
		}
		return null;
	}

}
