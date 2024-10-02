package com.github.singals.algo.leetcode.top_interview_150.array_string;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int j = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[j - 2]) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }
}
