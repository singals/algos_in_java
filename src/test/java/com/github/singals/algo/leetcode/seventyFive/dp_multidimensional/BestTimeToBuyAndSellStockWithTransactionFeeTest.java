package com.github.singals.algo.leetcode.seventyFive.dp_multidimensional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockWithTransactionFeeTest {
    private BestTimeToBuyAndSellStockWithTransactionFee objUnderTest;

    private int[] prices;
    private int fee;

    private Integer actualResult;
    private Integer expectedResult;

    @BeforeEach
    void setUp() {
        objUnderTest = new BestTimeToBuyAndSellStockWithTransactionFee();
    }

    @AfterEach
    void tearDown() {
        prices = null;
        fee = 0;
        actualResult = null;
        expectedResult = null;
    }

    @Test
    void maxProfitTestOne() {
        prices = new int[]{1, 3, 2, 8, 4, 9};
        fee = 2;
        expectedResult = 8;

        actualResult = objUnderTest.maxProfit(prices, fee);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void maxProfitTestTwo() {
        prices = new int[]{1, 3, 7, 5, 10, 3};
        fee = 3;
        expectedResult = 6;

        actualResult = objUnderTest.maxProfit(prices, fee);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void maxProfitTestThree() {
        prices = new int[]{9, 8, 7, 6, 5};
        fee = 2;
        expectedResult = 0;

        actualResult = objUnderTest.maxProfit(prices, fee);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void maxProfitTestFour() {
        prices = new int[]{9, 9, 9, 9, 9};
        fee = 2;
        expectedResult = 0;

        actualResult = objUnderTest.maxProfit(prices, fee);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void maxProfitTestFive() {
        prices = new int[]{10, 9, 9, 9, 9};
        fee = 2;
        expectedResult = 0;

        actualResult = objUnderTest.maxProfit(prices, fee);

        assertEquals(expectedResult, actualResult);
    }
}