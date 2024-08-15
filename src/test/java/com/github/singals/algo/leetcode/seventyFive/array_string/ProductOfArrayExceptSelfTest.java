package com.github.singals.algo.leetcode.seventyFive.array_string;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {
    @Test
    @DisplayName("product-except-self")
    void productExceptSelf() {
        int[] res = ProductOfArrayExceptSelf.productExceptSelf(new int[]{1, 2, 3, 4});
        assertArrayEquals(new int[]{24, 12, 8, 6}, res);

        res = ProductOfArrayExceptSelf.productExceptSelf(new int[]{-1, 1, 0, -3, 3});
        assertArrayEquals(new int[]{0, 0, 9, 0, 0}, res);

        res = ProductOfArrayExceptSelf.productExceptSelf(new int[]{3, 4, 5, 6, 7});
        assertArrayEquals(new int[]{840, 630, 504, 420, 360}, res);
    }
}