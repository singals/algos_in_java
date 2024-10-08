package com.github.singals.algo.leetcode.seventyFive.queue;

import java.util.*;

/**
 * You have a RecentCounter class which counts the number of recent requests within
 * a certain time frame.
 * <p>
 * Implement the RecentCounter class:
 * <p>
 * RecentCounter() Initializes the counter with zero recent requests.
 * int ping(int t) Adds a new request at time t, where t represents some
 * time in milliseconds, and returns the number of requests that has
 * happened in the past 3000 milliseconds (including the new request).
 * Specifically, return the number of requests that have happened in
 * the inclusive range [t - 3000, t].
 * <p>
 * It is guaranteed that every call to ping uses a strictly larger value of t than
 * the previous call.
 */
public class RecentCounter {
    Deque<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);
        while (t - queue.getFirst() > 3000) queue.remove();
        return queue.size();
    }
}
