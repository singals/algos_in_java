package com.github.singals.algo.gfg.onesixty.arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondLargestTest {

    private SecondLargest objUnderTest;

    private int[] arr;
    private Integer actualResult;
    private Integer expectedResult;

    @BeforeEach
    void setUp() {
        objUnderTest = new SecondLargest();
    }

    @AfterEach
    void tearDown() {
        arr = null;
        actualResult = null;
        expectedResult = null;
    }

    @Test
    void getSecondLargestExOne() {
        arr = new int[]{12, 35, 1, 10, 34, 1};
        expectedResult = 34;

        actualResult = objUnderTest.getSecondLargest(arr);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void getSecondLargestExTwo() {
        arr = new int[]{10, 5, 10};
        expectedResult = 5;

        actualResult = objUnderTest.getSecondLargest(arr);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void getSecondLargestExThree() {
        arr = new int[]{10, 10, 10};
        expectedResult = -1;

        actualResult = objUnderTest.getSecondLargest(arr);

        assertEquals(expectedResult, actualResult);
    }
}