package com.github.singals.algo.leetcode.top_interview_150.array_string;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) return nums.length;

        int i = 0, j = 1;
        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                if (j - i == 1) {
                    i++;
                } else {
                    nums[++i] = nums[j];
                }
            }
            j++;
        }

        return i + 1;
    }
}
