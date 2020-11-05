package com.github.singals.algo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortArrayTest {

    @Test
    @DisplayName("bubble-sort-test")
    void TestSortByBubbleSort() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, SortArray.byBubbleSort(new int[]{5, 4, 3, 2, 1}));
        assertArrayEquals(new int[]{6, 7, 8, 9, 10}, SortArray.byBubbleSort(new int[]{10, 9, 8, 7, 6}));
        assertArrayEquals(new int[]{31, 32, 33, 34, 35}, SortArray.byBubbleSort(new int[]{31, 35, 32, 34, 33}));
    }

    @Test
    @DisplayName("merge-sort-test")
    void TestSortByMergeSort() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, SortArray.byMergeSort(new int[]{5, 4, 3, 2, 1}));
        assertArrayEquals(new int[]{6, 7, 8, 9, 10}, SortArray.byMergeSort(new int[]{10, 9, 8, 7, 6}));
        assertArrayEquals(new int[]{31, 32, 33, 34, 35}, SortArray.byMergeSort(new int[]{31, 35, 32, 34, 33}));
    }
}