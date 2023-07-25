package com.github.singals.algo.leetcode.seventyFive;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxNumberOfKSumPairsTest {

    @Test
    @DisplayName("max-operations-when-single-element-in-array")
    void maxOperationWhenSingleElementInArray() {
        int res = MaxNumberOfKSumPairs.maxOperations(new int[]{1}, 5);
        assertEquals(0, res);

        res = MaxNumberOfKSumPairs.maxOperations(new int[]{3}, 3);
        assertEquals(0, res);
    }

    @Test
    @DisplayName("max-operations-when-no-pair-exists")
    void maxOperationWhenNoPairExists() {
        int res = MaxNumberOfKSumPairs.maxOperations(new int[]{1, 2, 6}, 5);
        assertEquals(0, res);

        res = MaxNumberOfKSumPairs.maxOperations(new int[]{1, 2, 3, 4, 5, 6}, 12);
        assertEquals(0, res);
    }

    @Test
    @DisplayName("max-operations-when-there-are-pairs")
    void maxOperationWhenThereArePairs() {
        int res = MaxNumberOfKSumPairs.maxOperations(new int[]{1, 2, 3, 4}, 5);
        assertEquals(2, res);

        res = MaxNumberOfKSumPairs.maxOperations(new int[]{3, 1, 3, 4, 3}, 6);
        assertEquals(1, res);
    }
}