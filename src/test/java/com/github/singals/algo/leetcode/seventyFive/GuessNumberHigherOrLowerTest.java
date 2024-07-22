package com.github.singals.algo.leetcode.seventyFive;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessNumberHigherOrLowerTest {

    private GuessNumberHigherOrLower objUnderTest;
    private int pick;
    private int actualResult;

    @Test
    @DisplayName("guess-number-basic-test")
    void guessNumberBasicTest() {
        pick = 6;
        objUnderTest = new GuessNumberHigherOrLower(pick);

        actualResult = objUnderTest.guessNumber(10);

        assertEquals(pick, actualResult);
    }

    @Test
    @DisplayName("guess-number-example-one")
    void guessNumberExampleOne() {
        pick = 6;
        objUnderTest = new GuessNumberHigherOrLower(pick);

        actualResult = objUnderTest.guessNumber(10);

        assertEquals(pick, actualResult);
    }

    @Test
    @DisplayName("guess-number-example-two")
    void guessNumberExampleTwo() {
        pick = 1;
        objUnderTest = new GuessNumberHigherOrLower(pick);

        actualResult = objUnderTest.guessNumber(1);

        assertEquals(pick, actualResult);
    }

    @Test
    @DisplayName("guess-number-example-three")
    void guessNumberExampleThree() {
        pick = 1;
        objUnderTest = new GuessNumberHigherOrLower(pick);

        actualResult = objUnderTest.guessNumber(2);

        assertEquals(pick, actualResult);
    }

    @Test
    @DisplayName("guess-number-example-four")
    void guessNumberExampleFour() {
        pick = 1702766719;
        objUnderTest = new GuessNumberHigherOrLower(pick);

        actualResult = objUnderTest.guessNumber(2126753390);

        assertEquals(pick, actualResult);
    }

}