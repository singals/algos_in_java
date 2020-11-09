package com.github.singals.algo;

public class SlidingWindow {

    public static int getMaxSum(int[] arr, int windowSize) {
        int length = arr.length;
        if (windowSize > length) return -1;
        int maxSum = -1;
        int tempSum = 0;
        for (int i = 0; i < length - windowSize; i++) {
            for (int j = 0; j < windowSize; j++) {
                tempSum += arr[i + j];
            }
            if (tempSum > maxSum) maxSum = tempSum;
            tempSum = 0;
        }
        return maxSum;
    }
}
