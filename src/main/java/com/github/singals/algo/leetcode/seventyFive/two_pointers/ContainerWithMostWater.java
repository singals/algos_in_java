package com.github.singals.algo.leetcode.seventyFive.two_pointers;

/**
 * You are given an integer array height of length n. There are n vertical
 * lines drawn such that the two endpoints of the ith line are (i, 0) and
 * (i, height[i]).
 *
 * Find two lines that together with the x-axis form a container, such that
 * the container contains the most water.
 *
 * Return the maximum amount of water a container can store.
 *
 * Notice that you may not slant the container.
 */
public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxArea = -1, left = 0, right = height.length - 1;
        while (left < right) {
            int leftHeight = height[left];
            int rightHeight = height[right];
            int currArea = Math.min(leftHeight, rightHeight) * (right - left);
            if (currArea > maxArea) maxArea = currArea;

            if (leftHeight > rightHeight) right--;
            else left++;
        }
        return maxArea;
    }
}
