package com.github.singals.algo.leetcode.top_interview_150.array_string;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {

    private MajorityElement objUnderTest;

    private int[] nums;
    private Integer expectedResult;
    private Integer actualResult;

    @BeforeEach
    void setUp() {
        objUnderTest = new MajorityElement();
    }

    @AfterEach
    void tearDown() {
        nums = null;
        expectedResult = null;
        actualResult = null;
    }

    @Test
    void majorityElementTestOne() {
        nums = new int[]{3, 2, 3};
        expectedResult = 3;

        actualResult = objUnderTest.majorityElement(nums);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void majorityElementTestTwo() {
        nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        expectedResult = 2;

        actualResult = objUnderTest.majorityElement(nums);

        assertEquals(expectedResult, actualResult);
    }
}