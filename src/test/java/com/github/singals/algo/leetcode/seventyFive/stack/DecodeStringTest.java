package com.github.singals.algo.leetcode.seventyFive.stack;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeStringTest {
    @Test
    @DisplayName("decode-string")
    void decodeString() {
        String res = DecodeString.decodeString("3[a2[c]]");
        assertEquals("accaccacc", res);

        res = DecodeString.decodeString("3[a]2[bc]");
        assertEquals("aaabcbc", res);

        res = DecodeString.decodeString("2[abc]3[cd]ef");
        assertEquals("abcabccdcdcdef", res);

        res = DecodeString.decodeString("10[ab]cd");
        assertEquals("ababababababababababcd", res);

        res = DecodeString.decodeString("abcd");
        assertEquals("abcd", res);
    }
}