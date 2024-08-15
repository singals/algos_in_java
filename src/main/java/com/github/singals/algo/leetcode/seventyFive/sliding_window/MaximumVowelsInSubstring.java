package com.github.singals.algo.leetcode.seventyFive.sliding_window;

/**
 * Given a string s and an integer k, return the maximum number of vowel letters
 * in any substring of s with length k.
 */
public class MaximumVowelsInSubstring {
    public static int maxVowels(String s, int k) {
        int vowelsCount = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) vowelsCount++;
        }
        int maxVowelCount = vowelsCount;

        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i - k))) vowelsCount--;
            if (isVowel(s.charAt(i))) vowelsCount++;
            if (maxVowelCount < vowelsCount) maxVowelCount = vowelsCount;
            if (maxVowelCount == k) return k;
        }

        return maxVowelCount;
    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
