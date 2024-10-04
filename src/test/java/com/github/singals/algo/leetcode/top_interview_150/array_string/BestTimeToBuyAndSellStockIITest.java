package com.github.singals.algo.leetcode.top_interview_150.array_string;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockIITest {

    private BestTimeToBuyAndSellStockII objUnderTest;
    private int[] prices;
    private Integer actualMaxProfit;
    private Integer expectedMaxProfit;

    @BeforeEach
    void setUp() {
        objUnderTest = new BestTimeToBuyAndSellStockII();
    }

    @AfterEach
    void tearDown() {
        prices = null;
        actualMaxProfit = null;
        expectedMaxProfit = null;
    }

    @Test
    void maxProfitTestOne() {
        prices = new int[]{7,1,5,3,6,4};
        expectedMaxProfit = 7;

        actualMaxProfit = objUnderTest.maxProfit(prices);

        assertEquals(expectedMaxProfit, actualMaxProfit);
    }

    @Test
    void maxProfitTestTwo() {
        prices = new int[]{1,2,3,4,5};
        expectedMaxProfit = 4;

        actualMaxProfit = objUnderTest.maxProfit(prices);

        assertEquals(expectedMaxProfit, actualMaxProfit);
    }

    @Test
    void maxProfitTestThree() {
        prices = new int[]{7,6,4,3,1};
        expectedMaxProfit = 0;

        actualMaxProfit = objUnderTest.maxProfit(prices);

        assertEquals(expectedMaxProfit, actualMaxProfit);
    }
}