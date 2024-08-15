package com.github.singals.algo.leetcode.seventyFive.two_pointers;

/**
 * Given an integer array nums, move all 0's to the end of it while
 * maintaining the relative order of the non-zero elements.
 * <p>
 * Note that you must do this in-place without making a copy of the array.
 */
public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        if (nums.length <= 1) return;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != count) {
                    int tmp = nums[i];
                    nums[i] = nums[count];
                    nums[count] = tmp;
                }
                count++;
            }
        }
    }
}
