package com.github.singals.algo.leetcode.seventyFive.graph_dfs;

import java.util.LinkedList;
import java.util.List;

/**
 * There are n cities. Some of them are connected, while some are not. If city a is connected
 * directly with city b, and city b is connected directly with city c, then city a is connected
 * indirectly with city c.
 * <p>
 * A province is a group of directly or indirectly connected cities and no other cities
 * outside of the group.
 * <p>
 * You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the ith city and
 * the jth city are directly connected, and isConnected[i][j] = 0 otherwise.
 * <p>
 * Return the total number of provinces.
 */
public class NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        int noOfCities = isConnected.length;
        boolean[] isVisited = new boolean[noOfCities];
        int count = 0;

        for (int i = 0; i < noOfCities; i++) {
            if (!isVisited[i]) {
                count++;
                dfs(i, isVisited, isConnected);
            }
        }
        return count;
    }

    private void dfs(int i, boolean[] isVisited, int[][] isConnected) {
        isVisited[i] = true;
        List<Integer> adjacentCities = new LinkedList<>();
        int[] connections = isConnected[i];
        for (int j = 0; j < isConnected.length; j++) {
            int connection = connections[j];
            if (connection == 1 && i != j) adjacentCities.add(j);
        }

        for (Integer adjacentCity : adjacentCities) {
            if (!isVisited[adjacentCity]) {
                dfs(adjacentCity, isVisited, isConnected);
            }
        }
    }
}
