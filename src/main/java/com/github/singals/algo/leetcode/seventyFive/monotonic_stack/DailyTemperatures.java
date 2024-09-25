package com.github.singals.algo.leetcode.seventyFive.monotonic_stack;


import java.util.Stack;

//https://leetcode.com/problems/daily-temperatures/description/
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer[]> tempStack = new Stack<>();
        int maxTemp = Integer.MIN_VALUE;
        int[] ans = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            int temperature = temperatures[i];
            if (temperature > maxTemp) {
                // warmer day
                maxTemp = temperature;

                while (!tempStack.isEmpty() && tempStack.peek()[0] < temperature) {
                    Integer[] oldTemp = tempStack.pop();
                    ans[oldTemp[1]] = i - oldTemp[1];
                }
            } else maxTemp = temperature;
            tempStack.push(new Integer[]{temperature, i});
        }
        return ans;
    }
}
