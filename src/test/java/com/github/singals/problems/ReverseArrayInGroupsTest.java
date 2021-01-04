package com.github.singals.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayInGroupsTest {

    @Test
    void TestArrayReversalInGroups() {
        assertArrayEquals(new int[]{4, 3, 2, 1, 8, 7, 6, 5},
                ReverseArrayInGroups.reverse(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 4));

        assertArrayEquals(new int[]{3, 2, 1, 6, 5, 4, 8, 7},
                ReverseArrayInGroups.reverse(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 3));

        assertArrayEquals(new int[]{4, 3, 2, 1, 5},
                ReverseArrayInGroups.reverse(new int[]{1, 2, 3, 4, 5}, 4));

        assertArrayEquals(new int[]{5, 4, 3, 2, 1},
                ReverseArrayInGroups.reverse(new int[]{1, 2, 3, 4, 5}, 5));

        assertArrayEquals(new int[]{1, 2, 3, 4, 5},
                ReverseArrayInGroups.reverse(new int[]{1, 2, 3, 4, 5}, 1));

        assertArrayEquals(new int[]{5, 4, 3, 2, 1},
                ReverseArrayInGroups.reverse(new int[]{1, 2, 3, 4, 5}, 6));

        assertArrayEquals(new int[]{5, 4, 3, 2, 1},
                ReverseArrayInGroups.reverse(new int[]{1, 2, 3, 4, 5}, 100));
    }
}