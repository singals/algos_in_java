package com.github.singals.algo.leetcode.seventyFive;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NthTribonacciNumberTest {
    private NthTribonacciNumber objUnderTest;
    private Integer expectedValue;
    private Integer actualValue;

    @BeforeEach
    void setUp() {
        objUnderTest = new NthTribonacciNumber();
    }

    @AfterEach
    void tearDown() {
        expectedValue = null;
        actualValue = null;
    }

    @Test
    @DisplayName("tribonacci-test-one")
    void tribonacciTestOne() {
        expectedValue = 4;

        actualValue = objUnderTest.tribonacci(4);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    @DisplayName("tribonacci-test-two")
    void tribonacciTestTwo() {
        expectedValue = 1389537;

        actualValue = objUnderTest.tribonacci(25);

        assertEquals(expectedValue, actualValue);
    }
}