package com.github.singals.algo.leetcode.seventyFive.intervals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonOverlappingIntervalsTest {

    private NonOverlappingIntervals objUnderTest;
    private int[][] intervals;

    private Integer expectedOutput;
    private Integer actualOutput;


    @BeforeEach
    void setUp() {
        objUnderTest = new NonOverlappingIntervals();
    }

    @AfterEach
    void tearDown() {
        intervals = null;
        expectedOutput = null;
        actualOutput = null;
    }

    @Test
    void eraseOverlapIntervalsTestOne() {
        intervals = new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        expectedOutput = 1;

        actualOutput = objUnderTest.eraseOverlapIntervals(intervals);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void eraseOverlapIntervalsTestTwo() {
        intervals = new int[][]{{1, 2}, {1, 2}, {1, 2}};
        expectedOutput = 2;

        actualOutput = objUnderTest.eraseOverlapIntervals(intervals);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void eraseOverlapIntervalsTestThree() {
        intervals = new int[][]{{1, 2}, {2, 3}};
        expectedOutput = 0;

        actualOutput = objUnderTest.eraseOverlapIntervals(intervals);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void eraseOverlapIntervalsTestFour() {
        intervals = new int[][]{{1, 4}, {2, 3}, {4, 5}};
        expectedOutput = 1;

        actualOutput = objUnderTest.eraseOverlapIntervals(intervals);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void eraseOverlapIntervalsTestFive() {
        intervals = new int[][]{{1, 2}, {1, 3}, {1, 4}};
        expectedOutput = 2;

        actualOutput = objUnderTest.eraseOverlapIntervals(intervals);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void eraseOverlapIntervalsTestSix() {
        intervals = new int[][]{{0, 2}, {1, 3}, {2, 4}, {3, 5}, {4, 6}};
        expectedOutput = 2;

        actualOutput = objUnderTest.eraseOverlapIntervals(intervals);

        assertEquals(expectedOutput, actualOutput);
    }
}