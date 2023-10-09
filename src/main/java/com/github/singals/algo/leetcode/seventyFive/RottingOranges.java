package com.github.singals.algo.leetcode.seventyFive;

import java.util.LinkedList;
import java.util.Queue;

/**
 * You are given an m x n grid where each cell can have one of three values:
 * <p>
 * 0 representing an empty cell,
 * 1 representing a fresh orange, or
 * 2 representing a rotten orange.
 * Every minute, any fresh orange that is 4-directionally adjacent to a rotten
 * orange becomes rotten.
 * <p>
 * Return the minimum number of minutes that must elapse until no cell has a fresh
 * orange. If this is impossible, return -1.
 */
public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});

                }
            }
        }
        int[] position = null;
        if (queue.isEmpty()) {
            position = findFirstOccurrence(grid, 1);
            if (position == null) return 0;
            else return -1;
        }


        position = queue.peek();
        grid[position[0]][position[1]] = -1;
        int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int minutes = -1;

        while (!queue.isEmpty()) {
            minutes++;
            int n = queue.size();
            int x, y;
            boolean areAllSurroundingOrangesRotten = true;
            for (int i = 0; i < n; i++) {
                int[] curr = queue.poll();
                for (int[] dir : directions) {
                    x = curr[0] + dir[0];
                    y = curr[1] + dir[1];

                    if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length) continue;
                    if (grid[x][y] == 0) continue;

                    if (grid[x][y] == 1) {
                        queue.offer(new int[]{x, y});
                        grid[x][y] = -1;
                        areAllSurroundingOrangesRotten = false;
                    } else if (grid[x][y] == 2) {
                        grid[x][y] = -1;
                        queue.offer(new int[]{x, y});
                    }
                }
            }
            // since all surrounding oranges are already rotten, no minute is lost
            if (!queue.isEmpty() && areAllSurroundingOrangesRotten) minutes--;
        }

        position = findFirstOccurrence(grid, 1);

        if (position == null) return minutes;
        else return -1;
    }

    private static int[] findFirstOccurrence(int[][] grid, int target) {
        int[] position = null;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == target) {
                    position = new int[2];
                    position[0] = i;
                    position[1] = j;
                    return position;
                }
            }
        }
        return position;
    }
}
