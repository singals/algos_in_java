package com.github.singals.algo.leetcode.seventyFive;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSubSequenceScoreTest {
    private MaxSubSequenceScore maxSubSequenceScore;

    private int[] nums1;
    private int[] nums2;
    private int k;

    @BeforeEach
    void setUp() {
        maxSubSequenceScore = new MaxSubSequenceScore();
    }

    @Test
    @DisplayName("max-score-example-one")
    void maxScoreExampleOne() {
        nums1 = new int[]{1,3,3,2};
        nums2 = new int[]{2,1,3,4};
        k = 3;

        long maxScore = maxSubSequenceScore.maxScore(nums1, nums2, k);

        assertEquals(12, maxScore);
    }

    @Test
    @DisplayName("max-score-example-two")
    void maxScoreExampleTwo() {
        nums1 = new int[]{4,2,3,1,1};
        nums2 = new int[]{7,5,10,9,6};
        k = 1;

        long maxScore = maxSubSequenceScore.maxScore(nums1, nums2, k);

        assertEquals(30, maxScore);
    }

    @Test
    @DisplayName("max-score-example-three")
    void maxScoreExampleThree() {
        nums1 = new int[]{2,1,14,12};
        nums2 = new int[]{11,7,13,6};
        k = 3;

        long maxScore = maxSubSequenceScore.maxScore(nums1, nums2, k);

        assertEquals(168, maxScore);
    }

    @Test
    @DisplayName("max-score-example-four")
    void maxScoreExampleFour() {
        nums1 = new int[]{23,16,20,7,3};
        nums2 = new int[]{19,21,22,22,12};
        k = 3;

        long maxScore = maxSubSequenceScore.maxScore(nums1, nums2, k);

        assertEquals(1121, maxScore);
    }
}