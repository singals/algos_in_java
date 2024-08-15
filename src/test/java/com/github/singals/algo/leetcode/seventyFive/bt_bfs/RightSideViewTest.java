package com.github.singals.algo.leetcode.seventyFive.bt_bfs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RightSideViewTest {
    @Test
    @DisplayName("right-side-view-example-one")
    void rightSideViewExampleOne() {
        TreeNode l2Node1 = new TreeNode(5);
        TreeNode l2Node2 = new TreeNode(4);
        TreeNode l1Node1 = new TreeNode(2, null, l2Node1);
        TreeNode l1Node2 = new TreeNode(3, null, l2Node2);
        TreeNode root = new TreeNode(1, l1Node1, l1Node2);

        List<Integer> res = new RightSideView().rightSideView(root);
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 3, 4));
        assertTrue(expected.equals(res));
    }

    @Test
    @DisplayName("right-side-view-example-two")
    void rightSideViewExampleTwo() {
        TreeNode l1Node1 = new TreeNode(3);
        TreeNode root = new TreeNode(1, null, l1Node1);

        List<Integer> res = new RightSideView().rightSideView(root);
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 3));
        assertTrue(expected.equals(res));
    }

    @Test
    @DisplayName("right-side-view-example-three")
    void rightSideViewExampleThree() {
        List<Integer> res = new RightSideView().rightSideView(null);
        assertTrue(res.isEmpty());
    }

    @Test
    @DisplayName("right-side-view-example-four")
    void rightSideViewExampleFour() {
        TreeNode l1Node1 = new TreeNode(2);
        TreeNode root = new TreeNode(1, l1Node1, null);

        List<Integer> res = new RightSideView().rightSideView(root);
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2));
        assertTrue(expected.equals(res));
    }

    @Test
    @DisplayName("right-side-view-example-five")
    void rightSideViewExampleFive() {
        TreeNode l4Node1 = new TreeNode(8);
        TreeNode l3Node1 = new TreeNode(6);
        TreeNode l3Node2 = new TreeNode(7, l4Node1, null);
        TreeNode l2Node1 = new TreeNode(5, l3Node1, l3Node2);
        TreeNode l2Node2 = new TreeNode(4);
        TreeNode l1Node1 = new TreeNode(2, l2Node1, null);
        TreeNode l1Node2 = new TreeNode(3, l2Node2, null);
        TreeNode root = new TreeNode(1, l1Node1, l1Node2);

        List<Integer> res = new RightSideView().rightSideView(root);
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 3, 4, 7, 8));
        assertTrue(expected.equals(res));
    }
}