package com.github.singals.algo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SearchArrayTest {

    @Test
    @DisplayName("LinearSearch")
    void TestSearchByLinearSearch() {
        assertTrue(SearchArray.byLinearSearch(new Integer[]{10, 7, 9, 2, 6, 5}, 10));
        assertTrue(SearchArray.byLinearSearch(new Integer[]{10, 7, 9, 2, 6, 5}, 7));
        assertTrue(SearchArray.byLinearSearch(new Integer[]{10, 7, 9, 2, 6, 5}, 9));
        assertTrue(SearchArray.byLinearSearch(new Integer[]{10, 7, 9, 2, 6, 5}, 2));
        assertTrue(SearchArray.byLinearSearch(new Integer[]{10, 7, 9, 2, 6, 5}, 6));
        assertTrue(SearchArray.byLinearSearch(new Integer[]{10, 7, 9, 2, 6, 5}, 5));
        assertFalse(SearchArray.byLinearSearch(new Integer[]{10, 7, 9, 2, 6, 5}, 0));
        assertFalse(SearchArray.byLinearSearch(new Integer[]{10, 7, 9, 2, 6, 5}, 23));
    }

    @Test
    @DisplayName("BinarySearch")
    void TestSearchByBinarySearch() {
        assertTrue(SearchArray.byBinarySearch(new Integer[]{5, 8, 12, 14, 17, 22}, 5));
        assertTrue(SearchArray.byBinarySearch(new Integer[]{5, 8, 12, 14, 17, 22}, 8));
        assertTrue(SearchArray.byBinarySearch(new Integer[]{5, 8, 12, 14, 17, 22}, 12));
        assertTrue(SearchArray.byBinarySearch(new Integer[]{5, 8, 12, 14, 17, 22}, 14));
        assertTrue(SearchArray.byBinarySearch(new Integer[]{5, 8, 12, 14, 17, 22}, 17));
        assertTrue(SearchArray.byBinarySearch(new Integer[]{5, 8, 12, 14, 17, 22}, 22));
        assertFalse(SearchArray.byBinarySearch(new Integer[]{5, 8, 12, 14, 17, 22}, 0));
        assertFalse(SearchArray.byBinarySearch(new Integer[]{5, 8, 12, 14, 17, 22}, 23));
    }
}