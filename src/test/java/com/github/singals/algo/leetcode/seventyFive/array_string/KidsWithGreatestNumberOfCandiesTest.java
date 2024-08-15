package com.github.singals.algo.leetcode.seventyFive.array_string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KidsWithGreatestNumberOfCandiesTest {
    @Test
    @DisplayName("kids-with-candies-case-one")
    void kidsWithCandiesCaseOne() {
        int[] candies = new int[]{2, 3, 5, 1, 3};
        List<Boolean> res = KidsWithGreatestNumberOfCandies.kidsWithCandies(candies, 3);

        assertTrue(res.get(0));
        assertTrue(res.get(1));
        assertTrue(res.get(2));
        assertFalse(res.get(3));
        assertTrue(res.get(4));
    }

    @Test
    @DisplayName("kids-with-candies-case-two")
    void kidsWithCandiesCaseTwo() {
        int[] candies = new int[]{4, 2, 1, 1, 2};
        List<Boolean> res = KidsWithGreatestNumberOfCandies.kidsWithCandies(candies, 1);

        assertTrue(res.get(0));
        assertFalse(res.get(1));
        assertFalse(res.get(2));
        assertFalse(res.get(3));
        assertFalse(res.get(4));
    }

    @Test
    @DisplayName("kids-with-candies-case-three")
    void kidsWithCandiesCaseThree() {
        int[] candies = new int[]{12, 1, 12};
        List<Boolean> res = KidsWithGreatestNumberOfCandies.kidsWithCandies(candies, 10);

        assertTrue(res.get(0));
        assertFalse(res.get(1));
        assertTrue(res.get(2));
    }
}