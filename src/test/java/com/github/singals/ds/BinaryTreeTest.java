package com.github.singals.ds;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class BinaryTreeTest {

    @Test
    @DisplayName("elements added in ascending order")
    void TestTreeWhenElementsAreAddedInAscendingOrder() {
        BinaryTree<Integer> tree = new BinaryTree<>();
//        add elements 1,2,3,4
        IntStream.range(1,5).forEach(tree::add);

        assertEquals(4, tree.depth());

        Node<Integer> nodeToTest = tree.getRootNode();
        assertEquals(4, nodeToTest.depth());
        assertEquals(0, nodeToTest.getLevel());
        assertEquals(1, nodeToTest.getData());
        assertNull(nodeToTest.getLeftNode());
        assertNull(nodeToTest.getParentNode());

        nodeToTest = tree.getRootNode().getRightNode();
        assertEquals(3, nodeToTest.depth());
        assertEquals(1, nodeToTest.getLevel());
        assertEquals(2, nodeToTest.getData());
        assertNull(nodeToTest.getLeftNode());

        nodeToTest = tree.getRootNode().getRightNode().getRightNode();
        assertEquals(2, nodeToTest.depth());
        assertEquals(2, nodeToTest.getLevel());
        assertEquals(3, nodeToTest.getData());
        assertNull(nodeToTest.getLeftNode());

        nodeToTest = tree.getRootNode().getRightNode().getRightNode().getRightNode();
        assertEquals(1, nodeToTest.depth());
        assertEquals(3, nodeToTest.getLevel());
        assertEquals(4, nodeToTest.getData());
        assertNull(nodeToTest.getLeftNode());
        assertNull(nodeToTest.getRightNode());
    }

    @Test
    @DisplayName("elements added in descending order")
    void TestTreeWhenElementsAreAddedInDescendingOrder() {
        BinaryTree<Integer> tree = new BinaryTree<>();
        Arrays.asList(4,3,2,1).forEach(tree::add);

        assertEquals(4, tree.depth());

        Node<Integer> nodeToTest = tree.getRootNode();
        assertEquals(4, nodeToTest.depth());
        assertEquals(0, nodeToTest.getLevel());
        assertEquals(4, nodeToTest.getData());
        assertNull(nodeToTest.getRightNode());
        assertNull(nodeToTest.getParentNode());

        nodeToTest = tree.getRootNode().getLeftNode();
        assertEquals(3, nodeToTest.depth());
        assertEquals(1, nodeToTest.getLevel());
        assertEquals(3, nodeToTest.getData());
        assertNull(nodeToTest.getRightNode());

        nodeToTest = tree.getRootNode().getLeftNode().getLeftNode();
        assertEquals(2, nodeToTest.depth());
        assertEquals(2, nodeToTest.getLevel());
        assertEquals(2, nodeToTest.getData());
        assertNull(nodeToTest.getRightNode());

        nodeToTest = tree.getRootNode().getLeftNode().getLeftNode().getLeftNode();
        assertEquals(1, nodeToTest.depth());
        assertEquals(3, nodeToTest.getLevel());
        assertEquals(1, nodeToTest.getData());
        assertNull(nodeToTest.getRightNode());
        assertNull(nodeToTest.getLeftNode());
    }

    @Test
    void TestTreeWhenElementsAdded() {
        BinaryTree<Integer> tree = new BinaryTree<>();
        Arrays.asList(5,2,8,3,1,10,6).forEach(tree::add);

        assertEquals(3, tree.depth());

        Node<Integer> rootNode = tree.getRootNode();
        assertEquals(5, rootNode.getData());
        assertEquals(2, rootNode.getLeftNode().getData());
        assertEquals(8, rootNode.getRightNode().getData());
        assertEquals(3, rootNode.getLeftNode().getRightNode().getData());
        assertEquals(1, rootNode.getLeftNode().getLeftNode().getData());
        assertEquals(10, rootNode.getRightNode().getRightNode().getData());
        assertEquals(6, rootNode.getRightNode().getLeftNode().getData());
    }
}