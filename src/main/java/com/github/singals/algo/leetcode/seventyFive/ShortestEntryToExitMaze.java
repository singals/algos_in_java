package com.github.singals.algo.leetcode.seventyFive;

import java.util.LinkedList;
import java.util.Queue;

/**
 * You are given an m x n matrix maze (0-indexed) with empty cells (represented as '.')
 * and walls (represented as '+'). You are also given the entrance of the maze, where
 * entrance = [entrancerow, entrancecol] denotes the row and column of the cell you
 * are initially standing at.
 * <p>
 * In one step, you can move one cell up, down, left, or right. You cannot step into
 * a cell with a wall, and you cannot step outside the maze. Your goal is to find the
 * nearest exit from the entrance. An exit is defined as an empty cell that is at the
 * border of the maze. The entrance does not count as an exit.
 * <p>
 * Return the number of steps in the shortest path from the entrance to the nearest
 * exit, or -1 if no such path exists.
 */
public class ShortestEntryToExitMaze {

    public int nearestExit(char[][] maze, int[] entrance) {
        int rows = maze.length;
        int columns = maze[0].length;

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(entrance);
        maze[entrance[0]][entrance[1]] = '+';

        // As simple 2D array to keep track of the directions to take.
        int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        int steps = 0;
        int x, y;
        while (!queue.isEmpty()) {
            steps++;
            int n = queue.size();

            for (int i = 0; i < n; i++) {
                int[] current = queue.poll();
                // For each node, check every direction.
                for (int[] direction : directions) {
                    x = current[0] + direction[0];
                    y = current[1] + direction[1];

                    if (x < 0 || x >= rows || y < 0 || y >= columns) continue;
                    if (maze[x][y] == '+') continue;
                    if (x == 0 || x == rows - 1 || y == 0 || y == columns - 1) return steps;

                    maze[x][y] = '+';
                    queue.offer(new int[]{x, y});
                }
            }
        }
        return -1;
    }
}

