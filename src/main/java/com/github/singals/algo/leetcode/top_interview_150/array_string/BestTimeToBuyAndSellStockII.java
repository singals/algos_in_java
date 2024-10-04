package com.github.singals.algo.leetcode.top_interview_150.array_string;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        Integer purchPrice = null, salesPrice = null;
        int maxProfit = 0;
        for (int i = 0; i < length - 1; i++) {
            int thisPrice = prices[i];
            int nextPrice = prices[i + 1];

            if (thisPrice < nextPrice) {
                if (purchPrice == null || purchPrice > thisPrice) purchPrice = thisPrice;
            } else if (thisPrice > nextPrice) {
                if (purchPrice != null) {
                    salesPrice = thisPrice;
                    int profit = salesPrice - purchPrice;
                    maxProfit += profit;
                    purchPrice = null;
                    salesPrice = null;
                }
            }
        }
        if (purchPrice != null && salesPrice == null && prices[length - 1] > purchPrice) {
            maxProfit += prices[length - 1] - purchPrice;
        }
        return maxProfit;
    }
}
