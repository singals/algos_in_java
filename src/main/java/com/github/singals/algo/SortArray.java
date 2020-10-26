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
}
