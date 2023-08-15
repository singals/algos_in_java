package com.github.singals.algo.leetcode.seventyFive;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountGoodNodesTest {

    @Test
    @DisplayName("count-good-nodes-example-one")
    void countGoodNodesExampleOne() {
        TreeNode l2Node1 = new TreeNode(3);
        TreeNode l2Node2 = new TreeNode(1);
        TreeNode l2Node3 = new TreeNode(5);
        TreeNode l1Node1 = new TreeNode(1, l2Node1, null);
        TreeNode l1Node2 = new TreeNode(4, l2Node2, l2Node3);
        TreeNode root = new TreeNode(3, l1Node1, l1Node2);

        int res = new CountGoodNodes().goodNodes(root);

        assertEquals(4, res);
    }

    @Test
    @DisplayName("count-good-nodes-example-two")
    void countGoodNodesExampleTwo() {
        TreeNode l2Node1 = new TreeNode(4);
        TreeNode l2Node2 = new TreeNode(2);
        TreeNode l1Node1 = new TreeNode(3, l2Node1, l2Node2);
        TreeNode root = new TreeNode(3, l1Node1, null);

        int res = new CountGoodNodes().goodNodes(root);

        assertEquals(3, res);
    }

    @Test
    @DisplayName("count-good-nodes-example-three")
    void countGoodNodesExampleThree() {
        TreeNode root = new TreeNode(1, null, null);

        int res = new CountGoodNodes().goodNodes(root);

        assertEquals(1, res);
    }
}