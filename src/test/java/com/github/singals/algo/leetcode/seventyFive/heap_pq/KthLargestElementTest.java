package com.github.singals.algo.leetcode.seventyFive.heap_pq;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestElementTest {

    private KthLargestElement kthLargestElement;

    @BeforeEach
    void setUp() {
        kthLargestElement = new KthLargestElement();
    }

    @Test
    @DisplayName("test-find-kth-largest-example-one")
    void testFindKthLargestExampleOne() {
        int res = kthLargestElement.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2);

        assertEquals(5, res);
    }

    @Test
    @DisplayName("test-find-kth-largest-example-two")
    void testFindKthLargestExampleTwo() {
        int res = kthLargestElement.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4);

        assertEquals(4, res);
    }
}