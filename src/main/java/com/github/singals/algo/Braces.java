package com.github.singals.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Input: n=1
 * Output: {}
 * Input : n=2
 * Output:
 * {}{}
 * {{}}
 */
public class Braces {
    public static List<String> getCombinations(int n) {
        if (n <= 0) return new ArrayList<>();
        if (n == 1) return Arrays.asList("{}");
        List<String> combinations = new ArrayList<>();
        char[] combination = new char[2 * n];
        return getCombinations(combination, 0, 0, 0, n, combinations);
    }

    private static List<String> getCombinations(char[] str, int pos, int open, int close, int n, List<String> combinations) {
        if (close == n) {
            String s = String.valueOf(str);
            combinations.add(s);
        } else {
            if (open > close) {
                str[pos] = '}';
                getCombinations(str, pos + 1, open, close + 1, n, combinations);
            }
            if (open < n) {
                str[pos] = '{';
                getCombinations(str, pos + 1, open + 1, close, n, combinations);
            }
        }
        return combinations;
    }
}
