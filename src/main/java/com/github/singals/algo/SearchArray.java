package com.github.singals.algo;

import java.util.Objects;

public class SearchArray {
    public static boolean byLinearSearch(Integer[] arr, Integer element){
        for (Integer arrElement : arr) {
            if (Objects.equals(arrElement, element)) {
                return true;
            }
        }
        return false;
    }
}
