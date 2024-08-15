package com.github.singals.algo.leetcode.seventyFive.hashmap_set;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualRowAndColumnPairTest {
    @Test
    @DisplayName("equal-pairs-when-no-pair-is-equal")
    void equalPairsWhenNoPairIsEqual() {
        int res = EqualRowAndColumnPair.equalPairs(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        assertEquals(0, res);
    }

    @Test
    @DisplayName("equal-pairs-when-some-pairs-are-equal")
    void equalPairsWhenSomePairsAreEqual() {
        int res = EqualRowAndColumnPair.equalPairs(new int[][]{{3, 2, 1}, {1, 7, 6}, {2, 7, 7}});
        assertEquals(1, res);

        res = EqualRowAndColumnPair.equalPairs(new int[][]{{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}});
        assertEquals(3, res);
    }

    @Test
    @DisplayName("equal-pairs-when-all-pairs-are-equal")
    void equalPairsWhenAllPairsAreEqual() {
        int res = EqualRowAndColumnPair.equalPairs(new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}});
        assertEquals(9, res);

        res = EqualRowAndColumnPair.equalPairs(new int[][]{{8, 8}, {8, 8}});
        assertEquals(4, res);
    }
}