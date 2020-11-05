package com.github.singals.algo;

import java.util.Arrays;
import java.util.Objects;

public class SearchArray {
    public static boolean byLinearSearch(Integer[] arr, Integer element) {
        for (Integer arrElement : arr) {
            if (Objects.equals(arrElement, element)) {
                return true;
            }
        }
        return false;
    }

    public static boolean byBinarySearch(Integer[] sortedArr, Integer element) {
        int max = sortedArr.length;
        if (max == 1) return Objects.equals(element, sortedArr[0]);
        int mid = max / 2;
        if (Objects.equals(sortedArr[mid], element)) return true;
        if (sortedArr[mid] > element) {
            Integer[] subArr = Arrays.copyOfRange(sortedArr, 0, mid);
            return byBinarySearch(subArr, element);
        } else {
            Integer[] subArr = Arrays.copyOfRange(sortedArr, mid, sortedArr.length);
            return byBinarySearch(subArr, element);
        }
    }
}
