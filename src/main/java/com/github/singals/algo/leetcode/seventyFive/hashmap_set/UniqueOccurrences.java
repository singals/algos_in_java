package com.github.singals.algo.leetcode.seventyFive.hashmap_set;

import java.util.*;

/**
 * Given an array of integers arr, return true if the number of occurrences
 * of each value in the array is unique or false otherwise.
 */
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
