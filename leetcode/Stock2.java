/*
Best Time to Buy and Sell Stock II Total Accepted: 2256 Total Submissions: 6493 My Submissions
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
*/

public class Stock2 {
	public int maxProfit(int [] prices) {
		if(prices == null) return 0;
		int profit = 0;
		for(int i = 1; i < prices.length; i ++) {
			if(prices[i] > prices[i - 1])
				profit += prices[i] - prices[i - 1];
		}		
		return profit;
	}

	public int maxProfit2(int [] prices) {
		if(prices == null) return 0;

		int profit = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int len = prices.length;
		int p;
		int begin = 0, end = 0;

		while (begin < len) {
			max = Integer.MIN_VALUE;
			min = Integer.MAX_VALUE;
			p = 0;
			// find max
			for (int i = begin; i < len; i ++) {
				p = prices[i];
				System.out.println(p);
				if (max < p) {
					max = p;
					end = i;
				}
			}
			//System.out.println("end = " + end);
			// find min before max
			for (int i = begin; i < end; i ++) {
				min = Math.min(min, prices[i]);
				//System.out.println(min);
			}
			
			System.out.println("(max, min) = (" + max + ", " + min + ")");
			if (begin != end) 
				profit += (max - min);
			begin = end + 1;	
			System.out.println();
		}
	
		return profit;
	}
		
	public static void main (String[] args) {
		Stock2 s = new Stock2();
		int[] prices = {100, 200, 150}; // max profit = 100
		//int[] prices = {200, 130, 100, 150, 210, 80, 90}; // max profit = 120 = 110 + 10
		//int[] prices = {100};
		//int[] prices = {120, 100, 180};

		// check null prices
		//prices = null;
		// check empty prices
		//int[] prices = {};

		System.out.println(s.maxProfit(prices));	
	}	
}
