package com.github.singals.algo.leetcode.seventyFive.bit_manipulation;

//https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c/
public class MinimumFlips {
    public int minFlips(int a, int b, int c) {
        int flips = 0;
        for (int i = 0; i < 32; i++) {
            boolean ai = false, bi = false, ci = false;
            if ((a & (1 << i)) > 0) ai = true;
            if ((b & (1 << i)) > 0) bi = true;
            if ((c & (1 << i)) > 0) ci = true;

            if (ci) {
                if (!ai && !bi) flips++;
            } else {
                if (ai && bi) flips += 2;
                else if (ai || bi) flips++;
            }
        }
        return flips;
    }
}
