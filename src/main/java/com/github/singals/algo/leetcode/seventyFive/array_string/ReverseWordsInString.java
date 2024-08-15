package com.github.singals.algo.leetcode.seventyFive.array_string;

/**
 * Given an input string s, reverse the order of the words.
 * <p>
 * A word is defined as a sequence of non-space characters.
 * The words in s will be separated by at least one space.
 * <p>
 * Return a string of the words in reverse order concatenated by a single space.
 * <p>
 * Note that s may contain leading or trailing spaces or multiple spaces between two words.
 * The returned string should only have a single space separating the words.
 * Do not include any extra spaces.
 */
public class ReverseWordsInString {
    public static String reverseWords(String s) {
        char[] chars = s.toCharArray();
        StringBuilder res = new StringBuilder(chars.length);
        int length = chars.length;
        int endIndex = -1;
        for (int i = (length - 1); i >= 0; i--) {
            char currentChar = chars[i];
            if (currentChar == ' ') {
                if (endIndex == -1) continue; //skip the extra spaces
                // a new word
                res.append(chars, i + 1, (endIndex - i));
                if (i > 0) res.append(' ');
                endIndex = -1;
            } else if (endIndex != -1) {
                if (i != 0) continue; // character of an ongoing word
                res.append(chars, 0, endIndex + 1); //first word of the string
            } else if (i == 0) {
                //single char word like `a`
                res.append(chars, 0, 1);
                break;
            } else {
                //beginning of a new word
                endIndex = i;
            }
        }
        return res.toString().trim();
    }
}
