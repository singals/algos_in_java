package com.github.singals.algo.leetcode.seventyFive;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

// https://leetcode.com/problems/koko-eating-bananas/description/
public class KokoEatingBananas {

    public static int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        long totalBananas = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
            totalBananas += pile;
        }

        if (h == piles.length) return max;
        if (totalBananas <= h) return 1;

        int left = 1;
        int right = max;
        int mid = (left + right) / 2;
        int currMin = Integer.MAX_VALUE;

        while (left <= right) {
            int hoursTakenToConsumePile = 0;
            for (int pile : piles) {
                hoursTakenToConsumePile += ceilDiv(pile, mid);
                if (hoursTakenToConsumePile > h) break;
            }
            if (hoursTakenToConsumePile > h) {
                //increase rate
                left = mid + 1;
            } else {
                //decrease rate
                currMin = Math.min(currMin, mid);
                right = mid - 1;
            }
            mid = (left + right) / 2;
        }
        return currMin == Integer.MAX_VALUE ? max : currMin;
    }

    public static int ceilDiv(int x, int y) {
        return (x + y - 1) / y;
    }
}
