package com.github.singals.algo.leetcode.seventyFive.prefix_sum;

/**
 * There is a biker going on a road trip. The road trip consists of n + 1 points
 * at different altitudes. The biker starts his trip on point 0 with altitude equal 0.
 * <p>
 * You are given an integer array gain of length n where gain[i] is the net gain
 * in altitude between points i and i + 1 for all (0 <= i < n).
 * Return the highest altitude of a point.
 */
public class HighestAltitude {
    public static int largestAltitude(int[] gain) {
        int maxAlt = 0, currAlt = 0;
        for (int gAlt : gain) {
            currAlt += gAlt;
            maxAlt = Math.max(currAlt, maxAlt);
        }
        return maxAlt;
    }
}
