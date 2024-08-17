package com.github.singals.algo.leetcode.seventyFive.dp_1d;

public class DominoTrominoTiling {
    public int numTilings(int n) {
        long prev1 = 5;
        long prev2 = 2;
        long prev3 = 1;
        if (n == 1) return (int) prev3;
        else if (n == 2) return (int) prev2;
        else if (n == 3) return (int) prev1;

        int m = 1000000007;

        for (int i = 4; i <= n; i++) {
            long curr = (prev1 * 2) + prev3;
            curr = curr % m;
            if (i == n) return (int) curr;
            prev3 = prev2;
            prev2 = prev1;
            prev1 = curr;
        }


        //n -> Op
        //1 -> 1
        //2 -> 2
        //3 -> 5 (2*2
        //4 -> 11 (5*2 +1)
        //5 -> 24 (11*2 + 2)
        //6 -> 53 (24*2 + 5)
        //7 -> 117 (53*2 + 11)
        //n -> res[n-1]*2 + res[n-3]

        return 0;
    }
}
