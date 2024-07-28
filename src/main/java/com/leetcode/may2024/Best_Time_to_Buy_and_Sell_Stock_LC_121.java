package com.leetcode.may2024;

public class Best_Time_to_Buy_and_Sell_Stock_LC_121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input: prices = [7,1,5,3,6,4]
		//	Output: 5
		//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.

		int[] prices = {7,1,5,3,6,4};

		int a = maxProfit(prices);
		System.out.println(a);
	}

	public static int maxProfit(int[] prices) {
		int minBuyPrice = prices[0];
		int maxProfit = 0;
		for(int i=1; i< prices.length; i++) {
			if(prices[i]< minBuyPrice) {
				minBuyPrice = prices[i];
			}else {
				int currentProfit = prices[i]- minBuyPrice;
				if(currentProfit > maxProfit) {
					maxProfit = currentProfit;
				}
			}
		}
		
		return maxProfit;
    }

	

}
