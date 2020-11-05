package com.github.singals.algo;

import java.util.stream.IntStream;

public class SortArray {
    public static int[] byBubbleSort(int[] arr) {
        int length = arr.length;
        IntStream.range(0, length).
                forEach(i -> IntStream.range(1, length - i).
                        forEach(j -> {
                            if (arr[j - 1] > arr[j]) {
                                //swap elements
                                int temp = arr[j - 1];
                                arr[j - 1] = arr[j];
                                arr[j] = temp;
                            }
                        }));
        return arr;
    }

    public static int[] byMergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
        return arr;
    }

    private static void mergeSort(int[] arr, int l, int r) {
//        System.out.format("mergeSort-> arr: %s, l: %d, r: %d \n", Arrays.toString(arr), l, r);
        if (r > l) {
            // more than 1 element present
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    private static void merge(int[] arr, int l, int m, int r) {
//        System.out.format("merge-> arr: %s, l: %d, m: %d, r: %d \n", Arrays.toString(arr), l, m, r);
        // merge sub arrays l..m m+1..r
        for (int i = 0; i <= m; i++) {
            for (int j = m + 1; j <= r; j++) {
                if (arr[i] > arr[r]) {
                    int temp = arr[i];
                    arr[i] = arr[r];
                    arr[r] = temp;
                } else if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    break;
                }
            }
        }
    }
}
