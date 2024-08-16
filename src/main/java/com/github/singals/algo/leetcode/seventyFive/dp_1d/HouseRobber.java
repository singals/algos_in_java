package com.github.singals.algo.leetcode.seventyFive.dp_1d;

//https://leetcode.com/problems/house-robber/description/

import java.util.Arrays;

public class HouseRobber {
//    2,1,1,2
    public int rob(int[] nums) {
        int prev1 = 0, prev2 = 0;

        for (int num: nums){
            int tmp = prev1;
            prev1 = Math.max(prev1, prev2 + num);
            prev2 = tmp;
        }

        return prev1;
    }
}
