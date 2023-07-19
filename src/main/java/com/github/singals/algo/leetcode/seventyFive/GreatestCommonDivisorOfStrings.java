package com.github.singals.algo.leetcode.seventyFive;

/**
 * For two strings s and t, we say "t divides s" if and only if s = t + ... + t
 * (i.e., t is concatenated with itself one or more times).
 * <p>
 * Given two strings str1 and str2, return the largest string x such that x divides
 * both str1 and str2.
 * <p>
 * Input: str1 = "ABCABC", str2 = "ABC"
 * Output: "ABC"
 * <p>
 * Input: str1 = "ABABAB", str2 = "ABAB"
 * Output: "AB"
 * <p>
 * Input: str1 = "LEET", str2 = "CODE"
 * Output: ""
 */
public class GreatestCommonDivisorOfStrings {
    public static String gcdOfStrings(String str1, String str2) {
        if (str1.equals(str2)) return str1;
        if (!(str1 + str2).equals(str2 + str1)) return "";

        int length1 = str1.length();
        int length2 = str2.length();
        int minLength = Math.min(length1, length2);
        int gcd = 1;
        for (int i = minLength; i > 1; i--) {
            if (length1 % i == 0 && length2 % i == 0) {
                gcd = i;
                break;
            }
        }
        return str1.substring(0, gcd);
    }
}
