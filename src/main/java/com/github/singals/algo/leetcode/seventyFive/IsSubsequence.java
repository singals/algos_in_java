package com.github.singals.algo.leetcode.seventyFive;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        if (s == null || s.length() == 0) return true;
        if (s.length() > t.length()) return false;

        char[] sub = s.toCharArray();
        char[] biggerString = t.toCharArray();
        int ptr1 = 0, ptr2 = 0;

        while (ptr1 < sub.length && ptr2 < biggerString.length) {
            boolean isMatch = false;
            if (sub[ptr1] == biggerString[ptr2]) {
                ptr1++;
                ptr2++;
                isMatch = true;
            } else {
                ptr2++;
            }
            if (ptr1 == (sub.length) && isMatch) return true;
        }
        return false;
    }
}
