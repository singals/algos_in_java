package com.github.singals.problems;

import com.github.singals.ds.BinaryTree;
import com.github.singals.ds.LinkedList;
import com.github.singals.ds.Node;

/**
 * Convert a given Binary Tree to Doubly Linked List
 * <p>
 * Given a Binary Tree (BT), convert it to a Doubly Linked List(DLL) In-Place.
 * The left and right pointers in nodes are to be used as previous and next
 * pointers respectively in converted DLL. The order of nodes in DLL must be
 * same as Inorder of the given Binary Tree. The first node of Inorder
 * traversal (left most node in BT) must be head node of the DLL.
 * <p>
 * 10
 * 12         15
 * 25  30     36
 * => 25-12-30-10-36-15
 */
public class BinaryTreeToDoublyLinkedList {
    public static LinkedList<Integer> BtToDll(BinaryTree<Integer> binaryTree) {
        LinkedList<Integer> dll = new LinkedList<Integer>();
        Node<Integer> rootNode = binaryTree.getRootNode();
        traverseInOrder(rootNode, dll);
        return dll;
    }

    private static void traverseInOrder(Node<Integer> node, LinkedList<Integer> dll) {
        if (node == null) return;

        traverseInOrder(node.getLeftNode(), dll);
        dll.add(new Node<Integer>(node.getData(), null));
        traverseInOrder(node.getRightNode(), dll);
    }

    public static void main(String[] args) {
        /**
         *              15
         *          10         30
         *            12     25  36
         *  => 10-12-15-25-30-36
         */
        BinaryTree<Integer> bt = new BinaryTree<>();
        bt.add(15);
        bt.add(10);
        bt.add(12);
        bt.add(30);
        bt.add(25);
        bt.add(36);
        LinkedList<Integer> dll = BtToDll(bt);
        System.out.println(dll.toString());
    }
}
