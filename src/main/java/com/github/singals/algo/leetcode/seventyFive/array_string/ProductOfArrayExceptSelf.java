package com.github.singals.algo.leetcode.seventyFive.array_string;

/**
 * Given an integer array nums, return an array answer such that
 * answer[i] is equal to the product of all the elements of nums except nums[i].
 * <p>
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * <p>
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 */
public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] res = new int[length];
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                res[i] = 1;
            } else {
                res[i] = res[i - 1] * nums[i - 1];
            }
        }
        int postfix = 1;
        for (int i = (length - 1); i >= 0; i--) {
            if (i != (length - 1)) {
                postfix *= nums[i + 1];
                res[i] = res[i] * postfix;
            }
        }
        return res;
    }
}
