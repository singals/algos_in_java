package com.github.singals.algo.leetcode.seventyFive.binary_search;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuccessfulPairsOfSpellsAndPotionTest {

    private int[] spells;
    private int[] potions;
    private long success;
    private int[] actualResult;
    private int[] expectedResult;

    @Test
    @DisplayName("successful-pairs-of-spells-and-potions-test-one")
    void successfulPairsOfSpellsAndPotionsTestOne() {
        spells = new int[]{5, 1, 3};
        potions = new int[]{1, 2, 3, 4, 5};
        success = 7;
        expectedResult = new int[]{4, 0, 3};

        actualResult = SuccessfulPairsOfSpellsAndPotion.successfulPairs(spells, potions, success);

        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("successful-pairs-of-spells-and-potions-test-two")
    void successfulPairsOfSpellsAndPotionsTestTwo() {
        spells = new int[]{3, 1, 2};
        potions = new int[]{8, 5, 8};
        success = 16;
        expectedResult = new int[]{2, 0, 2};

        actualResult = SuccessfulPairsOfSpellsAndPotion.successfulPairs(spells, potions, success);

        assertArrayEquals(expectedResult, actualResult);
    }

}