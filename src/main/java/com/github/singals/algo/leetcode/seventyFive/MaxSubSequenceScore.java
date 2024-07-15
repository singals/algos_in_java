package com.github.singals.algo.leetcode.seventyFive;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/maximum-subsequence-score/description/
 */
public class MaxSubSequenceScore {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int length = nums1.length;
        Long res = null;
        if (k == 1) {
            for (int i = 0; i < length; i++) {
                long temp = (long) nums1[i] * nums2[i];
                if (res == null) res = temp;
                else res = Long.max(res, temp);
            }
            return res;
        }

        int[][] compactedArray = new int[length][];

        for (int i = 0; i < length; i++) {
            compactedArray[i] = new int[]{nums1[i], nums2[i]};
        }

        Arrays.sort(compactedArray, Comparator.comparingInt(a -> -a[1]));

        Long sum = null;
        PriorityQueue<Integer> pq = new PriorityQueue<>(length);
        for (int i = k-1; i < length; i++) {
            long minNum2 = compactedArray[i][1];
            if (sum == null) {
                sum = 0L;
                for (int j = 0; j <= i; j++) {
                    int tempNum = compactedArray[j][0];
                    sum += tempNum;
                    pq.add(tempNum);
                }
            } else {
                if (compactedArray[i][0] > pq.peek()) {
                    int temp = pq.poll();
                    pq.add(compactedArray[i][0]);
                    sum = sum + compactedArray[i][0] - temp;
                }
            }
            long tempRes = sum * minNum2;
            if (res == null) res = tempRes;
            else res = Math.max(res, tempRes);
        }
        return res;
    }
}
