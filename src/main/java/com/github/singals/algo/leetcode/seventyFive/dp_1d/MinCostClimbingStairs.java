package com.github.singals.algo.leetcode.seventyFive.dp_1d;

//https://leetcode.com/problems/min-cost-climbing-stairs/
public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        prepareDpCost(cost, dp);
        return Math.min(dp[0], dp[1]);
    }

    private void prepareDpCost(int[] cost, int[] dp) {
        int n = cost.length;

        for (int i = n - 1; i >= 0; i--) {
            dp[i] = cost[i] + Math.min(getDpVal(dp, i + 1), getDpVal(dp, i + 2));
        }
    }

    private int getDpVal(int[] dp, int n) {
        if (dp == null) return 0;
        else if (n >= dp.length) return 0;
        else return dp[n];
    }
}
