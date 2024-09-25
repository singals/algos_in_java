package com.github.singals.algo.leetcode.seventyFive.intervals;

import java.util.*;

public class MinimumArrowsToBurstBalloons {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 1) return 1;

        Arrays.sort(points, Comparator.comparingInt((int[] a) -> a[0] * 10 + a[1]));
        int i = 0, j = 1;
        int arrow = 1;
        Integer maxEnd = points[0][1];
        while (j < points.length) {
            int[] currPoint = points[i];
            int[] nextPoint = points[j];

            if (maxEnd == null) maxEnd = currPoint[1];


            if (maxEnd >= nextPoint[0]) {
                //overlapping, same arrow works :)
                j++;
                maxEnd = Math.min(maxEnd, nextPoint[1]);
            } else {
                //no-overlapping :(
                arrow++;
                i = j;
                j++;
                maxEnd = null;
            }
        }
        return arrow;
    }
}
