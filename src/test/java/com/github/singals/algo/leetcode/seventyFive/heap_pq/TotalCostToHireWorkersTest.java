package com.github.singals.algo.leetcode.seventyFive.heap_pq;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TotalCostToHireWorkersTest {

    private int[] costs;
    private int k;
    private int candidates;
    private long actualResult;

    @Test
    @DisplayName("calculate-total-cost-to-hire-workers-when-k-is-maximised")
    void calculateTotalCostToHireWorkersWhenKIsMaximised() {
        costs = new int[]{1, 2, 3, 4, 5};
        k = 5;
        candidates = 2;
        actualResult = TotalCostToHireWorkers.totalCost(costs, k, candidates);

        assertEquals(15, actualResult);
    }

    @Test
    @DisplayName("calculate-total-cost-to-hire-workers-when-k-is-twice-candidates")
    void calculateTotalCostToHireWorkersWhenKIsTwiceCandidates() {
        costs = new int[]{1, 2, 3, 4, 5, 6};
        k = 6;
        candidates = 3;
        actualResult = TotalCostToHireWorkers.totalCost(costs, k, candidates);

        assertEquals(21, actualResult);
    }

    @Test
    @DisplayName("calculate-total-cost-to-hire-workers-example-one")
    void calculateTotalCostToHireWorkersExampleOne() {
        costs = new int[]{17, 12, 10, 2, 7, 2, 11, 20, 8};
        k = 3;
        candidates = 4;
        actualResult = TotalCostToHireWorkers.totalCost(costs, k, candidates);

        assertEquals(11, actualResult);
    }

    @Test
    @DisplayName("calculate-total-cost-to-hire-workers-example-two")
    void calculateTotalCostToHireWorkersExampleTwo() {
        costs = new int[]{1, 2, 4, 1};
        k = 3;
        candidates = 3;
        actualResult = TotalCostToHireWorkers.totalCost(costs, k, candidates);

        assertEquals(4, actualResult);
    }

    @Test
    @DisplayName("calculate-total-cost-to-hire-workers-example-three")
    void calculateTotalCostToHireWorkersExampleThree() {
        costs = new int[]{18, 64, 12, 21, 21, 78, 36, 58, 88, 58, 99, 26, 92,
                91, 53, 10, 24, 25, 20, 92, 73, 63, 51, 65, 87, 6, 17, 32, 14, 42, 46, 65, 43, 9, 75};
        k = 13;
        candidates = 23;
        actualResult = TotalCostToHireWorkers.totalCost(costs, k, candidates);

        assertEquals(223, actualResult);
    }

    @Test
    @DisplayName("calculate-total-cost-to-hire-workers-example-four")
    void calculateTotalCostToHireWorkersExampleFour() {
        costs = new int[]{28, 35, 21, 13, 21, 72, 35, 52, 74, 92, 25, 65, 77, 1, 73, 32, 43, 68, 8, 100, 84, 80, 14,
                88, 42, 53, 98, 69, 64, 40, 60, 23, 99, 83, 5, 21, 76, 34};
        k = 32;
        candidates = 12;
        actualResult = TotalCostToHireWorkers.totalCost(costs, k, candidates);

        assertEquals(1407, actualResult);
    }

    @Test
    @DisplayName("calculate-total-cost-to-hire-workers-example-five")
    void calculateTotalCostToHireWorkersExampleFive() {
        costs = new int[]{513,633,441,583,771,616,880,713,998,209,197,923};
        k = 10;
        candidates = 5;
        actualResult = TotalCostToHireWorkers.totalCost(costs, k, candidates);

        assertEquals(5556, actualResult);
    }
}