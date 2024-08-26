package com.github.singals.algo.leetcode.seventyFive.dp_multidimensional;

//https://leetcode.com/problems/edit-distance/description/
public class EditDistance {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        Integer[][] mem = new Integer[m + 1][n + 1];

        for (int i = 0; i < mem.length; i++) mem[i][0] = i;
        for (int i = 0; i < mem[0].length; i++) mem[0][i] = i;

//        printGrid(mem);

        for (int i = 1; i < mem.length; i++) {
            for (int j = 1; j < mem[0].length; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    mem[i][j] = mem[i - 1][j - 1];
                } else {
                    int x = Math.min(mem[i - 1][j - 1], mem[i - 1][j]);
                    mem[i][j] = Math.min(mem[i][j - 1], x) + 1;
                }
            }
        }

//        System.out.println("***********************");
//        printGrid(mem);
        return mem[m][n];
    }

    private static void printGrid(Integer[][] mem) {
        for (int i = 0; i < mem.length; i++) {
            for (int j = 0; j < mem[0].length; j++) {
                System.out.print(" " + mem[i][j]);
            }
            System.out.println();
        }
    }
}
