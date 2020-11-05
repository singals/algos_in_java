package com.github.singals.algo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortArrayTest {

    @Test
    @DisplayName("bubble-sort-test")
    void TestSortByBubbleSort() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, SortArray.byBubbleSort(new int[]{5, 4, 3, 2, 1}));
    }
}