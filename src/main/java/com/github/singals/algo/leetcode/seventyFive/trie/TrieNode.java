package com.github.singals.algo.leetcode.seventyFive.trie;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TrieNode {
    TrieNode[] children;

    boolean isLast;

    public TrieNode() {
        children = new TrieNode[26];
        isLast = false;
    }
}
