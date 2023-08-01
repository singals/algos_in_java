package com.github.singals.algo.leetcode.seventyFive;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxConsecutiveOnesTest {
    @Test
    @DisplayName("max-consecutive-ones-when-all-are-ones")
    void maxConsecutiveOnesWhenAllAreOnes() {
        int res = MaxConsecutiveOnes.longestOnes(new int[]{1, 1, 1, 1, 1, 1}, 2);
        assertEquals(6, res);

        res = MaxConsecutiveOnes.longestOnes(new int[]{1, 1, 1, 1, 1, 1}, 1);
        assertEquals(6, res);

        res = MaxConsecutiveOnes.longestOnes(new int[]{1, 1, 1, 1, 1, 1}, 0);
        assertEquals(6, res);

        res = MaxConsecutiveOnes.longestOnes(new int[]{1, 1, 1, 1, 1, 1}, 4);
        assertEquals(6, res);
    }

    @Test
    @DisplayName("max-consecutive-ones-when-all-are-zeroes")
    void maxConsecutiveOnesWhenAllAreZeroes() {
        int res = MaxConsecutiveOnes.longestOnes(new int[]{0, 0, 0, 0, 0, 0}, 2);
        assertEquals(2, res);

        res = MaxConsecutiveOnes.longestOnes(new int[]{0, 0, 0, 0, 0, 0}, 1);
        assertEquals(1, res);

        res = MaxConsecutiveOnes.longestOnes(new int[]{0, 0, 0, 0, 0, 0}, 0);
        assertEquals(0, res);

        res = MaxConsecutiveOnes.longestOnes(new int[]{0, 0, 0, 0, 0, 0}, 4);
        assertEquals(4, res);
    }

    @Test
    @DisplayName("max-consecutive-ones-when-some-are-ones")
    void maxConsecutiveOnesWhenSomeAreOnes() {
        int res = MaxConsecutiveOnes.longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2);
        assertEquals(6, res);

        res = MaxConsecutiveOnes.longestOnes(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3);
        assertEquals(10, res);

        res = MaxConsecutiveOnes.longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 0);
        assertEquals(4, res);
    }
}