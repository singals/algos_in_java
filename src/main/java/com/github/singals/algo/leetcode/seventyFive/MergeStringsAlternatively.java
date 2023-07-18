package com.github.singals.algo.leetcode.seventyFive;

public class MergeStringsAlternatively {

    public static String mergeAlternatively(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        int maxLength = length1 > length2 ? length1 : length2;
        char[] res = new char[length1+length2];
        int j=0, p=0, q=0;

        for (int i = 0; i < maxLength; i++) {
            if (i < length1) res[j++] = word1.charAt(p++);
            if (i < length2) res[j++] = word2.charAt(q++);
        }
        return new String(res);
    }
}
