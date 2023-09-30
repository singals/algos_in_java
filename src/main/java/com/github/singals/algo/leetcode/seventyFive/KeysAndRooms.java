package com.github.singals.algo.leetcode.seventyFive;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KeysAndRooms {
    private boolean[] visited;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        this.visited = new boolean[rooms.size()];
        visited[0] = true;
        dfs(rooms, 0);
        for (boolean isRoomVisited : visited) if (!isRoomVisited) return false;
        return true;
    }

    private void dfs(List<List<Integer>> rooms, int ind) {
        for (int key : rooms.get(ind)) {
            if (!visited[key]) {
                visited[key] = true;
                dfs(rooms, key);
            }
        }
    }
}
