package com.github.singals.algo.leetcode.top_interview_150.array_string;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    private MergeSortedArray objUnderTest;

    private int[] nums1;
    private int[] nums2;
    private Integer m;
    private Integer n;

    private int[] expectedAnswer;

    @BeforeEach
    void setUp() {
        objUnderTest = new MergeSortedArray();
    }

    @AfterEach
    void tearDown() {
        nums1 = null;
        nums2 = null;
        m = null;
        n = null;
        expectedAnswer = null;
    }

    @Test
    void mergeTestOne() {
        nums1 = new int[]{1, 2, 3, 0, 0, 0};
        nums2 = new int[]{2, 5, 6};
        m = 3;
        n = 3;
        expectedAnswer = new int[]{1, 2, 2, 3, 5, 6};

        objUnderTest.merge(nums1, m, nums2, n);

        assertArrayEquals(expectedAnswer, nums1);
    }

    @Test
    void mergeTestTwo() {
        nums1 = new int[]{1};
        nums2 = new int[]{};
        m = 1;
        n = 0;
        expectedAnswer = new int[]{1};

        objUnderTest.merge(nums1, m, nums2, n);

        assertArrayEquals(expectedAnswer, nums1);
    }

    @Test
    void mergeTestThree() {
        nums1 = new int[]{0};
        nums2 = new int[]{1};
        m = 0;
        n = 1;
        expectedAnswer = new int[]{1};

        objUnderTest.merge(nums1, m, nums2, n);

        assertArrayEquals(expectedAnswer, nums1);
    }
}