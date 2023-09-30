package com.github.singals.algo.leetcode.seventyFive;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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

        assertTrue(canVisitAllRooms);
    }

    @Test
    void canVisitAllRoomsExampleTwo() {
        List<List<Integer>> rooms =
                Arrays.asList(Arrays.asList(1, 3), Arrays.asList(3, 0, 1), List.of(2), List.of(0));

        boolean canVisitAllRooms = keysAndRooms.canVisitAllRooms(rooms);

        assertFalse(canVisitAllRooms);
    }
}