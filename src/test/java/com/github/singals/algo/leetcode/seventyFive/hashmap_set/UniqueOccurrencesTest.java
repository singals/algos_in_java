package com.github.singals.algo.leetcode.seventyFive.hashmap_set;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueOccurrencesTest {
    @Test
    @DisplayName("unique-occurrence-when-it-is-unique")
    void uniqueOccurrenceWhenItIsUnique() {
        boolean res = UniqueOccurrences.uniqueOccurrences(new int[]{1, 2, 2, 3, 3, 3, 4, 4, 4, 4});
        assertTrue(res);

        res = UniqueOccurrences.uniqueOccurrences(new int[]{5, 7, 7, 7, 9, 9, 9, 9, 9});
        assertTrue(res);

        res = UniqueOccurrences.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3});
        assertTrue(res);

        res = UniqueOccurrences.uniqueOccurrences(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0});
        assertTrue(res);
    }

    @Test
    @DisplayName("unique-occurrence-when-it-is-not-unique")
    void uniqueOccurrenceWhenItIsNotUnique() {
        boolean res = UniqueOccurrences.uniqueOccurrences(new int[]{1, 2, 3});
        assertFalse(res);

        res = UniqueOccurrences.uniqueOccurrences(new int[]{1, 2});
        assertFalse(res);

        res = UniqueOccurrences.uniqueOccurrences(new int[]{5, 5, 6, 6, 7, 7, 9, 9});
        assertFalse(res);
    }

}