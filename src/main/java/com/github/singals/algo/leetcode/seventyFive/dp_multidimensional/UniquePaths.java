package com.github.singals.algo.leetcode.seventyFive.dp_multidimensional;

//https://leetcode.com/problems/unique-paths/
public class UniquePaths {
    private Integer[][] grid;

    public int uniquePaths(int m, int n) {
        grid = new Integer[m][n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i == m - 1 && j == n - 1) {
                    grid[i][j] = 1;
                    continue;
                }

                grid[i][j] = getLowerValueIfExist(i, j) + getRightValueIfExist(i, j);
            }
        }
        return grid[0][0];
    }

    private int getLowerValueIfExist(int i, int j) {
        if (!canMoveDown(i)) return 0;
        else return grid[i + 1][j];
    }

    private int getRightValueIfExist(int i, int j) {
        if (!canMoveRight(j)) return 0;
        else return grid[i][j + 1];
    }

    private boolean canMoveDown(int i) {
        return grid.length > i + 1;
    }

    private boolean canMoveRight(int j) {
        return grid[0].length > j + 1;
    }
}
