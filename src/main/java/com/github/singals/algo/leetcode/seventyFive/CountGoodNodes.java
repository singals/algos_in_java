package com.github.singals.algo.leetcode.seventyFive;

/**
 * Given a binary tree root, a node X in the tree is named good if in the path from
 * root to X there are no nodes with a value greater than X.
 * <p>
 * Return the number of good nodes in the binary tree.
 */
public class CountGoodNodes {
    private int ctr = 0;

    public int goodNodes(TreeNode root) {
        countGoodNodes(root, root.val);
        return ctr;
    }

    private void countGoodNodes(TreeNode root, int baseline) {
        if (root.val >= baseline) {
            ctr++;
            baseline = root.val;
        }

        if (root.left != null) countGoodNodes(root.left, baseline);
        if (root.right != null) countGoodNodes(root.right, baseline);
    }
}
