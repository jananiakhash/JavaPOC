package com.leetcode.apr2022;

public class FibonacciCacheLC509 {
	private static long[] fabonaciiCache;
	public static void main(String[] args) {
		int n = 100;
		fabonaciiCache = new long[n + 1];
		System.out.println(fabonacii(n));
	}

	private static long fabonacii(int n) {
		
		  if (n <= 1) { return n; }
		 
		if (fabonaciiCache[n] != 0) {
			return fabonaciiCache[n];
		}
		long nthfabonaciinumber = fabonacii(n - 1) + fabonacii(n - 2);
		fabonaciiCache[n] = nthfabonaciinumber;
		return nthfabonaciinumber;

	}

}
