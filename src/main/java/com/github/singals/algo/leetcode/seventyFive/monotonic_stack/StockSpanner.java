package com.github.singals.algo.leetcode.seventyFive.monotonic_stack;

import java.util.Iterator;
import java.util.LinkedList;

//https://leetcode.com/problems/online-stock-span/description/
public class StockSpanner {

    private final LinkedList<Integer> stockStack;

    public StockSpanner() {
        stockStack = new LinkedList<>();
    }

    public int next(int price) {
        int ans = 1;
        if (stockStack.isEmpty()) {
            stockStack.add(price);
            return ans;
        } else {
            Iterator<Integer> stockIterator = stockStack.descendingIterator();
            while (stockIterator.hasNext()) {
                Integer stock = stockIterator.next();
                if (stock <= price) ans++;
                else break;
            }
            stockStack.add(price);
        }
        return ans;
    }
}
