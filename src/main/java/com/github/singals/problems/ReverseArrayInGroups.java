package com.github.singals.problems;

/**
 * Given an array of size N. The task is to reverse every k elements (where k is an input to the function) in the array.
 * <p>
 * Example:
 * Input:
 * Array: [1 2 2 4 5 6 7 8]
 * K = 4
 * Output: 4 2 2 1 8 7 6 5
 * <p>
 * Input:
 * Array: [1 2 3 4 5]
 * K = 3
 * Output: 3 2 1 5 4
 */
public class ReverseArrayInGroups {
    public static int[] reverse(int[] arr, int k) {
        int length = arr.length;
        int attempts = length / k;
        if (length % k != 0) attempts++;

        for (int i = 0; i < attempts; i++) {
            int start = k * i;
            int end = start + k - 1;
            if (end >= length) end = length - 1;

            int traverseTo = (start + end) / 2;
            for (int j = start; j <= traverseTo; j++) {
                int temp = arr[j];
                arr[j] = arr[end];
                arr[end] = temp;
                end--;
            }
        }
        return arr;
    }
}
