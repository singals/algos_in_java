package com.github.singals.algo.leetcode.seventyFive.backtracking;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationPhoneNumberTest {

    private LetterCombinationPhoneNumber objUnderTest;
    private String digits;
    private List<String> expectedResult;
    private List<String> actualResult;

    @BeforeEach
    void setUp() {
        objUnderTest = new LetterCombinationPhoneNumber();
    }

    @AfterEach
    void tearDown() {
        digits = null;
        expectedResult = null;
        actualResult = null;
    }

    @Test
    @DisplayName("letter-combinations-test-one")
    void letterCombinationsTestOne() {
        digits = "23";
        expectedResult = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");

        actualResult = objUnderTest.letterCombinations(digits);

        assertArrayEquals(expectedResult.toArray(), actualResult.toArray());
    }

    @Test
    @DisplayName("letter-combinations-test-two")
    void letterCombinationsTestTwo() {
        digits = "";
        expectedResult = Collections.emptyList();

        actualResult = objUnderTest.letterCombinations(digits);

        assertArrayEquals(expectedResult.toArray(), actualResult.toArray());
    }

    @Test
    @DisplayName("letter-combinations-test-three")
    void letterCombinationsTestThree() {
        digits = "2";
        expectedResult = Arrays.asList("a", "b", "c");

        actualResult = objUnderTest.letterCombinations(digits);

        assertArrayEquals(expectedResult.toArray(), actualResult.toArray());
    }

    @Test
    @DisplayName("letter-combinations-test-four")
    void letterCombinationsTestFour() {
        digits = "234";
        expectedResult = Arrays.asList("adg", "adh", "adi", "aeg", "aeh", "aei", "afg", "afh", "afi", "bdg", "bdh",
                "bdi", "beg", "beh", "bei", "bfg", "bfh", "bfi", "cdg", "cdh", "cdi", "ceg", "ceh", "cei", "cfg",
                "cfh", "cfi");

        actualResult = objUnderTest.letterCombinations(digits);

        assertArrayEquals(expectedResult.toArray(), actualResult.toArray());
    }
}