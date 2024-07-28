package com.leetcode.apr2022;

import java.util.Iterator;

public class RotateAnArrayLC189 {

	public static void main(String[] args) {
		int k = 3;
		int[] nums = {1,2,3,4,5,6,7 };
		rotate(nums, k);

	}

	private static void rotate(int[] nums, int k) {

		if (nums == null) {
			return;
		}
		if (nums.length < 2) {
			return;
		}
		if (k > nums.length) {
			k = k % nums.length;
			//System.out.println(k);
		}
		
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
	}

	private static void reverse(int[] nums, int lo, int hi) {

		while (lo <= hi) {
			int temp = nums[lo];
			nums[lo] = nums[hi];
			nums[hi] = temp;
			lo++;
			hi--;
		}		
	}
}
