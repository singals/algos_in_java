package com.github.singals.algo.leetcode.seventyFive;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseVowelsOfStringTest {

    @Test
    @DisplayName("reverse-vowel-when-there-is-no-vowel")
    void reverseVowelsWhenThereIsNoVowel() {
        String res = ReverseVowelsOfString.reverseVowels("hmm");
        assertEquals("hmm", res);
    }

    @Test
    @DisplayName("reverse-vowel-when-there-are-odd-vowels")
    void reverseVowelsWhenThereAreOddVowel() {
        String res = ReverseVowelsOfString.reverseVowels("hi");
        assertEquals("hi", res);

        res = ReverseVowelsOfString.reverseVowels("big");
        assertEquals("big", res);

        res = ReverseVowelsOfString.reverseVowels("aTest");
        assertEquals("eTast", res);
    }

    @Test
    @DisplayName("reverse-vowel-when-there-are-even-vowels")
    void reverseVowelsWhenThereAreEvenVowels() {
        String res = ReverseVowelsOfString.reverseVowels("hello");
        assertEquals("holle", res);

        res = ReverseVowelsOfString.reverseVowels("leetcode");
        assertEquals("leotcede", res);
    }

}