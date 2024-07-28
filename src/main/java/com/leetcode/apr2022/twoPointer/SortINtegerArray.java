package com.leetcode.apr2022.twoPointer;

public class SortINtegerArray {

	public static void main(String[] args) {
		int[] arr= {0,1,2,3-1,-2,-3,4};
		sortGivenArray(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}

	}

		
		
		private static int[] sortGivenArray(int[] arr) {
			
			int lo= 0;
			int hi= arr.length-1;
			int cur= 0;
			
			
			while(lo<=hi) {
				  if(arr[cur]<0) {
					int temp=arr[lo];
					arr[lo]=arr[cur];
					arr[cur]=temp;
					lo++;
					cur++;
					  
				  }else {
					  int temp=arr[hi];
					  arr[hi]=arr[cur];
					  arr[cur]=temp;
					  hi--;
					  
					  
				  }

				
			}
			
		
			return arr;
		}

}