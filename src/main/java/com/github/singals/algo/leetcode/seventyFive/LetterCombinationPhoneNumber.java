package com.github.singals.algo.leetcode.seventyFive;

import java.util.*;

//https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
public class LetterCombinationPhoneNumber {
    private final Map<Character, List<String>> numberCharMap;

    public LetterCombinationPhoneNumber() {
        this.numberCharMap = new HashMap<>();
        numberCharMap.put('2', Arrays.asList("a", "b", "c"));
        numberCharMap.put('3', Arrays.asList("d", "e", "f"));
        numberCharMap.put('4', Arrays.asList("g", "h", "i"));
        numberCharMap.put('5', Arrays.asList("j", "k", "l"));
        numberCharMap.put('6', Arrays.asList("m", "n", "o"));
        numberCharMap.put('7', Arrays.asList("p", "q", "r", "s"));
        numberCharMap.put('8', Arrays.asList("t", "u", "v"));
        numberCharMap.put('9', Arrays.asList("w", "x", "y", "z"));
    }


    public List<String> letterCombinations(String digits) {
        char[] chars = digits.toCharArray();
        if (chars.length == 0) return new ArrayList<>();
        else if (chars.length == 1) return numberCharMap.get(chars[0]);
        else {
            return prepareCombination(chars);
        }
    }

    private List<String> prepareCombination(char[] digits) {
        List<String> combinations = new ArrayList<>();
        for (char digit : digits) {
            List<String> letters = numberCharMap.get(digit);
            if (combinations.isEmpty()) combinations.addAll(letters);
            else {
                combinations = mergeCombinations(combinations, letters);
            }
        }
        return combinations;
    }

    private List<String> mergeCombinations(List<String> combinations, List<String> letters) {
        List<String> newCombinations = new ArrayList<>();
        for (String combination : combinations) {
            for (String letter : letters) {
                StringBuffer sb = new StringBuffer();
                sb.append(combination).append(letter);
                newCombinations.add(sb.toString());
            }
        }
        return newCombinations;
    }
}
