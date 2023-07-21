package com.github.singals.algo.leetcode.seventyFive;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInStringTest {
    @Test
    @DisplayName("reverse-words-in-string")
    void reverseWordsInString() {
        String res = ReverseWordsInString.reverseWords("the sky is blue");
        assertEquals("blue is sky the", res);
    }

    @Test
    @DisplayName("reverse-words-in-string-with-leading-or-trailing-spaces")
    void reverseWordsInStringWithLeadingOrTrailingSpaces() {
        String res = ReverseWordsInString.reverseWords("  hello world  ");
        assertEquals("world hello", res);
    }

    @Test
    @DisplayName("reverse-words-in-string-with-extra-spaces-in-between")
    void reverseWordsInStringWithExtraSpacesInBetween() {
        String res = ReverseWordsInString.reverseWords("a good  example");
        assertEquals("example good a", res);

        res = ReverseWordsInString.reverseWords("   a     very    long    but    still    good   example   ");
        assertEquals("example good still but long very a", res);
    }

}