package com.github.singals.algo.leetcode.seventyFive.linked_list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteFromLinkedListTest {
    @Test
    @DisplayName("delete-middle-example-one")
    void deleteMiddleExampleOne() {
        ListNode node7 = new ListNode(6);
        ListNode node6 = new ListNode(2, node7);
        ListNode node5 = new ListNode(1, node6);
        ListNode node4 = new ListNode(7, node5);
        ListNode node3 = new ListNode(4, node4);
        ListNode node2 = new ListNode(3, node3);
        ListNode node1 = new ListNode(1, node2);

        DeleteFromLinkedList objUnderTest = new DeleteFromLinkedList();
        ListNode res = objUnderTest.deleteMiddle(node1);

        assertEquals(1, res.val);
        res = res.next;
        assertEquals(3, res.val);
        res = res.next;
        assertEquals(4, res.val);
        res = res.next;
        assertEquals(1, res.val);
        res = res.next;
        assertEquals(2, res.val);
        res = res.next;
        assertEquals(6, res.val);
        assertNull(res.next);
    }

    @Test
    @DisplayName("delete-middle-example-two")
    void deleteMiddleExampleTwo() {
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        DeleteFromLinkedList objUnderTest = new DeleteFromLinkedList();
        ListNode res = objUnderTest.deleteMiddle(node1);

        assertEquals(1, res.val);
        res = res.next;
        assertEquals(2, res.val);
        res = res.next;
        assertEquals(4, res.val);
        assertNull(res.next);
    }

    @Test
    @DisplayName("delete-middle-example-three")
    void deleteMiddleExampleThree() {
        ListNode node2 = new ListNode(1);
        ListNode node1 = new ListNode(2, node2);

        DeleteFromLinkedList objUnderTest = new DeleteFromLinkedList();
        ListNode res = objUnderTest.deleteMiddle(node1);

        assertEquals(2, res.val);
        assertNull(res.next);
    }
}