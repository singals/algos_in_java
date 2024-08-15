package com.github.singals.algo.leetcode.seventyFive.two_pointers;

import java.util.Arrays;

/**
 * You are given an integer array nums and an integer k.
 * <p>
 * In one operation, you can pick two numbers from the array whose sum equals
 * k and remove them from the array.
 * <p>
 * Return the maximum number of operations you can perform on the array.
 */
public class MaxNumberOfKSumPairs {
    public static int maxOperations(int[] nums, int k) {
        if (nums.length == 1) return 0;
        Arrays.sort(nums);
        int sumPairs = 0, left = 0, right = nums.length - 1;
        while (left < right) {
            int currSum = nums[left] + nums[right];
            if (currSum == k) {
                sumPairs++;
                //discard from array
                nums[left] = -1;
                nums[right] = -1;
                //adjust the pointers
                left++;
                right--;
            } else if (currSum < k) {
                left++;
            } else {
                right--;
            }
        }
        return sumPairs;
    }
}
