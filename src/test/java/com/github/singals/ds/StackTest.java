package com.github.singals.ds;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StackTest {

    @Test
    @DisplayName("overflow-safety")
    public void TestStackOverflow() {
        Stack<Integer> stack = new Stack(2);
        IntStream.range(0, 10).forEach(stack::push);

        assertEquals(2, stack.pop());
    }

    @Test
    @DisplayName("stack-data-retrieval")
    public void TestStackDataRetrieval() {
        Stack<Integer> stack = new Stack(5);
        IntStream.range(0, 5).forEach(stack::push);

        for (int i=4; i>=0; i--){
         assertEquals(i, stack.pop());
        }
    }
}