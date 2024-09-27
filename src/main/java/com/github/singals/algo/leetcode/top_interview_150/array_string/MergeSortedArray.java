package com.github.singals.algo.leetcode.top_interview_150.array_string;

//https://leetcode.com/problems/merge-sorted-array/description/
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr1 = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = nums1[i];
            nums1[i] = 0;
        }

        int left = 0, right = 0, i = 0;
        while (left < m || right < n) {
            int leftNum = (left == m) ? Integer.MAX_VALUE : arr1[left];
            int rightNum = (right == n) ? Integer.MAX_VALUE : nums2[right];
            if (leftNum <= rightNum) {
                nums1[i] = leftNum;
                left++;
            } else {
                nums1[i] = rightNum;
                right++;
            }
            i++;
        }
    }
}
