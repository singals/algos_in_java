package com.github.singals.algo.leetcode.seventyFive;

/**
 * Given a binary array nums, you should delete one element from it.
 * <p>
 * Return the size of the longest non-empty subarray containing only 1's in the resulting array.
 * Return 0 if there is no such subarray.
 */
public class LongestSubArrayAfterDeletingOneElement {
    public static int longestSubarray(int[] nums) {
        if (nums.length < 2) return 0;

        int left = 0, right = 0, currLength = 0, maxLength = 0;
        boolean isSkippingAllowed = true;
        while (right < nums.length) {
            if (nums[right] == 0) {
                if (isSkippingAllowed) {
                    isSkippingAllowed = false;
                    currLength++;
                    maxLength = Math.max(currLength, maxLength);
                    right++;
                } else {
                    if (nums[left] == 0) isSkippingAllowed = true;
                    left++;
                    currLength--;
                }
            } else {
                currLength++;
                maxLength = Math.max(currLength, maxLength);
                right++;
            }
        }
        return maxLength - 1;
    }
}
