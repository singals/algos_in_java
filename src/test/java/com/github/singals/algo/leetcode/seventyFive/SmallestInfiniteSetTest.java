package com.github.singals.algo.leetcode.seventyFive;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestInfiniteSetTest {

    private SmallestInfiniteSet smallestInfiniteSet;

    @BeforeEach
    void setUp() {
        smallestInfiniteSet = new SmallestInfiniteSet();
    }

    @Test
    @DisplayName("test-smallest-infinite-set-example-one")
    void testSmallestInfiniteSetExampleOne() {
        smallestInfiniteSet.addBack(2);

        assertEquals(1, smallestInfiniteSet.popSmallest());
        assertEquals(2, smallestInfiniteSet.popSmallest());
        assertEquals(3, smallestInfiniteSet.popSmallest());

        smallestInfiniteSet.addBack(1);

        assertEquals(1, smallestInfiniteSet.popSmallest());
        assertEquals(4, smallestInfiniteSet.popSmallest());
        assertEquals(5, smallestInfiniteSet.popSmallest());
    }

    @Test
    @DisplayName("test-smallest-infinite-set-example-two")
    void testSmallestInfiniteSetExampleTwo() {
        assertEquals(1, smallestInfiniteSet.popSmallest());
        smallestInfiniteSet.addBack(1);
        assertEquals(1, smallestInfiniteSet.popSmallest());
        assertEquals(2, smallestInfiniteSet.popSmallest());
        assertEquals(3, smallestInfiniteSet.popSmallest());
        smallestInfiniteSet.addBack(2);
        smallestInfiniteSet.addBack(3);
        assertEquals(2, smallestInfiniteSet.popSmallest());
        assertEquals(3, smallestInfiniteSet.popSmallest());
    }
}