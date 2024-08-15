package com.github.singals.algo.leetcode.seventyFive.bt_bfs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumLevelSumTest {

    @Test
    @DisplayName("max-level-sum-example-one")
    void maxLevelSumExampleOne() {
        TreeNode l2Node1 = new TreeNode(7);
        TreeNode l2Node2 = new TreeNode(-8);
        TreeNode l1Node1 = new TreeNode(7, l2Node1, l2Node2);
        TreeNode l1Node2 = new TreeNode(0);
        TreeNode root = new TreeNode(1, l1Node1, l1Node2);

        int res = new MaximumLevelSum().maxLevelSum(root);
        assertEquals(2, res);
    }

    @Test
    @DisplayName("max-level-sum-example-two")
    void maxLevelSumExampleTwo() {
        TreeNode l3Node1 = new TreeNode(-32127);
        TreeNode l2Node1 = new TreeNode(98693);
        TreeNode l2Node2 = new TreeNode(-89388, null, l3Node1);
        TreeNode l1Node1 = new TreeNode(10250, l2Node1, l2Node2);
        TreeNode root = new TreeNode(989, null, l1Node1);

        int res = new MaximumLevelSum().maxLevelSum(root);
        assertEquals(2, res);
    }

    @Test
    @DisplayName("max-level-sum-example-three")
    void maxLevelSumExampleThree() {
        TreeNode l2Node1 = new TreeNode(-20);
        TreeNode l2Node2 = new TreeNode(-5);
        TreeNode l2Node3 = new TreeNode(-10);
        TreeNode l1Node1 = new TreeNode(-200, l2Node1, l2Node2);
        TreeNode l1Node2 = new TreeNode(-300, l2Node3, null);
        TreeNode root = new TreeNode(-100, l1Node1, l1Node2);

        int res = new MaximumLevelSum().maxLevelSum(root);
        assertEquals(3, res);
    }
}