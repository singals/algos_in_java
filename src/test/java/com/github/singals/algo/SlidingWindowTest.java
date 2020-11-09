package com.github.singals.algo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SlidingWindowTest {

    @Test
    @DisplayName("sliding window - max sum")
    void TestSlidingWindowMaxSum() {
        Assertions.assertEquals(12, SlidingWindow.getMaxSum(new int[]{1, 3, 5, 4, 2, 0}, 3));
        Assertions.assertEquals(9, SlidingWindow.getMaxSum(new int[]{1, 3, 5, 4, 2, 0}, 2));
        Assertions.assertEquals(38, SlidingWindow.getMaxSum(new int[]{9, 17, 12, 5, 2, 3}, 3));
    }
}