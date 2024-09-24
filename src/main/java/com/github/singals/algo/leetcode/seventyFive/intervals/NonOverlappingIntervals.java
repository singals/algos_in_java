package com.github.singals.algo.leetcode.seventyFive.intervals;

import java.util.Arrays;
import java.util.Comparator;

//https://leetcode.com/problems/non-overlapping-intervals/
public class NonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 1) return 0;

        Arrays.sort(intervals, Comparator.comparingInt((int[] a) -> a[0]));
        int i = 0, j = 1;
        int counter = 0;
        while (j < intervals.length) {
            int[] currInterval, nextInterval;
            currInterval = intervals[i];
            nextInterval = intervals[j];

            if (currInterval[1] <= nextInterval[0]) {
                //non over lapping
                i = j;
                j++;
            } else {
                // currInterval[1] > nextInterval[0]
                //overlapping intervals {1, 3}, {1, 2}, {1, 4} {1,3}
                counter++;
                if (currInterval[1] <= nextInterval[1]) {
//                    intervals[i] = null;
                    j++;
                } else {
//                    intervals[j] = null;
                    i = j;
                    j++;
                }
            }
        }
        return counter;
    }
}
