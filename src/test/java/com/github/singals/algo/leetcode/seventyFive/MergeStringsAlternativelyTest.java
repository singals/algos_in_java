package com.github.singals.algo.leetcode.seventyFive;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringsAlternativelyTest {

    @Test
    @DisplayName("merge-when-words-have-same-length")
    public void testMergeAlternativelyWhenWordsHaveSameLength() {
        String result = MergeStringsAlternatively.mergeAlternatively("abc", "pqr");
        assertEquals("apbqcr", result);
    }

    @Test
    @DisplayName("merge-when-first-word-is-longer")
    public void testMergeAlternativelyWhenFirstWordIsLonger() {
        String result = MergeStringsAlternatively.mergeAlternatively("abcdef", "pqr");
        assertEquals("apbqcrdef", result);
    }

    @Test
    @DisplayName("merge-when-second-word-is-longer")
    public void testMergeAlternativelyWhenSecondWordIsLonger() {
        String result = MergeStringsAlternatively.mergeAlternatively("abc", "pqrst");
        assertEquals("apbqcrst", result);
    }
}