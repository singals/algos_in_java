package com.github.singals.algo.leetcode.seventyFive.dp_1d;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobberTest {

    private HouseRobber objUnderTest;
    private int[] houses;
    private Integer expectedValue;
    private Integer actualValue;

    @BeforeEach
    void setUp() {
        objUnderTest = new HouseRobber();
    }

    @AfterEach
    void tearDown() {
        houses = null;
        expectedValue = null;
        actualValue = null;
    }

    @Test
    void robTestOne() {
        houses = new int[]{1, 2, 3, 1};
        expectedValue = 4;

        actualValue = objUnderTest.rob(houses);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void robTestTwo() {
        houses = new int[]{2,7,9,3,1};
        expectedValue = 12;

        actualValue = objUnderTest.rob(houses);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void robTestThree() {
        houses = new int[]{2,1,1,2};
        expectedValue = 4;

        actualValue = objUnderTest.rob(houses);

        assertEquals(expectedValue, actualValue);
    }
}