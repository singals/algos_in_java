package com.github.singals.algo.leetcode.top_interview_150.array_string;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    private BestTimeToBuyAndSellStock objUnderTest;
    private int[] prices;
    private Integer expectedProfit;
    private Integer actualProfit;


    @BeforeEach
    void setUp() {
        objUnderTest = new BestTimeToBuyAndSellStock();
    }

    @AfterEach
    void tearDown() {
        prices = null;
        expectedProfit = null;
        actualProfit = null;
    }

    @Test
    void maxProfitTestOne() {
        prices = new int[]{7, 1, 5, 3, 6, 4};
        expectedProfit = 5;

        actualProfit = objUnderTest.maxProfit(prices);

        assertEquals(expectedProfit, actualProfit);
    }

    @Test
    void maxProfitTestTwo() {
        prices = new int[]{7, 6, 4, 3, 1};
        expectedProfit = 0;

        actualProfit = objUnderTest.maxProfit(prices);

        assertEquals(expectedProfit, actualProfit);
    }

    @Test
    void maxProfitTestThree() {
        prices = new int[]{7, 3, 2, 6, 8, 1};
        expectedProfit = 6;

        actualProfit = objUnderTest.maxProfit(prices);

        assertEquals(expectedProfit, actualProfit);
    }
}