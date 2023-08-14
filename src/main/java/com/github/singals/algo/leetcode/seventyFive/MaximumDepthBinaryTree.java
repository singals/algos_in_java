package com.github.singals.algo.leetcode.seventyFive;

public class MaximumDepthBinaryTree {
    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        return getHeight(root, 1);
    }

    private static int getHeight(TreeNode root, int depth) {
        int left = depth, right = depth;
        if (root.left == null && root.right == null) return depth;
        if (root.left != null) {
            left = getHeight(root.left, depth + 1);
        }
        if (root.right != null) {
            right = getHeight(root.right, depth + 1);
        }
        return Math.max(left, right);
    }
}
