package com.github.singals.algo.leetcode.seventyFive.graph_dfs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class KeysAndRoomsTest {

    private KeysAndRooms keysAndRooms;

    @BeforeEach
    void setUp() {
        keysAndRooms = new KeysAndRooms();
    }

    @Test
    void canVisitAllRoomsExampleOne() {
        List<List<Integer>> rooms =
                Arrays.asList(List.of(1), List.of(2), List.of(3), Collections.emptyList());

        boolean canVisitAllRooms = keysAndRooms.canVisitAllRooms(rooms);

        Assertions.assertTrue(canVisitAllRooms);
    }

    @Test
    void canVisitAllRoomsExampleTwo() {
        List<List<Integer>> rooms =
                Arrays.asList(Arrays.asList(1, 3), Arrays.asList(3, 0, 1), List.of(2), List.of(0));

        boolean canVisitAllRooms = keysAndRooms.canVisitAllRooms(rooms);

        Assertions.assertFalse(canVisitAllRooms);
    }
}