package com.github.singals.algo.leetcode.seventyFive.hashmap_set;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DifferenceOfArraysTest {
    @Test
    @DisplayName("diff-of-array-when-it-does-not-exist")
    void differenceOfArrayWhenNothingIsCommon() {
        List<List<Integer>> res = DifferenceOfArrays.findDifference(new int[]{1, 2, 3}, new int[]{4, 5, 6});
        assertEquals(2, res.size());
        assertArrayEquals(new Integer[]{1, 2, 3}, res.get(0).toArray());
        assertArrayEquals(new Integer[]{4, 5, 6}, res.get(1).toArray());
    }

    @Test
    @DisplayName("diff-of-array-when-array-is-duplicated")
    void differenceOfArrayWhenEntireArrayIsDuplicated() {
        List<List<Integer>> res = DifferenceOfArrays.findDifference(new int[]{1, 2, 3}, new int[]{1, 2, 3});
        assertEquals(2, res.size());
        assertTrue(res.get(0).isEmpty());
        assertTrue(res.get(1).isEmpty());
    }

    @Test
    @DisplayName("diff-of-array-when-there-are-some-common-numbers")
    void differenceOfArrayWhenThereAreSomeCommonNumbers() {
        List<List<Integer>> res = DifferenceOfArrays.findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6});
        assertEquals(2, res.size());
        assertArrayEquals(new Integer[]{1, 3}, res.get(0).toArray());
        assertArrayEquals(new Integer[]{4, 6}, res.get(1).toArray());

        res = DifferenceOfArrays.findDifference(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2});
        assertEquals(2, res.size());
        assertArrayEquals(new Integer[]{3}, res.get(0).toArray());
        assertTrue(res.get(1).isEmpty());
    }
}