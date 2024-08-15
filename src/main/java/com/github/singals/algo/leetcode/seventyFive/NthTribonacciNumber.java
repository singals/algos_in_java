package com.github.singals.algo.leetcode.seventyFive;

//https://leetcode.com/problems/n-th-tribonacci-number/description/
public class NthTribonacciNumber {
    private final Integer[] trib = new Integer[]{0, 1, 1};

    public int tribonacci(int n) {
        if (n <=2) return trib[n];

        for (int i = 3; i <= n; i++) {
            int sum = trib[0] + trib[1] + trib[2];
            trib[0] = trib[1];
            trib[1] = trib[2];
            trib[2] = sum;
        }
        return trib[2];
    }
}
