package com.github.singals.algo.leetcode.seventyFive.linked_list;

/**
 * You are given the head of a linked list. Delete the middle node, and return the
 * head of the modified linked list.
 *
 * The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start
 * using 0-based indexing, where ⌊x⌋ denotes the largest integer less than or equal
 * to x.
 *
 *     For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively.
 */
public class DeleteFromLinkedList {
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) return null;
        ListNode ptr = head;
        int n = 1;
        while (ptr.next != null) {
            ptr = ptr.next;
            n++;
        }
        int mid = n / 2;
        n = 1;
        ptr = head;
        while (n < mid) {
            ptr = ptr.next;
            n++;
        }

        if (ptr.next != null) ptr.next = ptr.next.next;
        return head;
    }
}

