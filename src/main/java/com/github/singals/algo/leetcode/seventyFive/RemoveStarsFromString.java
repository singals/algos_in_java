package com.github.singals.algo.leetcode.seventyFive;

import java.util.Stack;

/**
 * You are given a string s, which contains stars *.
 * <p>
 * In one operation, you can:
 * <p>
 * Choose a star in s.
 * Remove the closest non-star character to its left, as well as remove the
 * star itself.
 * <p>
 * Return the string after all stars have been removed.
 * <p>
 * Note:
 * <p>
 * The input will be generated such that the operation is always possible.
 * It can be shown that the resulting string will always be unique.
 */
public class RemoveStarsFromString {

    public static String removeStars(String s) {
        int starCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') starCount++;
        }
        if (starCount == 0) return s;
        int reduceBy = starCount * 2;
        if (reduceBy >= s.length()) return "";

        char[] res = new char[s.length()];

        int ptr = 0;
        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (currChar == '*') {
                ptr--;
            } else {
                res[ptr++] = currChar;
            }
        }
        return new String(res, 0, ptr);

//        Stack<Character> res = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            char currChar = s.charAt(i);
//            if (currChar == '*') {
//                if (!res.isEmpty()) res.pop();
//            } else {
//                res.push(currChar);
//            }
//        }
//
//        if (res.isEmpty()) return "";
//
//        StringBuffer sb = new StringBuffer(res.size());
//        res.forEach(sb::append);
//        return sb.toString();
    }
}
