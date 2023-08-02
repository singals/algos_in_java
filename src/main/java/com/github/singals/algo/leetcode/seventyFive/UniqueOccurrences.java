package com.github.singals.algo.leetcode.seventyFive;

import java.util.*;

public class UniqueOccurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        if (arr.length == 1) return true;
        Map<Integer, Integer> nums = new HashMap<>();
        for (int num : arr) {
            Integer existingCount = nums.get(num);
            if (existingCount == null) nums.put(num, 1);
            else nums.put(num, ++existingCount);
        }

        Set<Integer> temp = new HashSet<>(nums.size());
        for (Map.Entry<Integer, Integer> es : nums.entrySet()) {
            if (temp.contains(es.getValue())) return false;
            temp.add(es.getValue());
        }

        return true;
    }
}
