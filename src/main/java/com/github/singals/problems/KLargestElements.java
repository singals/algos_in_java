package com.github.singals.problems;

import java.util.Arrays;

/**
 * Given an array of N positive integers, print k largest elements from the array.
 */
public class KLargestElements {
    public static int[] kLargest(int[] arr, int k) {
        int length = arr.length;
        Arrays.sort(arr);
        return Arrays.copyOfRange(arr, length - k, length);
    }
}
