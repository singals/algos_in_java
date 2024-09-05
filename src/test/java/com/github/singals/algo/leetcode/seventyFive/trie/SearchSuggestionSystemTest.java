package com.github.singals.algo.leetcode.seventyFive.trie;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SearchSuggestionSystemTest {

    private SearchSuggestionSystem objUnderTest;
    private String[] products;
    private String searchWord;

    private List<List<String>> actualResult;
    private List<List<String>> expectedResult;

    @BeforeEach
    void setUp() {
        objUnderTest = new SearchSuggestionSystem();
    }

    @AfterEach
    void tearDown() {
        products = null;
        searchWord = null;
        actualResult = null;
        expectedResult = null;
    }

    @Test
    void suggestedProductsTestOne() {
        products = new String[]{"mobile", "mouse", "moneypot", "monitor", "mousepad"};
        searchWord = "mouse";
        expectedResult = List.of(List.of("mobile", "moneypot", "monitor"),
                List.of("mobile", "moneypot", "monitor"),
                List.of("mouse", "mousepad"),
                List.of("mouse", "mousepad"),
                List.of("mouse", "mousepad"));

        actualResult = objUnderTest.suggestedProducts(products, searchWord);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void suggestedProductsTestTwo() {
        products = new String[]{"havana"};
        searchWord = "havana";
        expectedResult = List.of(List.of("havana"),
                List.of("havana"),
                List.of("havana"),
                List.of("havana"),
                List.of("havana"),
                List.of("havana"));

        actualResult = objUnderTest.suggestedProducts(products, searchWord);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void suggestedProductsTestThree() {
        products = new String[]{"bags", "baggage", "banner", "box", "cloths"};
        searchWord = "bags";
        expectedResult = List.of(List.of("baggage", "bags", "banner"),
                List.of("baggage", "bags", "banner"),
                List.of("baggage", "bags"),
                List.of("bags"));

        actualResult = objUnderTest.suggestedProducts(products, searchWord);

        assertEquals(expectedResult, actualResult);
    }
}