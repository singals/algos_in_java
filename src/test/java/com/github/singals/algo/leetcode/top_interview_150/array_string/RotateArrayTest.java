package com.github.singals.algo.leetcode.top_interview_150.array_string;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {

    private RotateArray objUnderTest;

    private int[] nums;
    private int[] expectedNums;
    private Integer k;

    @BeforeEach
    void setUp() {
        objUnderTest = new RotateArray();
    }

    @AfterEach
    void tearDown() {
        nums = null;
        expectedNums = null;
        k = null;
    }

    @Test
    void rotateTestOne() {
        nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        k = 3;
        expectedNums = new int[]{5, 6, 7, 1, 2, 3, 4};

        objUnderTest.rotate(nums, k);

        assertArrayEquals(expectedNums, nums);
    }

    @Test
    void rotateTestTwo() {
        nums = new int[]{-1,-100,3,99};
        k = 2;
        expectedNums = new int[]{3,99,-1,-100};

        objUnderTest.rotate(nums, k);

        assertArrayEquals(nums, expectedNums);
    }

    @Test
    void rotateTestThree() {
        nums = new int[]{-1};
        k = 2;
        expectedNums = new int[]{-1};

        objUnderTest.rotate(nums, k);

        assertArrayEquals(nums, expectedNums);
    }

    @Test
    void rotateTestFour() {
        nums = new int[]{1,2};
        k = 3;
        expectedNums = new int[]{2,1};

        objUnderTest.rotate(nums, k);

        assertArrayEquals(nums, expectedNums);
    }
}