package com.github.singals.ds;

import lombok.Getter;

public class BinaryTree<E> {
    @Getter
    private Node<E> rootNode;

    public void add(E element){
        if (rootNode == null){
            rootNode = new Node<>(element, null);
        } else {
            rootNode.add(element);
        }
    }

    public int depth () {
        if (this.rootNode == null){
            return 0;
        }
        return this.rootNode.depth();
    }
}

@Getter
class Node<E> {
    private E data;
    private Node<E> parentNode;
    private Node<E> leftNode;
    private Node<E> rightNode;
    private int level;  

    public Node(E data, Node<E> parentNode) {
        this.data = data;
        this.parentNode = parentNode;
        if (parentNode == null){
            this.level = 0;
        }else {
            this.level = this.parentNode.level + 1;
        }
    }

    public boolean isRootNode(){
        return this.level == 0;
    }

    public void add(E element) {
        int comparison = ((Comparable<? super E>) this.data).compareTo(element);
//        if (comparison == 0) {
//            System.out.println("adding an already present node");
//            return;
//        }
        if (comparison < 0){
            //add to right sub-tree
            if (this.rightNode == null){
                // add directly as child
                this.rightNode = new Node<>(element, this);
            } else{
                this.rightNode.add(element);
            }
        } else {
            //add to left sub-tree
            if (this.leftNode == null){
                // add directly as child
                this.leftNode = new Node<>(element, this);
            } else{
                this.leftNode.add(element);
            }
        }
    }

    public int depth() {
        int leftNodeDepth = 0, rightNodeDepth = 0;
        if (this.leftNode != null){
            leftNodeDepth = this.leftNode.depth();
        }
        if (this.rightNode != null){
            rightNodeDepth = this.rightNode.depth();
        }
        return leftNodeDepth > rightNodeDepth? leftNodeDepth +1: rightNodeDepth+1;
    }
}
