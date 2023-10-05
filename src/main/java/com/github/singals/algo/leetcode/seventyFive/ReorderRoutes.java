package com.github.singals.algo.leetcode.seventyFive;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * There are n cities numbered from 0 to n - 1 and n - 1 roads such that there is only
 * one way to travel between two different cities (this network form a tree). Last year,
 * The ministry of transport decided to orient the roads in one direction because they
 * are too narrow.
 * <p>
 * Roads are represented by connections where connections[i] = [ai, bi] represents a
 * road from city ai to city bi.
 * <p>
 * This year, there will be a big event in the capital (city 0), and many people want to
 * travel to this city.
 * <p>
 * Your task consists of reorienting some roads such that each city can visit the city 0.
 * Return the minimum number of edges changed.
 * <p>
 * It's guaranteed that each city can reach city 0 after reorder.
 */
public class ReorderRoutes {

    public int minReorder(int n, int[][] connections) {
        List<List<Integer>> edges = new ArrayList<>();
        IntStream.range(0, n).forEach(i -> edges.add(new ArrayList<>()));

        for (var edge : connections) {
            edges.get(edge[0]).add(edge[1]);
            edges.get(edge[1]).add(-edge[0]);
        }

        return dfs(edges, new boolean[n], 0);
    }

    private int dfs(List<List<Integer>> edges, boolean[] isVisited, int from) {
        int change = 0;
        isVisited[from] = true;
        for (Integer to : edges.get(from)) {
            if (!isVisited[Math.abs(to)]) {
                change += dfs(edges, isVisited, Math.abs(to));
                change += to > 0 ? 1 : 0;
            }
        }
        return change;
    }

}
