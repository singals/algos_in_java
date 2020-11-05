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
    }
}