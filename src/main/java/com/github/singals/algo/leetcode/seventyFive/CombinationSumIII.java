package com.github.singals.algo.leetcode.seventyFive;

import java.util.*;

//https://leetcode.com/problems/combination-sum-iii/description/
public class CombinationSumIII {

    private final int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

    public List<List<Integer>> combinationSum3(int k, int n) {
        int maxSum = 45;
        if (n > maxSum) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        int minSum = getMinSum(k);
        if (n < minSum) return new ArrayList<>();
        else if (n == minSum || n == maxSum) {
            res.add(getNIntegersAsList(k));
        } else {
            //multiple combinations possible
            findCombinations(0, k, n, new ArrayList<>(), res);
        }
        return res;
    }

    private void findCombinations(int i, int k, int tar, List<Integer> l1, List<List<Integer>> res) {
        if (l1.size() == k && tar == 0) {
            res.add(new ArrayList<>(l1));
            return;
        }
        if (i >= nums.length) return;
        if (nums[i] > tar) return;
        if (l1.size() > k) return;

        l1.add(nums[i]);

        findCombinations(i+1, k, tar-nums[i], l1, res);

        l1.remove(l1.size()-1);
        findCombinations(i+1, k, tar, l1, res);
    }

    private List<Integer> getNIntegersAsList(int k) {
        List<Integer> onlyRes = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            onlyRes.add(i + 1);
        }
        return onlyRes;
    }

    private int getMinSum(int n) {
        return ((n * (n + 1)) / 2);
    }
}
