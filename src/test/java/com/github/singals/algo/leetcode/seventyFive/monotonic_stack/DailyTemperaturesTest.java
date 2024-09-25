package com.github.singals.algo.leetcode.seventyFive.monotonic_stack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DailyTemperaturesTest {

    private DailyTemperatures objUnderTest;
    private int[] temperatures;
    private int[] expectedResult;
    private int[] actualResult;

    @BeforeEach
    void setUp() {
        objUnderTest = new DailyTemperatures();
    }

    @AfterEach
    void tearDown() {
        temperatures = null;
        expectedResult = null;
        actualResult = null;
    }

    @Test
    void testDailyTemperaturesTestOne() {
        temperatures = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        expectedResult = new int[]{1, 1, 4, 2, 1, 1, 0, 0};

        actualResult = objUnderTest.dailyTemperatures(temperatures);

        System.out.println(Arrays.toString(expectedResult));
        System.out.println(Arrays.toString(actualResult));

        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testDailyTemperaturesTestTwo() {
        temperatures = new int[]{30, 40, 50, 60};
        expectedResult = new int[]{1, 1, 1, 0};

        actualResult = objUnderTest.dailyTemperatures(temperatures);

        System.out.println(Arrays.toString(expectedResult));
        System.out.println(Arrays.toString(actualResult));

        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    void testDailyTemperaturesTestThree() {
        temperatures = new int[]{30, 60, 90};
        expectedResult = new int[]{1, 1, 0};

        actualResult = objUnderTest.dailyTemperatures(temperatures);

        System.out.println(Arrays.toString(expectedResult));
        System.out.println(Arrays.toString(actualResult));

        assertArrayEquals(expectedResult, actualResult);
    }
}