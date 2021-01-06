package com.github.singals.problems;

import com.github.singals.ds.BinaryTree;
import com.github.singals.ds.LinkedList;
import com.github.singals.ds.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeToDoublyLinkedListTest {

    @Test
    void TestGtToDll_Test1() {
        /**
         *              15
         *          10         30
         *            12     25  36
         *  => 10-12-15-25-30-36
         */
        BinaryTree<Integer> bt = new BinaryTree<>();
        bt.add(15).add(10).add(12).add(30).add(25).add(36);
        LinkedList<Integer> dll = BinaryTreeToDoublyLinkedList.BtToDll(bt);
        assertNotNull(dll);
        Node<Integer> node = dll.getHead();
        assertNotNull(node);
        assertEquals(10, node.getData());
        assertEquals(12, node.getRightNode().getData());
        assertEquals(15, node.getRightNode().getRightNode().getData());
        assertEquals(25, node.getRightNode().getRightNode().getRightNode().getData());
        assertEquals(30, node.getRightNode().getRightNode().getRightNode().getRightNode().getData());
        assertEquals(36, node.getRightNode().getRightNode().getRightNode().getRightNode().getRightNode().getData());
    }

    @Test
    void TestGtToDll_Test2() {
        /**
         *              15
         *          10         30
         *        9   12     25
         *  => 9-10-12-15-25-30
         */
        BinaryTree<Integer> bt = new BinaryTree<>();
        bt.add(15).add(10).add(12).add(30).add(25).add(9);
        LinkedList<Integer> dll = BinaryTreeToDoublyLinkedList.BtToDll(bt);
        assertNotNull(dll);
        Node<Integer> node = dll.getHead();
        assertNotNull(node);
        assertEquals(9, node.getData());
        assertEquals(10, node.getRightNode().getData());
        assertEquals(12, node.getRightNode().getRightNode().getData());
        assertEquals(15, node.getRightNode().getRightNode().getRightNode().getData());
        assertEquals(25, node.getRightNode().getRightNode().getRightNode().getRightNode().getData());
        assertEquals(30, node.getRightNode().getRightNode().getRightNode().getRightNode().getRightNode().getData());
    }
}