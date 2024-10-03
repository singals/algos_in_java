package com.github.singals.algo.leetcode.top_interview_150.array_string;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        Integer buyingPrice = null;
        Integer sellingPrice = null;
        Integer maxProfit = 0;

        for (int price : prices) {
            if (buyingPrice == null) buyingPrice = price;
            else if (price < buyingPrice) {
                if (sellingPrice != null) {
                    maxProfit = Math.max(maxProfit, sellingPrice - buyingPrice);
                    sellingPrice = null;
                }
                buyingPrice = price;
            } else if (sellingPrice == null) {
                sellingPrice = price;
                maxProfit = Math.max(maxProfit, sellingPrice - buyingPrice);
            } else if (price > sellingPrice) {
                sellingPrice = price;
                maxProfit = Math.max(maxProfit, sellingPrice - buyingPrice);
            }
        }

        return maxProfit;
    }
}
