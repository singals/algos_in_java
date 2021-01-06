package com.github.singals.ds;

import lombok.Getter;

@Getter
public class LinkedList<E> {
    private Node<E> head;

    public void add(Node<E> node) {
        if (this.head == null) {
            this.head = node;
            return;
        }

        Node currentNode = this.head;
        while (currentNode.getRightNode() != null) {
            currentNode = currentNode.getRightNode();
        }
        currentNode.setRightNode(node);
        node.setLeftNode(currentNode);
    }
}