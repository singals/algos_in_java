package com.github.singals.ds;

import lombok.Getter;

public class BinaryTree<E> {
    @Getter
    private Node<E> rootNode;

    public BinaryTree<E> add(E element) {
        if (rootNode == null) {
            rootNode = new Node<>(element, null);
        } else {
            rootNode.add(element);
        }
        return this;
    }

    public int depth() {
        if (this.rootNode == null) {
            return 0;
        }
        return this.rootNode.depth();
    }
}

