package com.github.singals.algo.leetcode.top_interview_150.array_string;

//https://leetcode.com/problems/remove-element/
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int ctr = 0;
        int rightPtr = nums.length - 1;

        for (int i = 0; i < nums.length - ctr; i++) {
            int num = nums[i];
            if (num == val) {
                //swap with right-pointer
                nums[i] = nums[rightPtr];
                nums[rightPtr] = -1;
                ctr++;
                rightPtr--;
                i--;
            }
        }

        return nums.length - ctr;
    }
}
