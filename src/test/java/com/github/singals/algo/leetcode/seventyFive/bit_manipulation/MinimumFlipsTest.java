package com.github.singals.algo.leetcode.seventyFive.bit_manipulation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumFlipsTest {

    private MinimumFlips objUnderTest;

    private Integer a, b, c;
    private Integer expectedResult;
    private Integer actualResult;


    @BeforeEach
    void setUp() {
        objUnderTest = new MinimumFlips();
    }

    @AfterEach
    void tearDown() {
        a = null;
        b = null;
        c = null;
        expectedResult = null;
        actualResult = null;
    }

    @Test
    void minFlipsTestOne() {
        a = 2;
        b = 6;
        c = 5;
        expectedResult = 3;

        actualResult = objUnderTest.minFlips(a, b, c);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void minFlipsTestTwo() {
        a = 4;
        b = 2;
        c = 7;
        expectedResult = 1;

        actualResult = objUnderTest.minFlips(a, b, c);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void minFlipsTestThree() {
        a = 1;
        b = 2;
        c = 3;
        expectedResult = 0;

        actualResult = objUnderTest.minFlips(a, b, c);

        assertEquals(expectedResult, actualResult);
    }
}