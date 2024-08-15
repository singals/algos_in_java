package com.github.singals.algo.leetcode.seventyFive.sliding_window;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumVowelsInSubstringTest {

    @Test
    @DisplayName("max-vowels-when-no-vowels")
    void maxVowelsWhenNoVowels() {
        int maxVowels = MaximumVowelsInSubstring.maxVowels("bcdfghjklmnpqrstvwxyz", 2);
        assertEquals(0, maxVowels);

        maxVowels = MaximumVowelsInSubstring.maxVowels("bcdfghjklmnpqrstvwxyz", 3);
        assertEquals(0, maxVowels);

        maxVowels = MaximumVowelsInSubstring.maxVowels("bcdfghjklmnpqrstvwxyz", 4);
        assertEquals(0, maxVowels);

        maxVowels = MaximumVowelsInSubstring.maxVowels("bcdfghjklmnpqrstvwxyz", 6);
        assertEquals(0, maxVowels);
    }

    @Test
    @DisplayName("max-vowels-when-all-vowels")
    void maxVowelsWhenAllVowels() {
        int maxVowels = MaximumVowelsInSubstring.maxVowels("aeiou", 2);
        assertEquals(2, maxVowels);

        maxVowels = MaximumVowelsInSubstring.maxVowels("aeiou", 3);
        assertEquals(3, maxVowels);

        maxVowels = MaximumVowelsInSubstring.maxVowels("aeiou", 4);
        assertEquals(4, maxVowels);

        maxVowels = MaximumVowelsInSubstring.maxVowels("aeiou", 5);
        assertEquals(5, maxVowels);
    }

    @Test
    @DisplayName("max-vowels-when-some-vowels")
    void maxVowelsWhenSomeVowels() {
        int maxVowels = MaximumVowelsInSubstring.maxVowels("abciiidef", 3);
        assertEquals(3, maxVowels);

        maxVowels = MaximumVowelsInSubstring.maxVowels("leetcode", 3);
        assertEquals(2, maxVowels);

        maxVowels = MaximumVowelsInSubstring.maxVowels("tryhard", 4);
        assertEquals(1, maxVowels);
    }

}