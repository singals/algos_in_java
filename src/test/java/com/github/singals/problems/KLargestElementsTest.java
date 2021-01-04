package com.github.singals.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class KLargestElementsTest {

    @Test
    public void TestKLargestElements() {
        assertArrayEquals(new int[]{7, 8, 9},
                KLargestElements.kLargest(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, 3));

        assertArrayEquals(new int[]{6, 7, 8},
                KLargestElements.kLargest(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}, 3));

        assertArrayEquals(new int[]{78, 97},
                KLargestElements.kLargest(new int[]{78, 45, 12, 97, 4, 54, 69}, 2));

        assertArrayEquals(new int[]{54, 69, 78, 97},
                KLargestElements.kLargest(new int[]{78, 45, 12, 97, 4, 54, 69}, 4));
    }
}
