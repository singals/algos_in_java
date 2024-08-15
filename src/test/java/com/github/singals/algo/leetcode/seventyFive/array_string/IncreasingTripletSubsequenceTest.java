package com.github.singals.algo.leetcode.seventyFive.array_string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncreasingTripletSubsequenceTest {

    @Test
    @DisplayName("increasing-triplet-negative-test-cases")
    void increasingTripletNegativeTestCases() {
        boolean res = IncreasingTripletSubsequence.increasingTriplet(new int[]{5, 4, 3, 2, 1});
        assertFalse(res);

        res = IncreasingTripletSubsequence.increasingTriplet(new int[]{0, 4, 2, 1, 0, -1, -3});
        assertFalse(res);

        res = IncreasingTripletSubsequence.increasingTriplet(new int[]{0, 2, 1});
        assertFalse(res);

        res = IncreasingTripletSubsequence.increasingTriplet(new int[]{1, 1, 1, 1, 1});
        assertFalse(res);
    }

    @Test
    @DisplayName("increasing-triplet-positive-test-cases")
    void increasingTripletPositiveTestCases() {
        boolean res = IncreasingTripletSubsequence.increasingTriplet(new int[]{1, 2, 3, 4, 5});
        assertTrue(res);

        res = IncreasingTripletSubsequence.increasingTriplet(new int[]{0, 1, 2});
        assertTrue(res);

        res = IncreasingTripletSubsequence.increasingTriplet(new int[]{0, 4, 2, 0, 1, -1, 2});
        assertTrue(res);

        res = IncreasingTripletSubsequence.increasingTriplet(new int[]{0, -1, 2, 1, 0, -1, 2});
        assertTrue(res);
    }

}