package com.github.singals.algo.leetcode.seventyFive.trie;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrieTest {

    private Trie trie;

    @BeforeEach
    void setUp() {
        trie = new Trie();
    }

    @Test
    void implementTrieTestOne() {
        trie.insert("apple");
        assertTrue(trie.search("apple"));   // return True
        assertFalse(trie.search("app"));     // return False
        assertTrue(trie.startsWith("app")); // return True
        trie.insert("app");
        assertTrue(trie.search("app"));     // return True
    }
}