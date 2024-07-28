package com.leetcode.apr2022;

public class MoveNegativePositiveNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr= {1,-1,2,-2,3,-3,4,-4,5,5};
		findPositiveAndNegative(arr);
	   for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]);
	}

	}
	
	private static int[] findPositiveAndNegative(int[] arr) {
		
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
