package com.github.singals.algo.leetcode.seventyFive;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumTwinSumTest {
    @Test
    @DisplayName("max-pair-sum-example-one")
    void maxPairSumExampleOne() {
        ListNode node3 = new ListNode(1);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(4, node2);
        ListNode head = new ListNode(5, node1);

        int res = MaximumTwinSum.pairSum(head);

        assertEquals(6, res);
    }

    @Test
    @DisplayName("max-pair-sum-example-two")
    void maxPairSumExampleTwo() {
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(2, node2);
        ListNode head = new ListNode(4, node1);

        int res = MaximumTwinSum.pairSum(head);

        assertEquals(7, res);
    }

    @Test
    @DisplayName("max-pair-sum-example-three")
    void maxPairSumExampleThree() {
        ListNode node1 = new ListNode(100_000);
        ListNode head = new ListNode(1, node1);

        int res = MaximumTwinSum.pairSum(head);

        assertEquals(100_001, res);
    }
}