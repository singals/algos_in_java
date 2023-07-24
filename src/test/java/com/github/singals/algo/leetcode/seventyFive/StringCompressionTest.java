package com.github.singals.algo.leetcode.seventyFive;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCompressionTest {

    @Test
    @DisplayName("compress-string-when-single-occurrence")
    void compressStringWhenSingleOccurrence() {
        char[] inputChar = {'a', 'b', 'c'};
        int compressedLength = StringCompression.compress(inputChar);
        assertEquals(3, compressedLength);
        assertArrayEquals(new char[]{'a', 'b', 'c'}, inputChar);

        inputChar = new char[]{'a'};
        compressedLength = StringCompression.compress(inputChar);
        assertEquals(1, compressedLength);
        assertArrayEquals(new char[]{'a'}, inputChar);
    }

    @Test
    @DisplayName("compress-string-when-multiple-occurrence")
    void compressStringWhenMultipleOccurrence() {
        char[] inputChar = {'a', 'b', 'b', 'c', 'c', 'c'};
        int compressedLength = StringCompression.compress(inputChar);
        assertEquals(5, compressedLength);
        assertArrayEquals(new char[]{'a', 'b', '2', 'c', '3', 'c'}, inputChar);

        inputChar = new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        compressedLength = StringCompression.compress(inputChar);
        assertEquals(6, compressedLength);
        assertArrayEquals(new char[]{'a', '2', 'b', '2', 'c', '3', 'c'}, inputChar);

        inputChar = new char[]{'a', 'a', 'b', 'b', 'c'};
        compressedLength = StringCompression.compress(inputChar);
        assertEquals(5, compressedLength);
        assertArrayEquals(new char[]{'a', '2', 'b', '2', 'c'}, inputChar);
    }

    @Test
    @DisplayName("compress-string-when-occurrence-in-double-digits")
    void compressStringWhenOccurrenceInDoubleDigits() {
        char[] inputChar = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        int compressedLength = StringCompression.compress(inputChar);
        assertEquals(4, compressedLength);
        assertArrayEquals(new char[]{'a', 'b', '1', '2', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}, inputChar);
    }
}