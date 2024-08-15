package com.github.singals.algo.leetcode.seventyFive.bst;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteFromBstTest {

    private DeleteFromBst deleteFromBST;
    private TreeNode root;
    private TreeNode newTree;

    @BeforeEach
    void setUp() {
        deleteFromBST = new DeleteFromBst();
        TreeNode l3Node1 = new TreeNode(1);
        TreeNode l3Node2 = new TreeNode(5);
        TreeNode l3Node3 = new TreeNode(7);
        TreeNode l3Node4 = new TreeNode(13);
        TreeNode l2Node1 = new TreeNode(2, l3Node1, null);
        TreeNode l2Node2 = new TreeNode(6, l3Node2, l3Node3);
        TreeNode l2Node3 = new TreeNode(9);
        TreeNode l2Node4 = new TreeNode(11, null, l3Node4);
        TreeNode l1Node1 = new TreeNode(4, l2Node1, l2Node2);
        TreeNode l1Node2 = new TreeNode(10, l2Node3, l2Node4);
        root = new TreeNode(8, l1Node1, l1Node2);
    }

    @AfterEach
    void tearDown() {
        newTree = null;
    }

    @Test
    void testDeleteRootNode() {
        TreeNode newTree = deleteFromBST.deleteNode(root, 8);

        assertEquals(9, newTree.val);
        assertEquals(root.left, newTree.left);

        TreeNode rightChild = newTree.right;
        assertEquals(10, rightChild.val);

        assertNull(rightChild.left);
        assertEquals(11, rightChild.right.val);

        assertNull(rightChild.right.left);
        assertEquals(13, rightChild.right.right.val);
    }

    @Test
    void testDeleteNodeWhenNodeDoesNotExist() {
        TreeNode newTree = deleteFromBST.deleteNode(root, 27);
        assertEquals(root, newTree);
    }

    @Test
    void testDeleteNodeWhenNodeDoesIsLeaf() {
        TreeNode newTree = deleteFromBST.deleteNode(root, 5);

        assertEquals(root.right, newTree.right);
        assertEquals(root.left.val, newTree.left.val);
        assertEquals(root.left.left, newTree.left.left);

        assertEquals(root.left.right.val, newTree.left.right.val);
        assertEquals(root.left.right.right.val, newTree.left.right.right.val);
        assertNull(root.left.right.left);
    }

    @Test
    void testDeleteNodeWhenNodeOnlyHasLeftChild() {
        TreeNode newTree = deleteFromBST.deleteNode(root, 2);

        assertEquals(root.right, newTree.right);
        assertEquals(root.left.val, newTree.left.val);
        assertEquals(root.left.right, newTree.left.right);

        assertEquals(1, newTree.left.left.val);
    }

    @Test
    void testDeleteNodeWhenNodeOnlyHasRightChild() {
        TreeNode newTree = deleteFromBST.deleteNode(root, 11);

        assertEquals(root.left, newTree.left);
        assertEquals(root.right.val, newTree.right.val);
        assertEquals(root.right.left, newTree.right.left);

        assertEquals(13, newTree.right.right.val);
    }
}