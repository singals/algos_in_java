package com.github.singals.algo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MazeTest {

    @Test
    @DisplayName("maze-shortest-distance-no-match")
    void TestMazeShortestDistanceWhenElementIsNotInPath() {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertEquals(-1, Maze.findShortestDistance(arr, new Location(0, 1), new Location(1, 0)));
    }

    @Test
    @DisplayName("maze-shortest-distance-element-present-down")
    void TestMazeShortestDistanceWhenElementIsPresentDownward() {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertEquals(2, Maze.findShortestDistance(arr, new Location(0, 0), new Location(2, 0)));
        assertEquals(1, Maze.findShortestDistance(arr, new Location(0, 0), new Location(1, 0)));
    }

    @Test
    @DisplayName("maze-shortest-distance-element-present-right")
    void TestMazeShortestDistanceWhenElementIsPresentOnRight() {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertEquals(2, Maze.findShortestDistance(arr, new Location(2, 0), new Location(2, 2)));
        assertEquals(1, Maze.findShortestDistance(arr, new Location(2, 0), new Location(2, 1)));
    }

    @Test
    @DisplayName("maze-shortest-distance-element-present")
    void TestMazeShortestDistanceWhenElementIsPresent() {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertEquals(4, Maze.findShortestDistance(arr, new Location(0, 0), new Location(2, 2)));
        assertEquals(3, Maze.findShortestDistance(arr, new Location(0, 0), new Location(2, 1)));
        assertEquals(2, Maze.findShortestDistance(arr, new Location(0, 0), new Location(1, 1)));
    }
}