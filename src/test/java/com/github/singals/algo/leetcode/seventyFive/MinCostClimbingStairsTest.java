package com.github.singals.algo.leetcode.seventyFive;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinCostClimbingStairsTest {

    private MinCostClimbingStairs objUnderTest;
    private int[] cost;
    private Integer expectedValue;
    private Integer actualValue;

    @BeforeEach
    void setUp() {
        objUnderTest = new MinCostClimbingStairs();
    }

    @AfterEach
    void tearDown() {
        cost = null;
        expectedValue = null;
        actualValue = null;
    }

    @Test
    void minCostClimbingStairsTestOne() {
        cost = new int[]{10, 15, 20};
        expectedValue = 15;

        actualValue = objUnderTest.minCostClimbingStairs(cost);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void minCostClimbingStairsTestTwo() {
        cost = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        expectedValue = 6;

        actualValue = objUnderTest.minCostClimbingStairs(cost);

        assertEquals(expectedValue, actualValue);
    }
}