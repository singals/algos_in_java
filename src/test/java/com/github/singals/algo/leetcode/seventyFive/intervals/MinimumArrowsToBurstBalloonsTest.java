package com.github.singals.algo.leetcode.seventyFive.intervals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumArrowsToBurstBalloonsTest {
    private MinimumArrowsToBurstBalloons objUnderTest;
    private int[][] points;

    private Integer expectedResult;
    private Integer actualResult;

    @BeforeEach
    void setUp() {
        objUnderTest = new MinimumArrowsToBurstBalloons();
    }

    @AfterEach
    void tearDown() {
        points = null;
        expectedResult = null;
        actualResult = null;
    }

    @Test
    void testFindMinArrowShotsTestOne() {
        points = new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        expectedResult = 2;

        actualResult = objUnderTest.findMinArrowShots(points);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testFindMinArrowShotsTestTwo() {
        points = new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        expectedResult = 4;

        actualResult = objUnderTest.findMinArrowShots(points);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testFindMinArrowShotsTestThree() {
        points = new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        expectedResult = 2;

        actualResult = objUnderTest.findMinArrowShots(points);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testFindMinArrowShotsTestFour() {
        points = new int[][]{{3, 9}, {7, 12}, {3, 8}, {6, 8}, {9, 10}, {2, 9}, {0, 9}, {3, 9}, {0, 6}, {2, 8}};
        expectedResult = 2;

        actualResult = objUnderTest.findMinArrowShots(points);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void testFindMinArrowShotsTestFive() {
        points = new int[][]{{9, 12}, {1, 10}, {4, 11}, {8, 12}, {3, 9}, {6, 9}, {6, 7}};
        expectedResult = 2;

        actualResult = objUnderTest.findMinArrowShots(points);

        assertEquals(expectedResult, actualResult);
    }
}