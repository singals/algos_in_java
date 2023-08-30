package com.github.singals.algo.leetcode.seventyFive;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowestCommonAncestorTest {
    @Test
    @DisplayName("lowest-common-ancestor-basic-test")
    void lowestCommonAncestorBasicTest() {
        TreeNode l1Node1 = new TreeNode(5);
        TreeNode l1Node2 = new TreeNode(1);
        TreeNode root = new TreeNode(3, l1Node1, l1Node2);

        TreeNode res = new LowestCommonAncestor().lowestCommonAncestor(root, l1Node1, l1Node2);

        assertEquals(3, res.val);
    }

    @Test
    @DisplayName("lowest-common-ancestor-example-one")
    void lowestCommonAncestorExampleOne() {
        TreeNode l3Node1 = new TreeNode(7);
        TreeNode l3Node2 = new TreeNode(4);
        TreeNode l2Node1 = new TreeNode(6);
        TreeNode l2Node2 = new TreeNode(2, l3Node1, l3Node2);
        TreeNode l2Node3 = new TreeNode(0);
        TreeNode l2Node4 = new TreeNode(8);
        TreeNode l1Node1 = new TreeNode(5, l2Node1, l2Node2);
        TreeNode l1Node2 = new TreeNode(1, l2Node3, l2Node4);
        TreeNode root = new TreeNode(3, l1Node1, l1Node2);

        TreeNode res = new LowestCommonAncestor().lowestCommonAncestor(root, new TreeNode(5), new TreeNode(1));

        assertEquals(3, res.val);
    }

    @Test
    @DisplayName("lowest-common-ancestor-example-two")
    void lowestCommonAncestorExampleTwo() {
        TreeNode l3Node1 = new TreeNode(7);
        TreeNode l3Node2 = new TreeNode(4);
        TreeNode l2Node1 = new TreeNode(6);
        TreeNode l2Node2 = new TreeNode(2, l3Node1, l3Node2);
        TreeNode l2Node3 = new TreeNode(0);
        TreeNode l2Node4 = new TreeNode(8);
        TreeNode l1Node1 = new TreeNode(5, l2Node1, l2Node2);
        TreeNode l1Node2 = new TreeNode(1, l2Node3, l2Node4);
        TreeNode root = new TreeNode(3, l1Node1, l1Node2);

        TreeNode res = new LowestCommonAncestor().lowestCommonAncestor(root, new TreeNode(5), new TreeNode(4));

        assertEquals(5, res.val);
    }

}