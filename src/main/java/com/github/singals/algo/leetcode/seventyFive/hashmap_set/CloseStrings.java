package com.github.singals.algo.leetcode.seventyFive.hashmap_set;

import java.util.*;

/**
 * Two strings are considered close if you can attain one from the other
 * using the following operations:
 * Operation 1: Swap any two existing characters.
 * For example, abcde -> aecdb
 * Operation 2: Transform every occurrence of one existing character
 * into another existing character, and do the same with the other character.
 * For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)
 * <p>
 * You can use the operations on either string as many times as necessary.
 * <p>
 * Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise.
 */
public class CloseStrings {
    public static boolean closeStrings(String word1, String word2) {
        if (word1.equals(word2)) return true;
        if (word1.length() != word2.length()) return false;

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        //populate count of each character
        for (int i = 0; i < word1.length(); i++) {
            count1[word1.charAt(i) - 'a']++;
            count2[word2.charAt(i) - 'a']++;
        }

        //check if characters are same
        for (int i = 0; i < count1.length; i++) {
            if (count1[i] == 0 ^ count2[i] == 0) return false;
        }

        //check count is same or swappable
        Arrays.sort(count1);
        Arrays.sort(count2);
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) return false;
        }
        return true;
    }
}
