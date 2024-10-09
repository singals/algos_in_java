package com.github.singals.algo.leetcode.top_interview_150.array_string;

// https://leetcode.com/problems/jump-game/description/
public class JumpGame {
    public boolean canJump(int[] nums) {
        int length = nums.length;
        boolean canJump = false;
        int i = 0;
        while (!canJump && i < length) {
            int num = nums[i];
            if ((num + i) >= length - 1) {
                canJump = true;
                break;
            }
            int temp = num;
            int tempInd = i;
            for (int j = i + 1; j - i <= num && j <= length; j++) {
                int reach = j - i + nums[j];
                if (reach > temp) {
                    temp = reach;
                    tempInd = j;
                }
            }
            if (i == tempInd) break;
            else i = tempInd;
        }

        return canJump;
    }
}
