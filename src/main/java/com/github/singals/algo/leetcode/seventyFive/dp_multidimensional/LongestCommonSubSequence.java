package com.github.singals.algo.leetcode.seventyFive.dp_multidimensional;

//https://leetcode.com/problems/longest-common-subsequence/
public class LongestCommonSubSequence {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] chars = new int[text1.length()][text2.length()];

        for (int i = 0; i < text1.length(); i++) {
            for (int j = 0; j < text2.length(); j++) {
                boolean isCurrCharSame = text1.charAt(i) == text2.charAt(j);
                if (i == 0 && j == 0) {
                    //first char of both strings
                    if (isCurrCharSame) chars[i][j] = 1;
                    else chars[i][j] = 0;
                } else {
                    if (isCurrCharSame) {
                        if (i != 0 && j != 0) chars[i][j] = chars[i - 1][j - 1] + 1;
                        else chars[i][j] = 1;
                    } else
                        chars[i][j] = Math.max(getLeftElementIfExists(chars, i, j), getUpperElementIfExists(chars, i, j));
                }
            }
        }

        return chars[text1.length() - 1][text2.length() - 1];
    }

    private int getUpperElementIfExists(int[][] chars, int i, int j) {
        if (i == 0) return 0;
        else return chars[i - 1][j];
    }

    private int getLeftElementIfExists(int[][] chars, int i, int j) {
        if (j == 0) return 0;
        else return chars[i][j - 1];
    }

}
