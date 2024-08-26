package com.github.singals.algo.leetcode.seventyFive.bit_manipulation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingBitsTest {

    private CountingBits objUnderTest;

    private Integer n;
    private int[] expectedResult;
    private int[] actualResult;

    @BeforeEach
    void setUp() {
        objUnderTest = new CountingBits();
    }

    @AfterEach
    void tearDown() {
        n = null;
        expectedResult = null;
        actualResult = null;
    }

    @Test
    void countBitsTestOne() {
        n = 2;
        expectedResult = new int[]{0, 1, 1};

        actualResult = objUnderTest.countBits(n);

        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void countBitsTestTwo() {
        n = 5;
        expectedResult = new int[]{0, 1, 1, 2, 1, 2};

        actualResult = objUnderTest.countBits(n);

        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void countBitsTestThree() {
        n = 10;
        expectedResult = new int[]{0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2};

        actualResult = objUnderTest.countBits(n);

        assertArrayEquals(expectedResult, actualResult);
    }
}