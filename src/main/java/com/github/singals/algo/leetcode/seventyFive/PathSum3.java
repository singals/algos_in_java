package com.github.singals.algo.leetcode.seventyFive;

import java.util.HashMap;
import java.util.Map;

public class PathSum3 {
    private Map<Long, Integer> sums = new HashMap<>();
    private int targetSum;
    private int counter;

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        this.targetSum = targetSum;
        sums.put(0l, 1);
        checkPathSum(root, 0);
        return counter;
    }

    private void checkPathSum(TreeNode node, long currSum) {
        currSum += node.val;
        counter += sums.getOrDefault(currSum - targetSum, 0);

        sums.put(currSum, sums.getOrDefault(currSum, 0) + 1);

        if (node.left != null) {
            checkPathSum(node.left, currSum);
        }
        if (node.right != null) {
            checkPathSum(node.right, currSum);
        }

        Integer count = sums.get(currSum);
        if (count == 1) sums.remove(currSum);
        else sums.put(currSum, count - 1);
    }
}
