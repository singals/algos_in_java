package com.github.singals.algo.leetcode.seventyFive.dp_multidimensional;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/description/
public class BestTimeToBuyAndSellStockWithTransactionFee {
    public int maxProfit(int[] prices, int fee) {
        int profit = 0;
        int buy = prices[0];
        for (int price:prices){
            profit = Math.max(profit, price-buy-fee);
            buy = Math.min(buy, price-profit);
        }
        return profit;
    }
}
