package com.github.singals.algo.leetcode.seventyFive.dp_1d;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DominoTrominoTilingTest {

    private DominoTrominoTiling objUnderTest;
    private int n;
    private int expectedResult;
    private int actualResult;

    @BeforeEach
    void setUp() {
        objUnderTest = new DominoTrominoTiling();
    }

    @AfterEach
    void tearDown() {
        n = -1;
        expectedResult = -1;
        actualResult = -1;
    }

    @Test
    void numTilingsTestOne() {
        n=3;
        expectedResult = 5;

        actualResult = objUnderTest.numTilings(n);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void numTilingsTestTwo() {
        n=1;
        expectedResult = 1;

        actualResult = objUnderTest.numTilings(n);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void numTilingsTestThree() {
        n=30;
        expectedResult = 312342182;

        actualResult = objUnderTest.numTilings(n);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void numTilingsTestFour() {
        n=60;
        expectedResult = 882347204;

        actualResult = objUnderTest.numTilings(n);

        assertEquals(expectedResult, actualResult);
    }
}