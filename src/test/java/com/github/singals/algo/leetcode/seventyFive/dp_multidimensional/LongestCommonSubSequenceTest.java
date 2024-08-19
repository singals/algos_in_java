package com.github.singals.algo.leetcode.seventyFive.dp_multidimensional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonSubSequenceTest {
    private LongestCommonSubSequence objUnderTest;
    private String text1;
    private String text2;

    private int expectedValue;
    private int actualValue;

    @BeforeEach
    void setUp() {
        objUnderTest = new LongestCommonSubSequence();
    }

    @AfterEach
    void tearDown() {
        expectedValue = 0;
        actualValue = 0;
        text1 = null;
        text2 = null;
    }

    @Test
    void longestCommonSubsequenceTestOne() {
        text1 = "abcde";
        text2 = "ace";
        expectedValue = 3;

        actualValue = objUnderTest.longestCommonSubsequence(text1, text2);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void longestCommonSubsequenceTestTwo() {
        text1 = "abc";
        text2 = "abc";
        expectedValue = 3;

        actualValue = objUnderTest.longestCommonSubsequence(text1, text2);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void longestCommonSubsequenceTestThree() {
        text1 = "abc";
        text2 = "def";
        expectedValue = 0;

        actualValue = objUnderTest.longestCommonSubsequence(text1, text2);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void longestCommonSubsequenceTestFour() {
        text1 = "pruv";
        text2 = "pqrstuv";
        expectedValue = 4;

        actualValue = objUnderTest.longestCommonSubsequence(text1, text2);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void longestCommonSubsequenceTestFive() {
        text1 = "bl";
        text2 = "yby";
        expectedValue = 1;

        actualValue = objUnderTest.longestCommonSubsequence(text1, text2);

        assertEquals(expectedValue, actualValue);
    }
}