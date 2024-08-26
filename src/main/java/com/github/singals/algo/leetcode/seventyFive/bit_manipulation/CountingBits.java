package com.github.singals.algo.leetcode.seventyFive.bit_manipulation;

//https://leetcode.com/problems/counting-bits/description/
public class CountingBits {
    public int[] countBits(int n) {
        if (n == 0) return new int[]{0};
        else if (n == 1) return new int[]{0, 1};
        //16,8,4,2,1
        int msb = 2;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        int ctr = 0;
        for (int i = 2; i <= n; i++) {
            dp[i] = 1 + dp[i-msb];
            ctr++;
            if (msb == ctr) {
                msb *=2;
                ctr = 0;
            }
        }
        return dp;
    }
}
