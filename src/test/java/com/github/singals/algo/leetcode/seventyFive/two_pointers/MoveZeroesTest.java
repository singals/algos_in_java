package com.github.singals.algo.leetcode.seventyFive.two_pointers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {
    @Test
    @DisplayName("move-zeroes-when-all-zeroes")
    void moveZeroesWhenAllZeroes() {
        int[] input = {0, 0, 0, 0};
        MoveZeroes.moveZeroes(input);
        assertArrayEquals(new int[]{0, 0, 0, 0}, input);

        input = new int[]{0};
        MoveZeroes.moveZeroes(input);
        assertArrayEquals(new int[]{0}, input);
    }

    @Test
    @DisplayName("move-zeroes-when-some-zeroes")
    void moveZeroesWhenSomeZeroes() {
        int[] input = {0, 1, 0, 3, 12};
        MoveZeroes.moveZeroes(input);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, input);
//
        input = new int[]{0, 0, 1};
//        int[] input = new int[]{0, 0, 1};
        MoveZeroes.moveZeroes(input);
        assertArrayEquals(new int[]{1, 0, 0}, input);
    }

    @Test
    @DisplayName("move-zeroes-when-no-zeroes")
    void moveZeroesWhenNoZeroes() {
        int[] input = {1, 2, 3, 12};
        MoveZeroes.moveZeroes(input);
        assertArrayEquals(new int[]{1, 2, 3, 12}, input);
    }

}