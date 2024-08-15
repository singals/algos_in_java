package com.github.singals.algo.leetcode.seventyFive.bt_dfs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthBinaryTreeTest {
    @Test
    @DisplayName("max-depth-example-one")
    void maxDepthExampleOne() {
        TreeNode l2Node1 = new TreeNode(15);
        TreeNode l2Node2 = new TreeNode(7);
        TreeNode l1Node1 = new TreeNode(9);
        TreeNode l1Node2 = new TreeNode(20, l2Node1, l2Node2);
        TreeNode root = new TreeNode(3, l1Node1, l1Node2);

        int res = MaximumDepthBinaryTree.maxDepth(root);

        assertEquals(3, res);
    }

    @Test
    @DisplayName("max-depth-example-two")
    void maxDepthExampleTwo() {
        TreeNode l1Node2 = new TreeNode(2);
        TreeNode root = new TreeNode(1, null, l1Node2);

        int res = MaximumDepthBinaryTree.maxDepth(root);

        assertEquals(2, res);
    }

    @Test
    @DisplayName("max-depth-when-there-is-just-root-node")
    void maxDepthWhenThereIsJustRootNode() {
        TreeNode root = new TreeNode(1);

        int res = MaximumDepthBinaryTree.maxDepth(root);

        assertEquals(1, res);
    }
}