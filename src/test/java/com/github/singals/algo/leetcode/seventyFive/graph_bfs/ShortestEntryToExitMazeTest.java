package com.github.singals.algo.leetcode.seventyFive.graph_bfs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestEntryToExitMazeTest {
    private ShortestEntryToExitMaze shortestEntryToExitMaze;

    @BeforeEach
    void setUp() {
        shortestEntryToExitMaze = new ShortestEntryToExitMaze();
    }

    @Test
    @DisplayName("test-nearest-exit-test-case-one")
    void testNearestExitTestCaseOne() {
        char[][] maze = new char[][]{{'+', '+', '.', '+'}, {'.', '.', '.', '+'}, {'+', '+', '+', '.'}};

        int actualSteps = shortestEntryToExitMaze.nearestExit(maze, new int[]{1, 2});

        assertEquals(1, actualSteps);
    }

    @Test
    @DisplayName("test-nearest-exit-test-case-two")
    void testNearestExitTestCaseTwo() {
        char[][] maze = new char[][]{{'+', '+', '+'}, {'.', '.', '.'}, {'+', '+', '+'}};

        int actualSteps = shortestEntryToExitMaze.nearestExit(maze, new int[]{1, 0});

        assertEquals(2, actualSteps);
    }

    @Test
    @DisplayName("test-nearest-exit-test-case-three")
    void testNearestExitTestCaseThree() {
        char[][] maze = new char[][]{{'.', '+'}};

        int actualSteps = shortestEntryToExitMaze.nearestExit(maze, new int[]{0, 0});

        assertEquals(-1, actualSteps);
    }

    @Test
    @DisplayName("test-nearest-exit-test-case-custom-one")
    void testNearestExitTestCaseCustomOne() {
        char[][] maze = new char[][]{{'+', '.', '+', '+', '+', '+', '+'}, {'+', '.', '+', '.', '.', '.', '+'},
                {'+', '.', '+', '.', '+', '.', '+'}, {'+', '.', '.', '.', '.', '.', '+'},
                {'+', '+', '+', '+', '.', '+', '.'}};

        int actualSteps = shortestEntryToExitMaze.nearestExit(maze, new int[]{0, 1});

        assertEquals(7, actualSteps);
    }

    @Test
    @DisplayName("test-nearest-exit-test-case-custom-two")
    void testNearestExitTestCaseCustomTwo() {
        char[][] maze = new char[][]{{'.', '+', '+', '+', '.', '.', '.', '+', '+'},
                {'.', '.', '+', '.', '+', '.', '+', '+', '.'}, {'.', '.', '+', '.', '.', '.', '.', '.', '.'},
                {'.', '+', '.', '.', '+', '+', '.', '+', '.'}, {'.', '.', '.', '.', '.', '.', '.', '+', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', '+', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '+'}, {'+', '.', '.', '.', '+', '.', '.', '.', '.'}};

        int actualSteps = shortestEntryToExitMaze.nearestExit(maze, new int[]{5, 6});

        assertEquals(2, actualSteps);
    }
}