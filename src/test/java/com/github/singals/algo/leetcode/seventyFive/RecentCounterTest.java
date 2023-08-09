package com.github.singals.algo.leetcode.seventyFive;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecentCounterTest {

    @Test
    @DisplayName("recent-counter")
    void recentCounter() {
        RecentCounter recentCounter = new RecentCounter();
        int ping = recentCounter.ping(1);
        assertEquals(1, ping);
        ping = recentCounter.ping(100);
        assertEquals(2, ping);
        ping = recentCounter.ping(3001);
        assertEquals(3, ping);
        ping = recentCounter.ping(3002);
        assertEquals(3, ping);
    }
}