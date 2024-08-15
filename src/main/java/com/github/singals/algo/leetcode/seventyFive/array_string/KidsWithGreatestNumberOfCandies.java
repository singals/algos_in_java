package com.github.singals.algo.leetcode.seventyFive.array_string;

import java.util.ArrayList;
import java.util.List;

/**
 * There are n kids with candies. You are given an integer array candies,
 * where each candies[i] represents the number of candies the ith kid has,
 * and an integer extraCandies, denoting the number of extra candies that you have.
 * <p>
 * Return a boolean array result of length n, where result[i] is true if,
 * after giving the ith kid all the extraCandies, they will have the greatest
 * number of candies among all the kids, or false otherwise.
 * <p>
 * Note that multiple kids can have the greatest number of candies.
 */
public class KidsWithGreatestNumberOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        if (candies == null || candies.length == 0) return new ArrayList<>();
        int mostCandies = -1;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > mostCandies) mostCandies = candies[i];
        }
        List<Boolean> res = new ArrayList<>(candies.length);
        for (int i = 0; i < candies.length; i++) {
            res.add((candies[i] + extraCandies) >= mostCandies);
        }
        return res;
    }
}
