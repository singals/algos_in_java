package com.github.singals.algo.leetcode.seventyFive.trie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/search-suggestions-system/
public class SearchSuggestionSystem {
    private Integer left;

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> res = new ArrayList<>();
        for (int i = 0; i < searchWord.length(); i++) {
            res.add(getMatchingWords(products, searchWord.substring(0, i + 1)));
        }
        return res;
    }

    private List<String> getMatchingWords(String[] products, String searchWord) {
        List<String> subList = new ArrayList<>();
        for (int i = 0; i < products.length; i++) {
            if (left != null && left > i) continue;
            if (products[i].startsWith(searchWord)) {
                subList.add(products[i]);
                if (left == null) {
                    left = i;
                }
            }
            if (subList.size() == 3) break;
        }
        return subList;
    }
}