package com.github.singals.algo.leetcode.seventyFive.graph_dfs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReorderRoutesTest {

    private ReorderRoutes reorderRoutes;

    @BeforeEach
    void setUp() {
        reorderRoutes = new ReorderRoutes();
    }

    @Test
    @DisplayName("test-min-reorder-example-one")
    void testMinReorderExampleOne() {
        int[][] edges = {{0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}};

        int minReorder = reorderRoutes.minReorder(6, edges);

        assertEquals(3, minReorder);
    }

    @Test
    @DisplayName("test-min-reorder-example-two")
    void testMinReorderExampleTwo() {
        int[][] edges = {{1, 0}, {1, 2}, {3, 2}, {3, 4}};

        int minReorder = reorderRoutes.minReorder(5, edges);

        assertEquals(2, minReorder);
    }

    @Test
    @DisplayName("test-min-reorder-example-three")
    void testMinReorderExampleThree() {
        int[][] edges = {{1, 0}, {2, 0}};

        int minReorder = reorderRoutes.minReorder(3, edges);

        assertEquals(0, minReorder);
    }
}