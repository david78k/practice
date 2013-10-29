/*
Best Time to Buy and Sell Stock II Total Accepted: 2256 Total Submissions: 6493 My Submissions
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
*/

public class Stock2 {
	public int maxProfit(int [] prices) {
		for (int p: prices) System.out.println(p);
		return 0;
	}
		
	public static void main (String[] args) {
		Stock2 s = new Stock2();
		int[] prices = {100, 200, 150};
		
		System.out.println(s.maxProfit(prices));	
	}	
}
