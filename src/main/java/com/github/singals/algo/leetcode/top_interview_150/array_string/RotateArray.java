package com.github.singals.algo.leetcode.top_interview_150.array_string;

import java.util.Arrays;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        if (length < 2) return;
        if (k > length) k = k % length;
        if (k == 0) return;
//        int[] cp = Arrays.copyOf(nums, length);
//
//        for (int i = 0; i < length; i++) {
//            int rotationIndex = (i + k) % length;
//            nums[rotationIndex] = cp[i];
//        }

        //in O(1) space

        //reverse
        for (int i = 0; i < length / 2; i++) {
            int temp = nums[i];
            int otherIndex = length - 1 - i;
            nums[i] = nums[otherIndex];
            nums[otherIndex] = temp;
        }

        //reverse 1st k elements
        for (int i = 0; i < k / 2; i++) {
            int temp = nums[i];
            int otherIndex = k - 1 - i;
            nums[i] = nums[otherIndex];
            nums[otherIndex] = temp;
        }

        //reverse k-n elements
        for (int i = 0; i < (length - k) / 2; i++) {
            int temp = nums[i + k];
            int otherIndex = length - 1 - i;
            nums[i + k] = nums[otherIndex];
            nums[otherIndex] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }

}
