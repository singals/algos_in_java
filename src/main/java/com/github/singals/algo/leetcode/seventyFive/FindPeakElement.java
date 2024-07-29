package com.github.singals.algo.leetcode.seventyFive;

// https://leetcode.com/problems/find-peak-element/description/
public class FindPeakElement {

    public int findPeakElement(int[] nums) {
        if (nums.length == 1) return 0;
        else if (nums.length == 2) {
            if (nums[0] >= nums[1]) return 0;
            else return 1;
        }
        int mid = nums.length / 2;
        int left = 0;
        int right = nums.length - 1;
        //1,3,2,4
        while (left < right) {
            if (right - left == 1) {
                mid = nums[left] > nums[right] ? left : right;
                break;
            } else if ((right - left) == 2) {
                int candidate = nums[left] > nums[right] ? left : right;
                mid = nums[candidate] > nums[mid] ? candidate : mid;
                break;
            } else {
                if (nums[mid - 1] > nums[mid]) {
                    //traverse left
                    right = mid;
                } else {
                    //traverse right
                    left = mid;
                }
                mid = (left + right) / 2;
            }
        }
        return mid;
    }

}
