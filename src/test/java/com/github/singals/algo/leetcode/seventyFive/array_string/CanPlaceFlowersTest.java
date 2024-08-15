package com.github.singals.algo.leetcode.seventyFive.array_string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanPlaceFlowersTest {

    @Test
    @DisplayName("can-place-flower-when-flower-bed-is-full")
    void canPlaceFlowerWhenFlowerBedIsFull() {
        int[] flowerbed = new int[]{1, 0, 1, 0, 1};
        boolean res = CanPlaceFlowers.canPlaceFlowers(flowerbed, 1);
        assertFalse(res);

        flowerbed = new int[]{0, 1, 0, 1, 0};
        res = CanPlaceFlowers.canPlaceFlowers(flowerbed, 1);
        assertFalse(res);

        flowerbed = new int[]{0, 1, 0, 1};
        res = CanPlaceFlowers.canPlaceFlowers(flowerbed, 1);
        assertFalse(res);

        flowerbed = new int[]{1, 0, 1, 0};
        res = CanPlaceFlowers.canPlaceFlowers(flowerbed, 1);
        assertFalse(res);

        flowerbed = new int[]{1};
        res = CanPlaceFlowers.canPlaceFlowers(flowerbed, 1);
        assertFalse(res);
    }

    @Test
    @DisplayName("can-place-flower-when-there-is-space")
    void canPlaceFlowerWhenThereIsSpace() {
        int[] flowerbed = new int[]{1, 0, 0, 0, 1};
        boolean res = CanPlaceFlowers.canPlaceFlowers(flowerbed, 1);
        assertTrue(res);

        flowerbed = new int[]{0, 1, 0, 0, 0};
        res = CanPlaceFlowers.canPlaceFlowers(flowerbed, 1);
        assertTrue(res);

        flowerbed = new int[]{1, 0, 0, 0};
        res = CanPlaceFlowers.canPlaceFlowers(flowerbed, 1);
        assertTrue(res);

        flowerbed = new int[]{0, 1, 0, 0};
        res = CanPlaceFlowers.canPlaceFlowers(flowerbed, 1);
        assertTrue(res);

        flowerbed = new int[]{0};
        res = CanPlaceFlowers.canPlaceFlowers(flowerbed, 1);
        assertTrue(res);
    }

    @Test
    @DisplayName("can-place-flower-when-space-is-lesser")
    void canPlaceFlowerWhenSpaceIsLesser() {
        int[] flowerbed = new int[]{1, 0, 0, 0, 1};
        boolean res = CanPlaceFlowers.canPlaceFlowers(flowerbed, 2);
        assertFalse(res);

        flowerbed = new int[]{0, 1, 0, 0, 0};
        res = CanPlaceFlowers.canPlaceFlowers(flowerbed, 2);
        assertFalse(res);

        flowerbed = new int[]{1, 0, 0, 0};
        res = CanPlaceFlowers.canPlaceFlowers(flowerbed, 2);
        assertFalse(res);

        flowerbed = new int[]{0, 1, 0, 0};
        res = CanPlaceFlowers.canPlaceFlowers(flowerbed, 2);
        assertFalse(res);
    }

    @Test
    @DisplayName("can-place-flower-when-too-many-flowers")
    void canPlaceFlowerWhenTooManyFlowers() {
        int[] flowerbed = new int[]{0, 0, 0, 0, 0};
        boolean res = CanPlaceFlowers.canPlaceFlowers(flowerbed, 4);
        assertFalse(res);
    }
}