package com.github.singals.algo.leetcode.seventyFive;

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
