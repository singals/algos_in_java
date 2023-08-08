package com.github.singals.algo.leetcode.seventyFive;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Given an encoded string, return its decoded string.
 * <p>
 * The encoding rule is: k[encoded_string], where the encoded_string inside
 * the square brackets is being repeated exactly k times. Note that k is guaranteed
 * to be a positive integer.
 * <p>
 * You may assume that the input string is always valid; there are no extra
 * white spaces, square brackets are well-formed, etc. Furthermore, you may
 * assume that the original data does not contain any digits and that digits
 * are only for those repeat numbers, k. For example, there will not be input
 * like 3a or 2[4].
 * <p>
 * The test cases are generated so that the length of the output will never exceed 105.
 */
public class DecodeString {
    public static String decodeString(String s) {
        Deque<Integer> nums = new LinkedList<>();
        Deque<String> strs = new LinkedList<>();
        int i = 0;
        String str = "";
        while (i < s.length()) {
            if (Character.isDigit(s.charAt(i))) {
                int num = 0;
                while (Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                nums.push(num);
            } else if (s.charAt(i) == '[') {
                strs.push(str);
                str = "";
                i++;
            } else if (s.charAt(i) == ']') {
                Integer repeatCount = nums.pop();
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < repeatCount; j++) {
                    sb.append(str);
                }
                str = strs.pop() + sb;
                i++;
            } else {
                str += s.charAt(i);
                i++;
            }
        }
        return str;
    }
}
