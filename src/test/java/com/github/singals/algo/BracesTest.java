package com.github.singals.algo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BracesTest {
    @Test
    @DisplayName("braces-combination-when-n<1")
    public void TestBracesCombinationWhenNLessThan1() {
        List<String> combinations = Braces.getCombinations(0);
        assertEquals(0, combinations.size());
        combinations = Braces.getCombinations(-1);
        assertEquals(0, combinations.size());
        combinations = Braces.getCombinations(-15);
        assertEquals(0, combinations.size());
    }

    @Test
    @DisplayName("braces-combination-n=1")
    public void TestBracesCombinationWhenNIs1() {
        List<String> combinations = Braces.getCombinations(1);
        assertEquals(1, combinations.size());
        assertEquals("{}", combinations.get(0));
    }

    @Test
    @DisplayName("braces-combination-n=2")
    public void TestBracesCombinationWhenNIs2() {
        List<String> combinations = Braces.getCombinations(2);
        assertEquals(2, combinations.size());
        assertTrue(combinations.contains("{{}}"));
        assertTrue(combinations.contains("{}{}"));
    }

    @Test
    @DisplayName("braces-combination-n=3")
    public void TestBracesCombinationWhenNIs3() {
        List<String> combinations = Braces.getCombinations(3);
        assertEquals(5, combinations.size());
        assertTrue(combinations.contains("{{{}}}"));
        assertTrue(combinations.contains("{}{}{}"));
        assertTrue(combinations.contains("{{}}{}"));
        assertTrue(combinations.contains("{}{{}}"));
        assertTrue(combinations.contains("{{}{}}"));
    }

    @Test
    @DisplayName("braces-combination-n>3")
    public void TestBracesCombinationWhenNGreaterThan3() {
        List<String> combinations = Braces.getCombinations(4);
        assertEquals(14, combinations.size());
        combinations = Braces.getCombinations(5);
        assertEquals(42, combinations.size());
        combinations = Braces.getCombinations(7);
        assertEquals(429, combinations.size());
    }
}