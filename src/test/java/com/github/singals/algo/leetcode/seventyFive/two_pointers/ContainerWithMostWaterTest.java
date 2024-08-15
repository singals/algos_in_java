package com.github.singals.algo.leetcode.seventyFive.two_pointers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    @Test
    @DisplayName("max-area-when-container-is-even")
    void maxAreaWhenContainerIsEven() {
        int res = ContainerWithMostWater.maxArea(new int[]{2, 0, 0, 0, 2});
        assertEquals(8, res);

        res = ContainerWithMostWater.maxArea(new int[]{1, 1});
        assertEquals(1, res);
    }

    @Test
    @DisplayName("max-area")
    void maxArea() {
        int res = ContainerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        assertEquals(49, res);
    }
}