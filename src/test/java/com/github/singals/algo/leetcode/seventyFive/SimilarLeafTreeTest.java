package com.github.singals.algo.leetcode.seventyFive;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimilarLeafTreeTest {

    @Test
    @DisplayName("similar-leaf-tree-example-one")
    void similarLeafTreeExampleOne() {
        TreeNode l3Node1 = new TreeNode(7);
        TreeNode l3Node2 = new TreeNode(4);
        TreeNode l2Node1 = new TreeNode(6);
        TreeNode l2Node2 = new TreeNode(2, l3Node1, l3Node2);
        TreeNode l2Node3 = new TreeNode(9);
        TreeNode l2Node4 = new TreeNode(8);
        TreeNode l1Node1 = new TreeNode(5, l2Node1, l2Node2);
        TreeNode l1Node2 = new TreeNode(1, l2Node3, l2Node4);
        TreeNode root1 = new TreeNode(3, l1Node1, l1Node2);

        TreeNode l3Node1_1 = new TreeNode(9);
        TreeNode l3Node2_1 = new TreeNode(8);
        TreeNode l2Node1_1 = new TreeNode(6);
        TreeNode l2Node2_1 = new TreeNode(7);
        TreeNode l2Node3_1 = new TreeNode(4);
        TreeNode l2Node4_1 = new TreeNode(2, l3Node1_1, l3Node2_1);
        TreeNode l1Node1_1 = new TreeNode(5, l2Node1_1, l2Node2_1);
        TreeNode l1Node2_1 = new TreeNode(1, l2Node3_1, l2Node4_1);
        TreeNode root2 = new TreeNode(3, l1Node1_1, l1Node2_1);

        boolean res = SimilarLeafTree.leafSimilar(root1, root2);

        assertTrue(res);
    }

    @Test
    @DisplayName("similar-leaf-tree-example-two")
    void similarLeafTreeExampleTwo() {
        TreeNode l1Node1 = new TreeNode(2);
        TreeNode l1Node2 = new TreeNode(3);
        TreeNode root1 = new TreeNode(1, l1Node1, l1Node2);

        TreeNode l1Node1_1 = new TreeNode(3);
        TreeNode l1Node2_1 = new TreeNode(2);
        TreeNode root2 = new TreeNode(1, l1Node1_1, l1Node2_1);

        boolean res = SimilarLeafTree.leafSimilar(root1, root2);

        assertFalse(res);
    }
}