package com.github.singals.algo.leetcode.top_interview_150.array_string;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameIITest {

    private JumpGameII objUnderTest;
    private int[] nums;

    private Integer expectedAnswer;
    private Integer actualAnswer;

    @BeforeEach
    void setUp() {
        objUnderTest = new JumpGameII();
    }

    @AfterEach
    void tearDown() {
        nums = null;
        expectedAnswer = null;
        actualAnswer = null;
    }

    @Test
    void jumpTestOne() {
        nums = new int[]{2, 3, 1, 1, 4};
        expectedAnswer = 2;

        actualAnswer = objUnderTest.jump(nums);

        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    void jumpTestTwo() {
        nums = new int[]{2, 3, 0, 1, 4};
        expectedAnswer = 2;

        actualAnswer = objUnderTest.jump(nums);

        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    void jumpTestThree() {
        nums = new int[]{0};
        expectedAnswer = 0;

        actualAnswer = objUnderTest.jump(nums);

        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    void canJumpTestFour() {
        nums = new int[]{1, 2, 3};
        expectedAnswer = 2;

        actualAnswer = objUnderTest.jump(nums);

        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    void canJumpTestFive() {
        nums = new int[]{1, 1, 1, 0};
        expectedAnswer = 3;

        actualAnswer = objUnderTest.jump(nums);

        assertEquals(expectedAnswer, actualAnswer);
    }

    @Test
    void canJumpTestSix() {
        nums = new int[]{1, 2, 3, 4, 5};
        expectedAnswer = 3;

        actualAnswer = objUnderTest.jump(nums);

        assertEquals(expectedAnswer, actualAnswer);
    }
}