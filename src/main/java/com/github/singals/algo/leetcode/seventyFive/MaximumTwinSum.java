package com.github.singals.algo.leetcode.seventyFive;

public class MaximumTwinSum {
    public static int pairSum(ListNode head) {
        if (head.next.next == null) return head.val + head.next.val;
        ListNode ptr = head;
        //find size
        int size = 0;
        while (ptr != null) {
            size++;
            ptr = ptr.next;
        }

        //convert to array
        int[] arr = new int[size];
        ptr = head;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ptr.val;
            ptr = ptr.next;
        }

        //calculate twin-sum
        int right = size - 1;
        int max = -1;
        for (int left = 0; left < right; left++) {
            int temp = arr[left] + arr[right];
            max = Math.max(max, temp);
            right--;
        }
        return max;
    }
}
