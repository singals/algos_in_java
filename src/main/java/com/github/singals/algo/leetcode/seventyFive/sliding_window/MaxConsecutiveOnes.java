package com.github.singals.algo.leetcode.seventyFive.sliding_window;

/**
 * Given a binary array nums and an integer k,
 * return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
 */
public class MaxConsecutiveOnes {
    public static int longestOnes(int[] nums, int k) {
        int zeroes = 0;
        for (int num : nums) {
            if (num == 0) zeroes++;
        }

        if (zeroes <= k) return nums.length;
        if (zeroes == nums.length) return k;

        int left = 0, right = 0;
        int flipsUsed = 0;
        int currentLength = 0, maxLength = 0;

        while (right < nums.length) {
            if (nums[right] == 1) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
                right++;
            } else {
                if (flipsUsed < k) {
                    currentLength++;
                    flipsUsed++;
                    maxLength = Math.max(maxLength, currentLength);
                    right++;
                } else {
                    if (nums[left] == 0) flipsUsed--;
                    left++;
                    currentLength--;
                }
            }
        }
        return maxLength;
    }
}
