package com.github.singals.algo.leetcode.seventyFive.dp_multidimensional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniquePathsTest {
    private UniquePaths objUnderTest;
    private int m;
    private int n;
    private int expectedValue;
    private int actualValue;

    @BeforeEach
    void setUp() {
        objUnderTest = new UniquePaths();
    }

    @AfterEach
    void tearDown() {
        m = -1;
        n = -1;
        expectedValue = -1;
        actualValue = -1;
    }

    @Test
    void uniquePathsTestOne() {
        expectedValue = 28;
        m = 3;
        n = 7;

        actualValue = objUnderTest.uniquePaths(m, n);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void uniquePathsTestTwo() {
        expectedValue = 3;
        m = 3;
        n = 2;

        actualValue = objUnderTest.uniquePaths(m, n);

        assertEquals(expectedValue, actualValue);
    }
}