package com.github.singals.algo.leetcode.seventyFive;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubArrayAfterDeletingOneElementTest {

    @Test
    @DisplayName("longest-sub-array-when-all-are-ones")
    void longestSubArrayWhenAllAreOnes() {
        int res = LongestSubArrayAfterDeletingOneElement.longestSubarray(new int[]{1, 1, 1, 1, 1});
        assertEquals(4, res);

        res = LongestSubArrayAfterDeletingOneElement.longestSubarray(new int[]{1});
        assertEquals(0, res);

        res = LongestSubArrayAfterDeletingOneElement.longestSubarray(new int[]{1, 1, 1, 1, 1, 1, 1});
        assertEquals(6, res);
    }

    @Test
    @DisplayName("longest-sub-array-when-all-are-zeroes")
    void longestSubArrayWhenAllAreZeroes() {
        int res = LongestSubArrayAfterDeletingOneElement.longestSubarray(new int[]{0, 0, 0, 0, 0});
        assertEquals(0, res);

        res = LongestSubArrayAfterDeletingOneElement.longestSubarray(new int[]{0});
        assertEquals(0, res);

        res = LongestSubArrayAfterDeletingOneElement.longestSubarray(new int[]{0, 0, 0, 0, 0, 0, 0});
        assertEquals(0, res);
    }

    @Test
    @DisplayName("longest-sub-array-when-some-are-ones")
    void longestSubArrayWhenSomeAreOnes() {
        int res = LongestSubArrayAfterDeletingOneElement.longestSubarray(new int[]{1, 1, 0, 1});
        assertEquals(3, res);

        res = LongestSubArrayAfterDeletingOneElement.longestSubarray(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1});
        assertEquals(5, res);
    }

}