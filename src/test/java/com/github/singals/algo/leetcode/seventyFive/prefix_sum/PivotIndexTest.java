package com.github.singals.algo.leetcode.seventyFive.prefix_sum;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PivotIndexTest {

    @Test
    @DisplayName("pivot-index-when-it-does-not-exist")
    void pivotIndexWhenItDoesNotExist() {
        int pivotIndex = PivotIndex.pivotIndex(new int[]{1, 2, 3, 4, 5});
        assertEquals(-1, pivotIndex);

        pivotIndex = PivotIndex.pivotIndex(new int[]{1, 1});
        assertEquals(-1, pivotIndex);

        pivotIndex = PivotIndex.pivotIndex(new int[]{1, 1});
        assertEquals(-1, pivotIndex);
    }

    @Test
    @DisplayName("pivot-index-when-it-exists")
    void pivotIndexWhenItExists() {
        int pivotIndex = PivotIndex.pivotIndex(new int[]{1, 7, 3, 6, 5, 6});
        assertEquals(3, pivotIndex);

        pivotIndex = PivotIndex.pivotIndex(new int[]{2, 1, -1});
        assertEquals(0, pivotIndex);

        pivotIndex = PivotIndex.pivotIndex(new int[]{1});
        assertEquals(0, pivotIndex);
    }

}