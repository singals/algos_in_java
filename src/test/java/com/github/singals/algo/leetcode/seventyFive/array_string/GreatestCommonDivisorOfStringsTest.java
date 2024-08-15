package com.github.singals.algo.leetcode.seventyFive.array_string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorOfStringsTest {

    @Test
    @DisplayName("gcd-strings-when-nothing-is-repeated")
    void gcdOfStringsWhenNothingIsRepeated() {
        String res = GreatestCommonDivisorOfStrings.gcdOfStrings("LEET", "CODE");
        assertEquals("", res);

        res = GreatestCommonDivisorOfStrings.gcdOfStrings("CODE", "LEET");
        assertEquals("", res);
    }

    @Test
    @DisplayName("gcd-strings-when-1-char-is-repeated")
    void gcdOfStringsWhenOneCharIsRepeated() {
        String res = GreatestCommonDivisorOfStrings.gcdOfStrings("A", "AA");
        assertEquals("A", res);

        res = GreatestCommonDivisorOfStrings.gcdOfStrings("AA", "A");
        assertEquals("A", res);
    }

    @Test
    @DisplayName("gcd-strings-when-2-chars-are-repeated")
    void gcdOfStringsWhenTwoCharsAreRepeated() {
        String res = GreatestCommonDivisorOfStrings.gcdOfStrings("ABABAB", "ABAB");
        assertEquals("AB", res);

        res = GreatestCommonDivisorOfStrings.gcdOfStrings("ABAB", "ABABAB");
        assertEquals("AB", res);
    }

    @Test
    @DisplayName("gcd-strings-when-3-chars-are-repeated")
    void gcdOfStringsWhenThreeCharsAreRepeated() {
        String res = GreatestCommonDivisorOfStrings.gcdOfStrings("ABCABC", "ABC");
        assertEquals("ABC", res);

        res = GreatestCommonDivisorOfStrings.gcdOfStrings("ABC", "ABCABC");
        assertEquals("ABC", res);
    }

    @Test
    @DisplayName("gcd-strings-when-4-chars-are-repeated")
    void gcdOfStringsWhenFourCharsAreRepeated() {
        String res = GreatestCommonDivisorOfStrings.gcdOfStrings("ABABABAB", "ABAB");
        assertEquals("ABAB", res);

        res = GreatestCommonDivisorOfStrings.gcdOfStrings("ABAB", "ABABABAB");
        assertEquals("ABAB", res);
    }

    @Test
    @DisplayName("gcd-strings-when-same-string-is-sent")
    void gcdOfStringsWhenSameStringIsSent() {
        String res = GreatestCommonDivisorOfStrings.gcdOfStrings("ABC", "ABC");
        assertEquals("ABC", res);
    }
}