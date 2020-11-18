package com.github.singals.algo;

import java.util.HashMap;
import java.util.Map;

public class CoinProblem {
    /**
     * Assumption: the coins are available in abundance.
     *
     * @param coinValues list of coin denomination in descending order
     * @param amount     the amount for which combination is to be calculated
     * @return
     */
    public static Map<Integer, Integer> getLeastCoinCombination(int[] coinValues, Integer amount) {
        int change = amount;
        Map<Integer, Integer> coinCombination = new HashMap<>();
        for (int i = 0; i < coinValues.length; i++) {
            int coinValue = coinValues[i];
            if (coinValue > change) continue;

            int remChange = change % coinValue;
            coinCombination.put(coinValue, change / coinValue);
            change = remChange;

            if (remChange == 0) break;
        }
        if (change == 0) return coinCombination;
        return null;
    }
}
