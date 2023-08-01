package com.github.singals.algo.leetcode.seventyFive;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HighestAltitudeTest {
    @Test
    @DisplayName("highest-altitude-when-going-up")
    void highestAltitudeWhenGoingUp() {
        int maxAlt = HighestAltitude.largestAltitude(new int[]{1, 2, 3, 4, 5});
        assertEquals(15, maxAlt);

        maxAlt = HighestAltitude.largestAltitude(new int[]{1, 0, 0, 0, 1});
        assertEquals(2, maxAlt);

        maxAlt = HighestAltitude.largestAltitude(new int[]{1, 1, 1, 1, 1});
        assertEquals(5, maxAlt);
    }

    @Test
    @DisplayName("highest-altitude-when-going-down")
    void highestAltitudeWhenGoingDown() {
        int maxAlt = HighestAltitude.largestAltitude(new int[]{-1, -2, -3, -4, -5});
        assertEquals(0, maxAlt);

        maxAlt = HighestAltitude.largestAltitude(new int[]{-1, 0, 0, 0, -1});
        assertEquals(0, maxAlt);

        maxAlt = HighestAltitude.largestAltitude(new int[]{-1, -1, -1, -1, -1});
        assertEquals(0, maxAlt);
    }

    @Test
    @DisplayName("highest-altitude")
    void highestAltitude() {
        int maxAlt = HighestAltitude.largestAltitude(new int[]{-5, 1, 5, 0, -7});
        assertEquals(1, maxAlt);

        maxAlt = HighestAltitude.largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2});
        assertEquals(0, maxAlt);
    }
}