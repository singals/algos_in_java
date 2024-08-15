package com.github.singals.algo.leetcode.seventyFive.linked_list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {
    @Test
    @DisplayName("reverse-list-example-one")
    void reverseListExampleOne() {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode res = ReverseLinkedList.reverseList(node1);
        assertEquals(5, res.val);
        res = res.next;
        assertEquals(4, res.val);
        res = res.next;
        assertEquals(3, res.val);
        res = res.next;
        assertEquals(2, res.val);
        res = res.next;
        assertEquals(1, res.val);
        assertNull(res.next);
    }

    @Test
    @DisplayName("reverse-list-example-two")
    void reverseListExampleTwo() {
        ListNode node2 = new ListNode(2);
        ListNode node1 = new ListNode(1, node2);

        ListNode res = ReverseLinkedList.reverseList(node1);
        assertEquals(2, res.val);
        res = res.next;
        assertEquals(1, res.val);
        assertNull(res.next);
    }

    @Test
    @DisplayName("reverse-list-example-three")
    void reverseListExampleThree() {
        ListNode res = ReverseLinkedList.reverseList(null);
        assertNull(res);
    }

    @Test
    @DisplayName("reverse-list-when-there-is-just-one-node")
    void reverseListWhenThereIsJustOneNode() {
        ListNode node = new ListNode(2);

        ListNode res = ReverseLinkedList.reverseList(node);

        assertEquals(2, res.val);
        assertNull(res.next);
    }
}