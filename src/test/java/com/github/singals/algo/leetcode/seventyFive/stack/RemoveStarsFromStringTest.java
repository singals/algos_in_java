package com.github.singals.algo.leetcode.seventyFive.stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveStarsFromStringTest {

    @Test
    @DisplayName("remove-stars-when-no-stars")
    void removeStarsWhenNoStar() {
        String res = RemoveStarsFromString.removeStars("nostars");
        assertEquals("nostars", res);
    }

    @Test
    @DisplayName("remove-stars-when-only-stars")
    void removeStarsWhenOnlyStar() {
        String res = RemoveStarsFromString.removeStars("*****");
        assertTrue(res.isBlank());
    }

    @Test
    @DisplayName("remove-stars")
    void removeStars() {
        String res = RemoveStarsFromString.removeStars("leet**cod*e");
        assertEquals("lecoe", res);

        res = RemoveStarsFromString.removeStars("abb*cdfg*****x*");
        assertEquals("a", res);

        res = RemoveStarsFromString.removeStars("erase*****");
        assertTrue(res.isBlank());
    }
}