package com.leetcode.may2024;

public class Merge_Sorted_Array_LC_88 {
	//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
		//	Output: [1,2,2,3,5,6]
			//Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
			//The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
	
	
	//nums1 = [1], m = 1, nums2 = [], n = 0
	public static void main(String[]args) {
		int[] nums1 = {1}; 
		int n = 1;
		
		int[] nums2 = {}; 
		int m = 0;
		
		int[] result = new int[6];
	
		 result = merge(nums1, m, nums2, n, result);
		 for(int r :result ) {
		 System.out.println(r);
		 }
	        
	    }

	private static int[] merge(int[] nums1, int m, int[] nums2, int n, int[] result) {
		// TODO Auto-generated method stub
		 int j = 0;
	        int i = 0;
	        int k = 0;
	        while (i < n && j < m) {
	            if (nums1[i] > nums2[j]) {
	                result[k] = nums2[j];
	                j++;
	                k++;
	            } else if (nums1[i] < nums2[j]) {
	                result[k] = nums1[i];
	                i++;
	                k++;
	            } else {
	                result[k] = nums1[i];
	                i++;
	                k++;
	            }
	        }

	        while (i < n) {
	            result[k] = nums1[i];
	            i++;
	            k++;
	        }

	        while (j < m) {
	            result[k] = nums2[j];
	            j++;
	            k++;
	        }

	        i = 0;
	        k = 0;
	        while (i < m + n) {
	            nums1[i] = result[k];
	            i++;
	            k++;
	        }
		
		return nums1;
		
	}
	


}
