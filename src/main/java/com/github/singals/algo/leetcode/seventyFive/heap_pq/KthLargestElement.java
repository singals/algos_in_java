package com.github.singals.algo.leetcode.seventyFive.heap_pq;

import java.util.PriorityQueue;

/**
 * Given an integer array nums and an integer k, return the kth largest element in the array.
 * <p>
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * <p>
 * Can you solve it without sorting?
 */
public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num : nums) queue.add(num);
        int mid = queue.size() - k;
        for (int i = 0; i < mid; i++) {
            queue.poll();
        }
        return queue.poll();
    }

}
