package com.github.singals.ds;

public class Stack<E> {

    private Object[] data;
    private int head;

    public Stack(int size){
        this.data = new Object[size];
        this.head = 0;
    }

    public void push(E element){
        if (isCapacityAvailable(this.head + 1)){
            System.out.println("Pushing to stack");
            this.data[this.head++] = element;
        } else{
            System.out.println("Stack full");
        }
    }

    public E pop(){
        if (this.head != 0){
            System.out.println("Popping from stack");
            E element = (E) this.data[--this.head];
            return element;
        }
        System.out.println("Empty stack, can't pop");
        return null;
    }

    private boolean isCapacityAvailable(int capacity) {
        return this.data.length >= capacity;
    }
}
