package com.github.singals.algo.leetcode.seventyFive;

// https://leetcode.com/problems/total-cost-to-hire-k-workers/description

import java.util.PriorityQueue;

public class TotalCostToHireWorkers {
    public static long totalCost(int[] costs, int k, int candidates) {
        int arrLength = costs.length;
        long totalCost = 0L;
        if (arrLength == k) {
            for (int cost : costs) totalCost += cost;
        } else {
            int i = 0, j = costs.length - 1;
            PriorityQueue<Integer> pq1 = new PriorityQueue<>(candidates);
            PriorityQueue<Integer> pq2 = new PriorityQueue<>(candidates);
            boolean[] isVisited = new boolean[arrLength];
            for (int p = 0; p < candidates; p++) {
                if (!isVisited[i]) {
                    pq1.add(costs[i]);
                    isVisited[i] = true;
                    i++;
                }
                if (!isVisited[j]) {
                    pq2.add(costs[j]);
                    isVisited[j] = true;
                    j--;
                }
            }
            while ((k > 0) && (!pq1.isEmpty() || !pq2.isEmpty())) {
                int num1 = Integer.MAX_VALUE;
                int num2 = Integer.MAX_VALUE;
                if (!pq1.isEmpty()) num1 = pq1.peek();
                if (!pq2.isEmpty()) num2 = pq2.peek();

                if (num1 <= num2) {
                    totalCost += pq1.poll();
                    if (!isVisited[i]) {
                        pq1.add(costs[i]);
                        isVisited[i] = true;
                        i++;
                    }
                } else {
                    totalCost += pq2.poll();
                    if (!isVisited[j]) {
                        pq2.add(costs[j]);
                        isVisited[j] = true;
                        j--;
                    }
                }
                k--;
            }
        }
        return totalCost;
    }
}
