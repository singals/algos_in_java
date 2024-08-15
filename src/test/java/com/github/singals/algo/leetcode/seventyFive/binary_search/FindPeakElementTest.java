package com.github.singals.algo.leetcode.seventyFive.binary_search;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindPeakElementTest {

    private int[] nums;
    private FindPeakElement objUnderTest;
    private List<Integer> expectedResults;
    private int actualResult;

    @Test
    @DisplayName("find-peak-element-test-one")
    void findPeakElementTestOne() {
        nums = new int[]{1, 2, 3, 1};
        expectedResults = Arrays.asList(2);
        objUnderTest = new FindPeakElement();

        actualResult = objUnderTest.findPeakElement(nums);

        assertTrue(expectedResults.contains(actualResult));
    }

    @Test
    @DisplayName("find-peak-element-test-two")
    void findPeakElementTestTwo() {
        nums = new int[]{1, 2, 1, 3, 5, 6, 4};
        expectedResults = Arrays.asList(2, 5);
        objUnderTest = new FindPeakElement();

        actualResult = objUnderTest.findPeakElement(nums);

        assertTrue(expectedResults.contains(actualResult));
    }
}