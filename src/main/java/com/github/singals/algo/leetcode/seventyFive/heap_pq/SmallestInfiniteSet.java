package com.github.singals.algo.leetcode.seventyFive.heap_pq;

import java.util.*;
import java.util.stream.IntStream;

/**
 * You have a set which contains all positive integers [1, 2, 3, 4, 5, ...].
 * <p>
 * Implement the SmallestInfiniteSet class:
 * <p>
 * SmallestInfiniteSet() Initializes the SmallestInfiniteSet object to contain all
 * positive integers.
 * int popSmallest() Removes and returns the smallest integer contained in the
 * infinite set.
 * void addBack(int num) Adds a positive integer num back into the infinite set,
 * if it is not already in the infinite set.
 */
public class SmallestInfiniteSet {
    private PriorityQueue<Integer> pq = null;
    private Set<Integer> set = null;

    public SmallestInfiniteSet() {
        pq = new PriorityQueue<>(1000);
        set = new HashSet<>(1000);

        IntStream.range(1, 1001).forEach(num -> {
            pq.add(num);
            set.add(num);
        });
    }

    public int popSmallest() {
        Integer smallestNum = pq.poll();
        set.remove(smallestNum);
        return smallestNum;
    }

    public void addBack(int num) {
        if (!set.contains(num)) {
            pq.add(num);
            set.add(num);
        }
    }
}
