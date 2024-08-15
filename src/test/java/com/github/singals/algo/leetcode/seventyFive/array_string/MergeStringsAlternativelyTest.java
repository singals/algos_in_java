package com.github.singals.algo.leetcode.seventyFive.array_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MergeStringsAlternativelyTest {

    @Test
    @DisplayName("merge-when-words-have-same-length")
    public void testMergeAlternativelyWhenWordsHaveSameLength() {
        String result = MergeStringsAlternatively.mergeAlternatively("abc", "pqr");
        Assertions.assertEquals("apbqcr", result);
    }

    @Test
    @DisplayName("merge-when-first-word-is-longer")
    public void testMergeAlternativelyWhenFirstWordIsLonger() {
        String result = MergeStringsAlternatively.mergeAlternatively("abcdef", "pqr");
        Assertions.assertEquals("apbqcrdef", result);
    }

    @Test
    @DisplayName("merge-when-second-word-is-longer")
    public void testMergeAlternativelyWhenSecondWordIsLonger() {
        String result = MergeStringsAlternatively.mergeAlternatively("abc", "pqrst");
        Assertions.assertEquals("apbqcrst", result);
    }
}