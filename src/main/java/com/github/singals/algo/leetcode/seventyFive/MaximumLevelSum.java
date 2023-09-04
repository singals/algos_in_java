package com.github.singals.algo.leetcode.seventyFive;

import java.util.*;

/**
 * Given the root of a binary tree, the level of its root is 1, the level of its
 * children is 2, and so on.
 * <p>
 * Return the smallest level x such that the sum of all the values of nodes at
 * level x is maximal.
 */
public class MaximumLevelSum {
    private Map<Integer, Integer> levelSums = new HashMap<>();

    public int maxLevelSum(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        getLevelSum(root, 0);

        Optional<Integer> maxInd = levelSums.keySet()
                .stream()
                .max((x, y) -> levelSums.get(x).compareTo(levelSums.get(y)));
        return maxInd.get() + 1;
    }

    private void getLevelSum(TreeNode root, int level) {
        Integer currSum = levelSums.getOrDefault(level, 0);
        currSum += root.val;
        levelSums.put(level, currSum);
        if (root.left != null) getLevelSum(root.left, level + 1);
        if (root.right != null) getLevelSum(root.right, level + 1);
    }
}
