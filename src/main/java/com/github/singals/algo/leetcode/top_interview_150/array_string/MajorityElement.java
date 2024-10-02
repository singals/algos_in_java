package com.github.singals.algo.leetcode.top_interview_150.array_string;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
//        Map<Integer, Integer> numCount = new HashMap<>();
//        for (int num : nums) {
//            if (numCount.containsKey(num)) {
//                Integer currentCount = numCount.get(num);
//                numCount.put(num, ++currentCount);
//            } else {
//                numCount.put(num, 1);
//            }
//        }
//
//        Integer currentNum = null;
//        int majority = nums.length / 2;
//        for (Integer num : numCount.keySet()) {
//            Integer thisCount = numCount.get(num);
//            if (thisCount > majority) {
//                currentNum = num;
//                break;
//            }
//        }
//
//        return currentNum;

        // using O(1) space
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) candidate = num;
            if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}
