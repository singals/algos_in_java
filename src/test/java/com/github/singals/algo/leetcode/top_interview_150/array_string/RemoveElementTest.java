package com.github.singals.algo.leetcode.top_interview_150.array_string;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveElementTest {

    private RemoveElement objUnderTest;
    private int[] nums;
    private Integer val;

    private Integer expectedAnswer;
    private Integer actualAnswer;
    private int[] expectedNums;

    @BeforeEach
    void setUp() {
        objUnderTest = new RemoveElement();
    }

    @AfterEach
    void tearDown() {
        nums = null;
        val = null;
        expectedAnswer = null;
        expectedNums = null;
    }

    @Test
    void removeElementTestOne() {
        nums = new int[]{3, 2, 2, 3};
        val = 3;
        expectedAnswer = 2;
        expectedNums = new int[]{2, 2};

        actualAnswer = objUnderTest.removeElement(nums, val);

        assertEquals(expectedAnswer, actualAnswer);
        assertArrayEquals(expectedNums, Arrays.copyOfRange(nums, 0, actualAnswer));
    }

    @Test
    void removeElementTestTwo() {
        nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        val = 2;
        expectedAnswer = 5;
        expectedNums = new int[]{0, 1, 4, 0, 3};

        actualAnswer = objUnderTest.removeElement(nums, val);

        assertEquals(expectedAnswer, actualAnswer);
        System.out.println(Arrays.toString(expectedNums));
        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 0, actualAnswer)));
        assertArrayEquals(expectedNums, Arrays.copyOfRange(nums, 0, actualAnswer));
    }
}