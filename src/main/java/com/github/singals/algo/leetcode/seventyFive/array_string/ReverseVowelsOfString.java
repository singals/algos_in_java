package com.github.singals.algo.leetcode.seventyFive.array_string;

import java.util.*;

/**
 * Given a string s, reverse only all the vowels in the string and return it.
 * <p>
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both
 * lower and upper cases, more than once.
 * <p>
 * Input: s = "hello"
 * Output: "holle"
 */
public class ReverseVowelsOfString {
    public static String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>(List.of('a', 'i', 'e', 'o', 'u', 'A', 'I', 'E', 'O', 'U'));
        char[] chars = s.toCharArray();

        //using deque over array here as the number of vowels is not known initially
        Deque<Integer> vowelIndexes = new LinkedList<>();

        // identify indexes first to swap vowels later
        for (int i = 0; i < chars.length; i++) {
            if (vowels.contains(chars[i])) {
                vowelIndexes.add(i);
            }
        }

        // swap vowels based on indexes
        while (vowelIndexes.size() > 1) {
            Integer firstVowelIndex = vowelIndexes.removeFirst();
            Integer lastVowelIndex = vowelIndexes.removeLast();
            char temp = chars[firstVowelIndex];
            chars[firstVowelIndex] = chars[lastVowelIndex];
            chars[lastVowelIndex] = temp;
        }
        return new String(chars);
    }
}
