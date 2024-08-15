package com.github.singals.algo.leetcode.seventyFive.binary_search;

//https://leetcode.com/problems/guess-number-higher-or-lower/description/
public class GuessNumberHigherOrLower {

    private int pick;

    public GuessNumberHigherOrLower(int pick) {
        this.pick = pick;
    }

    public int guessNumber(int n) {
        if (guess(n) == 0) return n;
        else if (guess(1) == 0) return 1;

        int min = 0;

        while (min <= n) {
            long sum = (long) min + (long) n;
            int mid = (int) (sum / 2);
            int guessRes = guess(mid);
            if (guessRes == -1) {
                //pick < mid
                n = mid;
            } else if (guessRes == 1) {
                //pick > mid
                min = mid;
            } else return mid;
        }
        return -1;
    }

    /**
     * @param num
     * @return -1 if num is higher than the picked number
     * 1 if num is lower than the picked number
     * otherwise return 0
     */
    private int guess(int num) {
        return Integer.compare(this.pick, num);
    }
}
