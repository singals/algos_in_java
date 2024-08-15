package com.github.singals.algo.leetcode.seventyFive.bt_dfs;

public class LongestZigZagPath {
    private int maxPath = 0;

    public int longestZigZag(TreeNode root) {
        if (root == null) return 0;

        if (root.left != null) calculatePath(root.left, 1, true);
        if (root.right != null) calculatePath(root.right, 1, false);
        return maxPath;
    }

    private void calculatePath(TreeNode root, int currPath, boolean isArrivingFromLeft) {
        if (root.left == null && root.right == null) {
            maxPath = Math.max(maxPath, currPath);
            return;
        }
        if (isArrivingFromLeft) {
            if (root.right != null) {
                calculatePath(root.right, currPath + 1, false);
            } else {
                maxPath = Math.max(maxPath, currPath);
            }

            if (root.left != null) {
                calculatePath(root.left, 1, true);
            }
        } else {
            if (root.left != null) {
                calculatePath(root.left, currPath + 1, true);
            } else {
                maxPath = Math.max(maxPath, currPath);
            }

            if (root.right != null) {
                calculatePath(root.right, 1, false);
            }
        }
    }
}
