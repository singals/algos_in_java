package com.github.singals.algo.leetcode.seventyFive.bst;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInBSTTest {

    @Test
    @DisplayName("search-bst-example-one")
    void searchBstExampleOne() {
        TreeNode l2Node1 = new TreeNode(1);
        TreeNode l2Node2 = new TreeNode(3);
        TreeNode l1Node1 = new TreeNode(2, l2Node1, l2Node2);
        TreeNode l1Node2 = new TreeNode(7);
        TreeNode root = new TreeNode(4, l1Node1, l1Node2);

        TreeNode res = new SearchInBST().searchBST(root, 2);
        assertEquals(l1Node1, res);
    }

    @Test
    @DisplayName("search-bst-example-two")
    void searchBstExampleTwo() {
        TreeNode l2Node1 = new TreeNode(1);
        TreeNode l2Node2 = new TreeNode(3);
        TreeNode l1Node1 = new TreeNode(2, l2Node1, l2Node2);
        TreeNode l1Node2 = new TreeNode(7);
        TreeNode root = new TreeNode(4, l1Node1, l1Node2);

        TreeNode res = new SearchInBST().searchBST(root, 5);
        assertNull(res);
    }

}