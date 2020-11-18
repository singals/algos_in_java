package com.github.singals.algo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class CoinProblemTest {
    @Test
    @DisplayName("coin-combination-amount-less-than-coin-value")
    void TestCombinationWhenCoinIsGreater() {
        assertNull(CoinProblem.getLeastCoinCombination(new int[]{10, 5}, 3));
        assertNull(CoinProblem.getLeastCoinCombination(new int[]{100, 50}, 10));
    }

    @Test
    @DisplayName("coin-combination-not-possible")
    void TestCombinationWhenCombinationNotPossible() {
        assertNull(CoinProblem.getLeastCoinCombination(new int[]{10, 5}, 13));
        assertNull(CoinProblem.getLeastCoinCombination(new int[]{100, 50}, 240));
    }

    @Test
    @DisplayName("combination-from-multiple-denomination")
    void TestCombinationWhenMixIsRequired() {
        Map<Integer, Integer> combination = CoinProblem.getLeastCoinCombination(new int[]{10, 5, 2, 1}, 18);
        assertEquals(4, combination.size());
        assertEquals(1, combination.get(10));
        assertEquals(1, combination.get(5));
        assertEquals(1, combination.get(2));
        assertEquals(1, combination.get(1));
        combination = CoinProblem.getLeastCoinCombination(new int[]{10, 5, 2, 1}, 12);
        assertEquals(2, combination.size());
        assertEquals(1, combination.get(10));
        assertEquals(1, combination.get(2));
    }

    @Test
    @DisplayName("combination-from-one-denomination")
    void TestCombinationWhenOnlyOneDenominationIsRequired() {
        Map<Integer, Integer> combination = CoinProblem.getLeastCoinCombination(new int[]{10, 5, 2, 1}, 70);
        assertEquals(1, combination.size());
        assertEquals(7, combination.get(10));
        combination = CoinProblem.getLeastCoinCombination(new int[]{10, 5, 2, 1}, 4);
        assertEquals(1, combination.size());
        assertEquals(2, combination.get(2));
    }
}