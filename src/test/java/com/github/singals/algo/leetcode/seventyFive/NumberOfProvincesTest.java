package com.github.singals.algo.leetcode.seventyFive;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfProvincesTest {

    private NumberOfProvinces numberOfProvinces;

    @BeforeEach
    void setUp() {
        numberOfProvinces = new NumberOfProvinces();
    }

    @Test
    @DisplayName("no-of-provinces-example-one")
    void noOfProvincesExampleOne() {
        int[][] isConnected = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};

        int noOfProvinces = numberOfProvinces.findCircleNum(isConnected);

        assertEquals(2, noOfProvinces);
    }

    @Test
    @DisplayName("no-of-provinces-example-two")
    void noOfProvincesExampleTwo() {
        int[][] isConnected = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};

        int noOfProvinces = numberOfProvinces.findCircleNum(isConnected);

        assertEquals(3, noOfProvinces);
    }
}