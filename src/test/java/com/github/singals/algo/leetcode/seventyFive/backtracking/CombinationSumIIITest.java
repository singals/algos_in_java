package com.github.singals.algo.leetcode.seventyFive.backtracking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumIIITest {

    private CombinationSumIII objUnderTest;
    private List<List<Integer>> actualResult;

    @BeforeEach
    void setUp() {
        objUnderTest = new CombinationSumIII();
    }

    @Test
    @DisplayName("letter-combinations-test-one")
    void letterCombinationsTestOne() {
        actualResult = objUnderTest.combinationSum3(3, 7);

        assertEquals(1, actualResult.size());
        List<Integer> combination = actualResult.get(0);
        assertEquals(3, combination.size());
        assertEquals(1, combination.get(0));
        assertEquals(2, combination.get(1));
        assertEquals(4, combination.get(2));
    }

    @Test
    @DisplayName("letter-combinations-test-two")
    void letterCombinationsTestTwo() {
        List<Integer> combinationOne = List.of(1, 2, 6);
        List<Integer> combinationTwo = List.of(1, 3, 5);
        List<Integer> combinationThree = List.of(2, 3, 4);

        actualResult = objUnderTest.combinationSum3(3, 9);

        assertEquals(3, actualResult.size());
        assertEquals(3, actualResult.size());
        assertEquals(combinationOne, actualResult.get(0));
        assertEquals(combinationTwo, actualResult.get(1));
        assertEquals(combinationThree, actualResult.get(2));
    }

    @Test
    @DisplayName("letter-combinations-test-two")
    void letterCombinationsTestThree() {
        actualResult = objUnderTest.combinationSum3(4, 1);

        assertTrue(actualResult.isEmpty());
    }

    @Test
    @DisplayName("letter-combinations-test-four")
    void letterCombinationsTestFour() {
        actualResult = objUnderTest.combinationSum3(2, 18);

        assertTrue(actualResult.isEmpty());
    }

}