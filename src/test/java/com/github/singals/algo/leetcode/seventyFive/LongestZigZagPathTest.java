package com.github.singals.algo.leetcode.seventyFive;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestZigZagPathTest {
    @Test
    @DisplayName("longest-zig-zag-path-example-one")
    void longestZigZagExampleOne() {
        TreeNode l5Node1 = new TreeNode(1);
        TreeNode l4Node1 = new TreeNode(1, null, l5Node1);
        TreeNode l3Node1 = new TreeNode(1, null, l4Node1);
        TreeNode l3Node2 = new TreeNode(1);
        TreeNode l2Node1 = new TreeNode(1);
        TreeNode l2Node2 = new TreeNode(1, l3Node1, l3Node2);
        TreeNode l1Node1 = new TreeNode(1, l2Node1, l2Node2);
        TreeNode root = new TreeNode(1, null, l1Node1);

        int res = new LongestZigZagPath().longestZigZag(root);

        assertEquals(3, res);
    }

    @Test
    @DisplayName("longest-zig-zag-path-example-two")
    void longestZigZagExampleTwo() {
        TreeNode l4Node1 = new TreeNode(1);
        TreeNode l3Node1 = new TreeNode(1, null, l4Node1);
        TreeNode l3Node2 = new TreeNode(1);
        TreeNode l2Node1 = new TreeNode(1, l3Node1, l3Node2);
        TreeNode l1Node1 = new TreeNode(1, null, l2Node1);
        TreeNode l1Node2 = new TreeNode(1);
        TreeNode root = new TreeNode(1, l1Node1, l1Node2);

        int res = new LongestZigZagPath().longestZigZag(root);

        assertEquals(4, res);
    }

    @Test
    @DisplayName("longest-zig-zag-path-example-three")
    void longestZigZagExampleThree() {
        TreeNode root = new TreeNode(1);

        int res = new LongestZigZagPath().longestZigZag(root);

        assertEquals(0, res);
    }

}