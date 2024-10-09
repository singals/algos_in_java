package com.github.singals.algo.leetcode.top_interview_150.array_string;

// https://leetcode.com/problems/jump-game-ii/description/
public class JumpGameII {
    public int jump(int[] nums) {
        if (nums.length == 1) return 0;
        int length = nums.length;
        int i = 0;
        int jumps = 0;
        while (i < length) {
            int num = nums[i];
            if ((num + i) >= length - 1) {
                jumps++;
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
            else {
                i = tempInd;
                jumps++;
            }
        }

        return jumps;
    }
}
