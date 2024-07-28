package com.leetcode.apr2022.twoPointer;

import java.util.Arrays;

public class SortColorsLC75 {
	
	

	public static void main(String[] args) {
		
		int[] arr= {2,0,2,0,1,1,0};
		sortArray(arr);
		Arrays.sort(arr);
		
		for(int i:arr) {
			System.out.print(i);
		}
		
	}



	private static int[] sortArray(int[] arr) {
		
		int lo=0;
		int hi=arr.length-1;
		int cur=0;
		
		while(cur<=hi) {
			if(arr[cur]==0) {
				int temp=arr[lo];
				arr[lo]=arr[cur];
				arr[cur]=temp;
				lo++;
				cur++;
				
			}else if(arr[cur]==2) {
				int temp=arr[hi];
				arr[hi]=arr[cur];
				arr[cur]=temp;
				hi--;
				
			}else {
				cur++;
			}
		}
		

		return arr;
	}

}


