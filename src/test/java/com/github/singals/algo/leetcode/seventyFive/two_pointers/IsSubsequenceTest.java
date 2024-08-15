package com.github.singals.algo.leetcode.seventyFive.two_pointers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceTest {
    @Test
    @DisplayName("is-subsequence-when-s-is-larger")
    void isSubsequenceWhenSIsLarger() {
        boolean res = IsSubsequence.isSubsequence("subsequence", "issub");
        assertFalse(res);
    }

    @Test
    @DisplayName("is-subsequence-when-s-is-absent")
    void isSubsequenceWhenSIsAbsent() {
        boolean res = IsSubsequence.isSubsequence("", "issub");
        assertTrue(res);
    }

    @Test
    @DisplayName("is-subsequence-positive-test-cases")
    void isSubsequencePositiveTestCases() {
        boolean res = IsSubsequence.isSubsequence("abc", "ahbgdc");
        assertTrue(res);

        res = IsSubsequence.isSubsequence("abc", "abchbgdc");
        assertTrue(res);

        res = IsSubsequence.isSubsequence("ace", "abcde");
        assertTrue(res);

        res = IsSubsequence.isSubsequence("ace", "tataace");
        assertTrue(res);
    }

    @Test
    @DisplayName("is-subsequence-negative-test-cases")
    void isSubsequenceNegativeTestCases() {
        boolean res = IsSubsequence.isSubsequence("abc", "pqrst");
        assertFalse(res);

        res = IsSubsequence.isSubsequence("aec", "tataace");
        assertFalse(res);

        res = IsSubsequence.isSubsequence("axc", "ahbgdc");
        assertFalse(res);
    }

}