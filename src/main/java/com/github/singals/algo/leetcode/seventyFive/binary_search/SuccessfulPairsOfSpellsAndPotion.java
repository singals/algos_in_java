package com.github.singals.algo.leetcode.seventyFive.binary_search;

import java.util.Arrays;

// https://leetcode.com/problems/successful-pairs-of-spells-and-potions/description/
public class SuccessfulPairsOfSpellsAndPotion {

    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int[] res = new int[n];
        if (success == 1) {
            for (int i = 0; i < n; i++) {
                res[i] = m;
            }
        } else {
            Arrays.sort(potions);
            for (int i = 0; i < n; i++) {
                res[i] = findSuccesses(spells[i], potions, success, 0, m - 1);
            }
        }
        return res;
    }

    private static int findSuccesses(int spell, int[] potions, long success, int startInd, int endInd) {
        if (success > ((long) spell * potions[endInd])) return 0;
        else if (success <= ((long) spell * potions[0])) return potions.length - startInd;
        else if (endInd - startInd == 1 && (success <= ((long) spell * potions[endInd]))) {
            return potions.length - endInd;
        } else {
            int mid = (startInd + endInd) / 2;
            if (success > ((long) spell * potions[mid])) {
                //navigate right
                startInd = mid;
            } else {
                //success <= ((long) spell * potions[mid]
                //navigate left
                endInd = mid;
            }
            return findSuccesses(spell, potions, success, startInd, endInd);
        }
    }
}
