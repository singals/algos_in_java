package com.github.singals.algo.leetcode.seventyFive.trie;

//https://leetcode.com/problems/implement-trie-prefix-tree/
public class Trie {

    private final TrieNode rootNode;

    public Trie() {
        rootNode = new TrieNode();
    }

    public void insert(String word) {
        TrieNode ptr = rootNode;
        for (Character ch : word.toCharArray()) {
            if (ptr.children[ch - 'a'] == null) {
                ptr.children[ch - 'a'] = new TrieNode();
            }
            ptr = ptr.children[ch - 'a'];
        }
        ptr.isLast = true;
    }

    public boolean search(String word) {
        TrieNode ptr = rootNode;
        for (Character ch : word.toCharArray()) {
            if (ptr.children[ch - 'a'] == null) return false;
            ptr = ptr.children[ch - 'a'];
        }
        return ptr.isLast;
    }

    public boolean startsWith(String prefix) {
        TrieNode ptr = rootNode;
        for (Character ch : prefix.toCharArray()) {
            if (ptr.children[ch - 'a'] == null) return false;
            ptr = ptr.children[ch - 'a'];
        }
        return true;
    }

    class TrieNode {
        TrieNode[] children;

        boolean isLast;

        public TrieNode() {
            children = new TrieNode[26];
            isLast = false;
        }
    }
}

