package com.github.singals.algo.leetcode.seventyFive.sliding_window;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumAverageSubArray1Test {

    @Test
    @DisplayName("find-max-average")
    void findMaxAverage() {
        double res = MaximumAverageSubArray1.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4);
        assertEquals(12.75, res);

        res = MaximumAverageSubArray1.findMaxAverage(new int[]{5}, 1);
        assertEquals(5, res);

        res = MaximumAverageSubArray1.findMaxAverage(new int[]{0, 4, 0, 3, 2}, 1);
        assertEquals(4, res);
    }

}