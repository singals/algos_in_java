package com.github.singals.algo.leetcode.seventyFive;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathSum3Test {
    @Test
    @DisplayName("check-path-sum-example-one")
    void checkPathSumExampleOne() {
        TreeNode l3Node1 = new TreeNode(3);
        TreeNode l3Node2 = new TreeNode(-2);
        TreeNode l3Node3 = new TreeNode(1);
        TreeNode l2Node1 = new TreeNode(3, l3Node1, l3Node2);
        TreeNode l2Node2 = new TreeNode(2, null, l3Node3);
        TreeNode l2Node3 = new TreeNode(11);
        TreeNode l1Node1 = new TreeNode(5, l2Node1, l2Node2);
        TreeNode l1Node2 = new TreeNode(-3, null, l2Node3);
        TreeNode root = new TreeNode(10, l1Node1, l1Node2);

        int res = new PathSum3().pathSum(root, 8);

        assertEquals(3, res);
    }

    @Test
    @DisplayName("check-path-sum-example-two")
    void checkPathSumExampleTwo() {
        TreeNode l3Node1 = new TreeNode(7);
        TreeNode l3Node2 = new TreeNode(2);
        TreeNode l3Node3 = new TreeNode(5);
        TreeNode l3Node4 = new TreeNode(1);
        TreeNode l2Node1 = new TreeNode(11, l3Node1, l3Node2);
        TreeNode l2Node2 = new TreeNode(13);
        TreeNode l2Node3 = new TreeNode(4, l3Node3, l3Node4);
        TreeNode l1Node1 = new TreeNode(4, l2Node1, null);
        TreeNode l1Node2 = new TreeNode(8, l2Node2, l2Node3);
        TreeNode root = new TreeNode(5, l1Node1, l1Node2);

        int res = new PathSum3().pathSum(root, 22);

        assertEquals(3, res);
    }

    @Test
    @DisplayName("check-path-sum-example-three")
    void checkPathSumExampleThree() {
        TreeNode root = new TreeNode(1);

        int res = new PathSum3().pathSum(root, 0);

        assertEquals(0, res);
    }

    @Test
    @DisplayName("check-path-sum-example-four")
    void checkPathSumExampleFour() {
        TreeNode l1node1 = new TreeNode(2);
        TreeNode root = new TreeNode(1, l1node1, null);

        int res = new PathSum3().pathSum(root, 0);

        assertEquals(0, res);
    }

    @Test
    @DisplayName("check-path-sum-example-five")
    void checkPathSumExampleFive() {
        TreeNode l5node1 = new TreeNode(1000000000);
        TreeNode l4node1 = new TreeNode(1000000000, l5node1, null);
        TreeNode l3node1 = new TreeNode(1000000000, l4node1, null);
        TreeNode l2node1 = new TreeNode(294967296, l3node1, null);
        TreeNode l1node1 = new TreeNode(1000000000, l2node1, null);
        TreeNode root = new TreeNode(1000000000, l1node1, null);

        int res = new PathSum3().pathSum(root, 0);

        assertEquals(0, res);
    }
}