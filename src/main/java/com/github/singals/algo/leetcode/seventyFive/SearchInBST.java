package com.github.singals.algo.leetcode.seventyFive;

public class SearchInBST {

    private TreeNode ptr;
    private int val;

    public TreeNode searchBST(TreeNode root, int val) {
        this.val = val;
        helper(root);
        return ptr;
    }

    private void helper(TreeNode root) {
        if (root == null) return;
        else if (root.val == val) ptr = root;
        else if (val > root.val) helper(root.right);
        else helper(root.left); // if (val < root.val)
    }
}
