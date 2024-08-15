package com.github.singals.algo.leetcode.seventyFive.graph_dfs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EvaluateDivisionTest {

    private EvaluateDivision evaluateDivision;

    @BeforeEach
    void setUp() {
        evaluateDivision = new EvaluateDivision();
    }

    @Test
    @DisplayName("test-evaluate-division-test-one")
    void testEvaluateDivisionTestOne() {
        List<List<String>> equations = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("b", "c"));
        double[] values = new double[]{2.0, 3.0};
        List<List<String>> queries = Arrays.asList(Arrays.asList("a", "c"), Arrays.asList("b", "a"),
                Arrays.asList("a", "e"), Arrays.asList("a", "a"), Arrays.asList("x", "x"));
        double[] expectedResult = new double[]{6.0, 0.5, -1.0, 1.0, -1.0};

        double[] res = evaluateDivision.calcEquation(equations, values, queries);

        assertArrayEquals(expectedResult, res);
    }

    @Test
    @DisplayName("test-evaluate-division-test-two")
    void testEvaluateDivisionTestTwo() {
        List<List<String>> equations = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("b", "c"),
                Arrays.asList("bc", "cd"));
        double[] values = new double[]{1.5, 2.5, 5.0};
        List<List<String>> queries = Arrays.asList(Arrays.asList("a", "c"), Arrays.asList("c", "b"),
                Arrays.asList("bc", "cd"), Arrays.asList("cd", "bc"));
        double[] expectedResult = new double[]{3.75, 0.4, 5.0, 0.2};

        double[] res = evaluateDivision.calcEquation(equations, values, queries);

        assertArrayEquals(expectedResult, res);
    }

    @Test
    @DisplayName("test-evaluate-division-test-three")
    void testEvaluateDivisionTestThree() {
        List<List<String>> equations = Arrays.asList(Arrays.asList("a", "b"));
        double[] values = new double[]{0.5};
        List<List<String>> queries = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("b", "a"),
                Arrays.asList("a", "c"), Arrays.asList("x", "y"));
        double[] expectedResult = new double[]{0.5, 2.0, -1.0, -1.0};

        double[] res = evaluateDivision.calcEquation(equations, values, queries);

        assertArrayEquals(expectedResult, res);
    }
}