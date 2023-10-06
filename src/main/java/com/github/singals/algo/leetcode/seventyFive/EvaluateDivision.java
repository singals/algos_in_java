package com.github.singals.algo.leetcode.seventyFive;

import java.util.*;

/**
 * You are given an array of variable pairs equations and an array of real numbers
 * values, where equations[i] = [Ai, Bi] and values[i] represent the equation
 * Ai / Bi = values[i]. Each Ai or Bi is a string that represents a single variable.
 * <p>
 * You are also given some queries, where queries[j] = [Cj, Dj] represents the jth
 * query where you must find the answer for Cj / Dj = ?.
 * <p>
 * Return the answers to all queries. If a single answer cannot be determined,
 * return -1.0.
 * <p>
 * Note: The input is always valid. You may assume that evaluating the queries will
 * not result in division by zero and that there is no contradiction.
 * <p>
 * Note: The variables that do not occur in the list of equations are undefined, so
 * the answer cannot be determined for them.
 */
public class EvaluateDivision {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = buildGraph(equations, values);
        double[] result = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            List<String> query = queries.get(i);
            String dividend = query.get(0);
            String divisor = query.get(1);
            if (!graph.containsKey(dividend) || !graph.containsKey(divisor)) {
                result[i] = -1;
            } else {
                Set<String> vis = new HashSet<>();
                double[] ans = {-1.0};
                double temp = 1.0;
                dfs(dividend, divisor, graph, vis, ans, temp);
                result[i] = ans[0];
            }
        }
        return result;
    }

    private void dfs(String dividend, String divisor, Map<String, Map<String, Double>> graph, Set<String> vis, double[] ans, double temp) {
        if (vis.contains(dividend)) return;

        vis.add(dividend);
        if (dividend.equals(divisor)) {
            ans[0] = temp;
            return;
        }

        for (Map.Entry<String, Double> entry : graph.get(dividend).entrySet()) {
            String neighbour = entry.getKey();
            double val = entry.getValue();
            dfs(neighbour, divisor, graph, vis, ans, temp * val);
        }
    }

    private Map<String, Map<String, Double>> buildGraph(List<List<String>> equations, double[] values) {
        Map<String, Map<String, Double>> graph = new HashMap<>();
        for (int i = 0; i < equations.size(); i++) {
            String dividend = equations.get(i).get(0);
            String divisor = equations.get(i).get(1);
            double value = values[i];
            graph.putIfAbsent(dividend, new HashMap<>());
            graph.putIfAbsent(divisor, new HashMap<>());
            graph.get(dividend).put(divisor, value);
            graph.get(divisor).put(dividend, 1.0 / value);
        }
        return graph;
    }
}
