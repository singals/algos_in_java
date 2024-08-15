package com.github.singals.algo.leetcode.seventyFive.linked_list;

/**
 * Given the head of a singly linked list, group all the nodes with odd indices
 * together followed by the nodes with even indices, and return the reordered list.
 * <p>
 * The first node is considered odd, and the second node is even, and so on.
 * <p>
 * Note that the relative order inside both the even and odd groups should remain
 * as it was in the input.
 * <p>
 * You must solve the problem in O(1) extra space complexity and O(n) time complexity.
 */
public class OddEvenLinkedList {

    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode res = new ListNode();
        ListNode resPtr = res;
        ListNode ptr = head;
        //add odd nodes first
        while (ptr != null) {
            if (ptr.next == null) {
                resPtr.next = new ListNode(ptr.val, null);
                ptr = null;
            } else {
                resPtr.next = new ListNode(ptr.val, ptr.next.next);
                ptr = ptr.next.next;
            }
            resPtr = resPtr.next;
        }
        ptr = head.next;
        while (ptr != null) {
            if (ptr.next == null) {
                resPtr.next = new ListNode(ptr.val, null);
                ptr = null;
            } else {
                resPtr.next = new ListNode(ptr.val, ptr.next.next);
                ptr = ptr.next.next;
            }
            resPtr = resPtr.next;
        }
        return res.next;
    }
}
