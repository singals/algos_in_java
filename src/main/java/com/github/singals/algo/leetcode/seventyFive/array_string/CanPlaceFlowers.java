package com.github.singals.algo.leetcode.seventyFive.array_string;

/**
 * You have a long flowerbed in which some of the plots are planted,
 * and some are not. However, flowers cannot be planted in adjacent plots.
 * <p>
 * Given an integer array flowerbed containing 0's and 1's,
 * where 0 means empty and 1 means not empty,
 * and an integer n, return true if n new flowers can be planted
 * in the flowerbed without violating the no-adjacent-flowers rule
 * and false otherwise.
 */
public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int totalLength = flowerbed.length;
        int maxFlowers = (totalLength + 1) / 2;
        if (n > maxFlowers) return false;
        int flowersThatCanBePlanted = 0;
        for (int i = 0; i < totalLength; i++) {
            if (i == 0) {
                if ((totalLength == 1 && flowerbed[i] == 0) || (flowerbed[i] == 0 && flowerbed[i + 1] == 0)) {
                    flowerbed[i] = 1;
                    flowersThatCanBePlanted++;
                }
            } else if (i == (totalLength - 1)) {
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                    flowerbed[i] = 1;
                    flowersThatCanBePlanted++;
                }
            } else if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                flowersThatCanBePlanted++;
            }
        }
        return flowersThatCanBePlanted >= n;
    }
}
