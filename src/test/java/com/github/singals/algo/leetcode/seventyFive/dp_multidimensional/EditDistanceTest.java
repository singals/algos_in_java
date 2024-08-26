package com.github.singals.algo.leetcode.seventyFive.dp_multidimensional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EditDistanceTest {

    private EditDistance objUnderTest;

    private String word1;
    private String word2;

    private Integer actualValue;
    private Integer expectedValue;


    @BeforeEach
    void setUp() {
        objUnderTest = new EditDistance();
    }

    @AfterEach
    void tearDown() {
        word1 = null;
        word2 = null;
        actualValue = null;
        expectedValue = null;
    }

    @Test
    void minDistanceTestOne() {
        word1 = "horse";
        word2 = "ros";
        expectedValue = 3;

        actualValue = objUnderTest.minDistance(word1, word2);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void minDistanceTestTwo() {
        word1 = "intention";
        word2 = "execution";
        expectedValue = 5;

        actualValue = objUnderTest.minDistance(word1, word2);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void minDistanceTestSameString() {
        word1 = "horse";
        word2 = "horse";
        expectedValue = 0;

        actualValue = objUnderTest.minDistance(word1, word2);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void minDistanceTestSubString() {
        word1 = "myhorsefast";
        word2 = "horse";
        expectedValue = 6;

        actualValue = objUnderTest.minDistance(word1, word2);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void minDistanceTestSimilarString() {
        word1 = "heck";
        word2 = "hell";
        expectedValue = 2;

        actualValue = objUnderTest.minDistance(word1, word2);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void minDistanceTestThree() {
        word1 = "getter";
        word2 = "put";
        expectedValue = 5;

        actualValue = objUnderTest.minDistance(word1, word2);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void minDistanceTestFour() {
        word1 = "getter";
        word2 = "put";
        expectedValue = 5;

        actualValue = objUnderTest.minDistance(word1, word2);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void minDistanceTestSimilarStringTwo() {
        word1 = "myhorsefast";
        word2 = "rorse";
        expectedValue = 7;

        actualValue = objUnderTest.minDistance(word1, word2);

        assertEquals(expectedValue, actualValue);
    }
}