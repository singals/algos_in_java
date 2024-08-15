package com.github.singals.algo.leetcode.seventyFive.hashmap_set;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a 0-indexed n x n integer matrix grid, return the number of pairs (ri, cj)
 * such that row ri and column cj are equal.
 * <p>
 * A row and column pair is considered equal if they contain the same elements
 * in the same order (i.e., an equal array).
 */
public class EqualRowAndColumnPair {
    public static int equalPairs(int[][] grid) {
        Map<String, Integer> rows = new HashMap<>();
        Map<String, Integer> columns = new HashMap<>();

        for (int[] row : grid) {
            StringBuilder sb = new StringBuilder();
            for (int num : row) {
                sb.append(num).append('-');
            }
            String rowName = sb.toString();
            Integer rowCount = rows.get(rowName);
            if (rowCount == null) rows.put(rowName, 1);
            else rows.put(rowName, ++rowCount);
        }

        for (int i = 0; i < grid.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int[] ints : grid) {
                sb.append(ints[i]).append('-');
            }
            String columnName = sb.toString();
            Integer colCount = columns.get(columnName);
            if (colCount == null) columns.put(columnName, 1);
            else columns.put(columnName, ++colCount);
        }

        int pairCount = 0;

        for (String rowName : rows.keySet()) {
            Integer columnCount = columns.get(rowName);
            if (columnCount != null) {
                pairCount += columnCount * rows.get(rowName);
            }
        }
        return pairCount;
    }
}