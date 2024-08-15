package com.github.singals.algo.leetcode.seventyFive.graph_bfs;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
}