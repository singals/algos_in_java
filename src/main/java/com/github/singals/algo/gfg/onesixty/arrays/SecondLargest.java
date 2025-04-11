package com.github.singals.algo.gfg.onesixty.arrays;

/**
 * Given an array of positive integers arr[], return the second largest element from the array. If the second largest
 * element doesn't exist then return -1.
 * <p>
 * Note: The second largest element should not be equal to the largest element.
 * <p>
 * https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/second-largest3735
 */
public class SecondLargest {
    public int getSecondLargest(int[] arr) {
        int max = -1;
        int second = -2;

        for (int curr : arr) {
            if (curr > max) {
                second = max;
                max = curr;
            } else if (curr > second && curr != max) {
                second = curr;
            }
        }

        if (max == second) return -1;
        else return second;
    }
}
