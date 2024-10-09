package com.github.singals.algo.leetcode.top_interview_150.array_string;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameTest {

    private JumpGame objUnderTest;
    private int[] nums;

    private Boolean expectedAnswer;
    private Boolean actualAnswer;

    @BeforeEach
    void setUp() {
        objUnderTest = new JumpGame();
    }

    @AfterEach
    void tearDown() {
        nums = null;
        expectedAnswer = null;
        actualAnswer = null;
    }

    @Test
    void canJumpTestOne() {
        nums = new int[]{2, 3, 1, 1, 4};
        expectedAnswer = true;

        actualAnswer = objUnderTest.canJump(nums);

        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    void canJumpTestTwo() {
        nums = new int[]{3, 2, 1, 0, 4};
        expectedAnswer = false;

        actualAnswer = objUnderTest.canJump(nums);

        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    void canJumpTestThree() {
        nums = new int[]{0};
        expectedAnswer = true;

        actualAnswer = objUnderTest.canJump(nums);

        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    void canJumpTestFour() {
        nums = new int[]{1,2,3};
        expectedAnswer = true;

        actualAnswer = objUnderTest.canJump(nums);

        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    void canJumpTestFive() {
        nums = new int[]{1,1,1,0};
        expectedAnswer = true;

        actualAnswer = objUnderTest.canJump(nums);

        assertEquals(expectedAnswer, actualAnswer);
    }
}