package com.github.singals.algo.leetcode.seventyFive.graph_bfs;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RottingOrangesTest {

    private RottingOranges rottingOranges;
    private int[][] grid;
    private Integer minutes;

    @BeforeEach
    void setUp() {
        rottingOranges = new RottingOranges();
    }

    @AfterEach
    void tearDown() {
        grid = null;
        minutes = null;
    }

    @Test
    void testRottingOrangesWhenNoOrangeIsRotten() {
        grid = new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};

        minutes = rottingOranges.orangesRotting(grid);

        assertEquals(-1, minutes);
    }

    @Test
    void testRottingOrangesWhenAllOrangesAreRotten() {
        grid = new int[][]{{2, 2, 2}, {2, 2, 2}, {2, 2, 2}};

        minutes = rottingOranges.orangesRotting(grid);

        assertEquals(0, minutes);
    }

    @Test
    void testRottingOrangesWhenNoOrangeInGrid() {
        grid = new int[][]{{0, 0}, {0, 0}};

        minutes = rottingOranges.orangesRotting(grid);

        assertEquals(0, minutes);
    }

    @Test
    void testRottingOrangesWhenMultipleRottenOranges() {
        grid = new int[][]{{2, 1, 1}, {1, 1, 1}, {0, 1, 2}};

        minutes = rottingOranges.orangesRotting(grid);

        assertEquals(2, minutes);
    }

    @Test
    void testRottingOrangesExampleOne() {
        grid = new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};

        minutes = rottingOranges.orangesRotting(grid);

        assertEquals(4, minutes);
    }

    @Test
    void testRottingOrangesExampleTwo() {
        grid = new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};

        minutes = rottingOranges.orangesRotting(grid);

        assertEquals(-1, minutes);
    }

    @Test
    void testRottingOrangesExampleThree() {
        grid = new int[][]{{0, 2}};

        minutes = rottingOranges.orangesRotting(grid);

        assertEquals(0, minutes);
    }

    @Test
    void testRottingOrangesCustomExample() {
        grid = new int[][]{{2, 2, 2}, {2, 2, 2}, {2, 2, 1}};

        minutes = rottingOranges.orangesRotting(grid);

        assertEquals(1, minutes);
    }

    @Nested
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
}