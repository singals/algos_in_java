package com.github.singals.algo.leetcode.seventyFive;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CloseStringsTest {

    @Test
    @DisplayName("close-strings-positive")
    void closeStrings() {
        boolean res = CloseStrings.closeStrings("abc", "bca");
        assertTrue(res);

        res = CloseStrings.closeStrings("cabbba", "abbccc");
        assertTrue(res);

        res = CloseStrings.closeStrings("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        assertTrue(res);
    }

    @Test
    @DisplayName("close-strings-negative")
    void closeStringsNegativeTest() {
        boolean res = CloseStrings.closeStrings("a", "aa");
        assertFalse(res);

        res = CloseStrings.closeStrings("uau", "ssx");
        assertFalse(res);
    }

}