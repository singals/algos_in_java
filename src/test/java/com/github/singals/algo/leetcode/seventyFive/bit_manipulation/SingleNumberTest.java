package com.github.singals.algo.leetcode.seventyFive.bit_manipulation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    private SingleNumber objUnderTest;

    private int[] nums;
    private Integer expectedResult;
    private Integer actualResult;

    @BeforeEach
    void setUp() {
        objUnderTest = new SingleNumber();
    }

    @AfterEach
    void tearDown() {
        nums = null;
        expectedResult = null;
        actualResult = null;
    }

    @Test
    void singleNumberTestOne() {
        nums = new int[]{2,2,1};
        expectedResult = 1;

        actualResult = objUnderTest.singleNumber(nums);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void singleNumberTestTwo() {
        nums = new int[]{4,1,2,1,2};
        expectedResult = 4;

        actualResult = objUnderTest.singleNumber(nums);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void singleNumberTestThree() {
        nums = new int[]{1};
        expectedResult = 1;

        actualResult = objUnderTest.singleNumber(nums);

        assertEquals(expectedResult, actualResult);
    }
}