package com.github.singals.algo.leetcode.seventyFive;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * Given two 0-indexed integer arrays nums1 and nums2,
 * return a list answer of size 2 where:
 * <p>
 * answer[0] is a list of all distinct integers in nums1
 * which are not present in nums2.
 * answer[1] is a list of all distinct integers in nums2
 * which are not present in nums1.
 * <p>
 * Note that the integers in the lists may be returned in any order.
 */

public class DifferenceOfArrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }

        Iterator<Integer> iterator1 = set1.iterator();
        while (iterator1.hasNext()) {
            Integer num = iterator1.next();
            if (set2.contains(num)) {
                iterator1.remove();
                set2.remove(num);
            }
        }

        Iterator<Integer> iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
            Integer num = iterator2.next();
            if (set1.contains(num)) {
                iterator2.remove();
                set1.remove(num);
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>(set1));
        res.add(new ArrayList<>(set2));
        return res;
    }
}
