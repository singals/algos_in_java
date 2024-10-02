package com.github.singals.algo.leetcode.top_interview_150.array_string;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayIITest {

    private RemoveDuplicatesFromSortedArrayII objUnderTest;

    private int[] nums;
    private int[] expectedNums;

    private Integer expectedAnswer;
    private Integer actualAnswer;

    @BeforeEach
    void setUp() {
        objUnderTest = new RemoveDuplicatesFromSortedArrayII();
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
        nums = new int[]{1, 1, 1, 2, 2, 3};
        expectedNums = new int[]{1, 1, 2, 2, 3};
        expectedAnswer = 5;

        actualAnswer = objUnderTest.removeDuplicates(nums);

        assertEquals(expectedAnswer, actualAnswer);
        assertArrayEquals(expectedNums, Arrays.copyOf(nums, actualAnswer));
    }

    @Test
    void removeDuplicatesTestTwo() {
        nums = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
        expectedNums = new int[]{0, 0, 1, 1, 2, 3, 3};
        expectedAnswer = 7;

        actualAnswer = objUnderTest.removeDuplicates(nums);

        assertEquals(expectedAnswer, actualAnswer);
        assertArrayEquals(expectedNums, Arrays.copyOf(nums, actualAnswer));
    }

    @Test
    void removeDuplicatesTestThree() {
        nums = new int[]{1, 1};
        expectedNums = new int[]{1, 1};
        expectedAnswer = 2;

        actualAnswer = objUnderTest.removeDuplicates(nums);

        assertEquals(expectedAnswer, actualAnswer);
        assertArrayEquals(expectedNums, Arrays.copyOf(nums, actualAnswer));
    }

    @Test
    void removeDuplicatesTestFour() {
        nums = new int[]{1, 2, 2};
        expectedNums = new int[]{1, 2, 2};
        expectedAnswer = 3;

        actualAnswer = objUnderTest.removeDuplicates(nums);

        assertEquals(expectedAnswer, actualAnswer);
        assertArrayEquals(expectedNums, Arrays.copyOf(nums, actualAnswer));
    }

    @Test
    void removeDuplicatesTestFive() {
        nums = new int[]{1,1,1, 2, 3};
        expectedNums = new int[]{1,1, 2, 3};
        expectedAnswer = 4;

        actualAnswer = objUnderTest.removeDuplicates(nums);

        assertEquals(expectedAnswer, actualAnswer);
        assertArrayEquals(expectedNums, Arrays.copyOf(nums, actualAnswer));
    }
}