package com.github.singals.algo.leetcode.seventyFive.monotonic_stack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockSpannerTest {

    private StockSpanner objUnderTest;

    @BeforeEach
    void setUp() {
        objUnderTest = new StockSpanner();
    }

    @Test
    void testOnlineStockSpanTestOne() {
        assertEquals(1, objUnderTest.next(100));
        assertEquals(1, objUnderTest.next(80));
        assertEquals(1, objUnderTest.next(60));
        assertEquals(2, objUnderTest.next(70));
        assertEquals(1, objUnderTest.next(60));
        assertEquals(4, objUnderTest.next(75));
        assertEquals(6, objUnderTest.next(85));
    }
}