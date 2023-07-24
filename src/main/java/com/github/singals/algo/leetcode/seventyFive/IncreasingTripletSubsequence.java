package com.github.singals.algo.leetcode.seventyFive;

/**
 * Given an integer array nums, return true if there exists a triple of indices
 * (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k].
 * If no such indices exists, return false.
 */
public class IncreasingTripletSubsequence {
    public static boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) return false;
        int firstNum = Integer.MAX_VALUE;
        int secondNum = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= firstNum) firstNum = num;
            else if (num <= secondNum) secondNum = num;
            else return true;
        }
        return false;
    }
}
