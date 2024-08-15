package com.github.singals.algo.leetcode.seventyFive.bt_dfs;

public class SimilarLeafTree {
    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        StringBuilder leaf1 = getLeafNodesInOrder(root1, new StringBuilder());
        StringBuilder leaf2 = getLeafNodesInOrder(root2, new StringBuilder());
        return CharSequence.compare(leaf1, leaf2) == 0;
    }

    private static StringBuilder getLeafNodesInOrder(TreeNode root, StringBuilder sb) {
        if (root.left == null && root.right == null) {
            sb.append(root.val);
            sb.append('-');
        }
        if (root.left != null) {
            getLeafNodesInOrder(root.left, sb);
        }
        if (root.right != null) {
            getLeafNodesInOrder(root.right, sb);
        }
        return sb;
    }

}
