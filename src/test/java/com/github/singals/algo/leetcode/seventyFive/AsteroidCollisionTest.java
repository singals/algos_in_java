package com.github.singals.algo.leetcode.seventyFive;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AsteroidCollisionTest {

    @Test
    @DisplayName("asteroid-collision-when-no-collision")
    void asteroidCollisionWhenNoCollision() {
        int[] res = AsteroidCollision.asteroidCollision(new int[]{1, 2, 4, 1});
        assertArrayEquals(new int[]{1, 2, 4, 1}, res);

        res = AsteroidCollision.asteroidCollision(new int[]{-1, -3, -2, -1});
        assertArrayEquals(new int[]{-1, -3, -2, -1}, res);

        res = AsteroidCollision.asteroidCollision(new int[]{-1, -1, -1});
        assertArrayEquals(new int[]{-1, -1, -1}, res);

        res = AsteroidCollision.asteroidCollision(new int[]{1, 1, 1});
        assertArrayEquals(new int[]{1, 1, 1}, res);

        res = AsteroidCollision.asteroidCollision(new int[]{-2, -1, 1, 2});
        assertArrayEquals(new int[]{-2, -1, 1, 2}, res);
    }

    @Test
    @DisplayName("asteroid-collision")
    void asteroidCollision() {
        int[] res = AsteroidCollision.asteroidCollision(new int[]{5, 10, -5});
        assertArrayEquals(new int[]{5, 10}, res);

        res = AsteroidCollision.asteroidCollision(new int[]{8, -8});
        assertArrayEquals(new int[]{}, res);

        res = AsteroidCollision.asteroidCollision(new int[]{10, 2, -5});
        assertArrayEquals(new int[]{10}, res);

        res = AsteroidCollision.asteroidCollision(new int[]{10, -2, -5});
        assertArrayEquals(new int[]{10}, res);

        res = AsteroidCollision.asteroidCollision(new int[]{10, 2, -15});
        assertArrayEquals(new int[]{-15}, res);
    }
}