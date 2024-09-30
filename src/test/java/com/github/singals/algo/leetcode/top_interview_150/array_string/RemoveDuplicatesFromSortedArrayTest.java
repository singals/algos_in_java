package com.github.singals.algo.leetcode.top_interview_150.array_string;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

    private RemoveDuplicatesFromSortedArray objUnderTest;

    private int[] nums;
    private int[] expectedNums;
    private Integer expectedAnswer;
    private Integer actualAnswer;

    @BeforeEach
    void setUp() {
        objUnderTest = new RemoveDuplicatesFromSortedArray();
    }

    @AfterEach
    void tearDown() {
        nums = null;
        expectedNums = null;
        expectedAnswer = null;
        actualAnswer = null;
    }

    @Test
    void removeDuplicatesTestOne() {
        nums = new int[]{1, 1, 2};
        expectedNums = new int[]{1, 2};
        expectedAnswer = 2;

        actualAnswer = objUnderTest.removeDuplicates(nums);

        assertEquals(expectedAnswer, actualAnswer);
        assertArrayEquals(expectedNums, Arrays.copyOf(nums, actualAnswer));
    }

    @Test
    void removeDuplicatesTestTwo() {
        nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        expectedNums = new int[]{0, 1, 2, 3, 4};
        expectedAnswer = 5;

        actualAnswer = objUnderTest.removeDuplicates(nums);

        assertEquals(expectedAnswer, actualAnswer);
        assertArrayEquals(expectedNums, Arrays.copyOf(nums, actualAnswer));
    }
}