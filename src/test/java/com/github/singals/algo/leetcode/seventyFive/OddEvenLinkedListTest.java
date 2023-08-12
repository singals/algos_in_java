package com.github.singals.algo.leetcode.seventyFive;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenLinkedListTest {
    @Test
    @DisplayName("odd-even-list-example-one")
    void oddEvenListExampleOne() {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode res = OddEvenLinkedList.oddEvenList(node1);
        assertEquals(1, res.val);
        res = res.next;
        assertEquals(3, res.val);
        res = res.next;
        assertEquals(5, res.val);
        res = res.next;
        assertEquals(2, res.val);
        res = res.next;
        assertEquals(4, res.val);
        assertNull(res.next);
    }

    @Test
    @DisplayName("odd-even-list-example-two")
    void oddEvenListExampleTwo() {
        ListNode node7 = new ListNode(7);
        ListNode node6 = new ListNode(4, node7);
        ListNode node5 = new ListNode(6, node6);
        ListNode node4 = new ListNode(5, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(1, node3);
        ListNode node1 = new ListNode(2, node2);

        ListNode res = OddEvenLinkedList.oddEvenList(node1);
        assertEquals(2, res.val);
        res = res.next;
        assertEquals(3, res.val);
        res = res.next;
        assertEquals(6, res.val);
        res = res.next;
        assertEquals(7, res.val);
        res = res.next;
        assertEquals(1, res.val);
        res = res.next;
        assertEquals(5, res.val);
        res = res.next;
        assertEquals(4, res.val);
        assertNull(res.next);
    }
}