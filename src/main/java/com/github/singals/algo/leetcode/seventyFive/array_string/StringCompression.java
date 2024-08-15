package com.github.singals.algo.leetcode.seventyFive.array_string;

/**
 * Given an array of characters chars, compress it using the following algorithm:
 * <p>
 * Begin with an empty string s. For each group of consecutive repeating characters in chars:
 * <p>
 * If the group's length is 1, append the character to s.
 * Otherwise, append the character followed by the group's length.
 * <p>
 * The compressed string s should not be returned separately, but instead, be stored in the
 * input character array chars. Note that group lengths that are 10 or longer will be split
 * into multiple characters in chars.
 * <p>
 * After you are done modifying the input array, return the new length of the array.
 * <p>
 * You must write an algorithm that uses only constant extra space.
 */
public class StringCompression {
    public static int compress(char[] chars) {
        if (chars.length == 1) return 1;
        Character previousChar = null;
        int counter = 0;
        int indexCounter = 0;
        for (int i = 0; i < chars.length; i++) {
            char currChar = chars[i];
            if (previousChar == null) {
                previousChar = currChar;
                counter++;
            } else if (i == chars.length - 1) {
                if (currChar == previousChar) {
                    counter++;
                    chars[indexCounter++] = previousChar;
                    indexCounter = modifyInputArrayForRecurrence(chars, counter, indexCounter);
                } else {
                    chars[indexCounter++] = previousChar;
                    indexCounter = modifyInputArrayForRecurrence(chars, counter, indexCounter);
                    chars[indexCounter++] = currChar;
                }
            } else if (currChar == previousChar) counter++;
            else {
                //modify input array
                chars[indexCounter++] = previousChar;
                indexCounter = modifyInputArrayForRecurrence(chars, counter, indexCounter);
                previousChar = currChar;
                counter = 1;
            }
        }
        return indexCounter;
    }

    private static int modifyInputArrayForRecurrence(char[] chars, int counter, int indexCounter) {
        if (counter <= 1) return indexCounter;
        else if (counter < 10) chars[indexCounter++] = Character.forDigit(counter, 10);
        else if (counter < 100) {
            chars[indexCounter++] = Character.forDigit(counter / 10, 10);
            chars[indexCounter++] = Character.forDigit(counter % 10, 10);
        } else if (counter < 1000) {
            chars[indexCounter++] = Character.forDigit(counter / 100, 10);
            counter = counter % 100;
            chars[indexCounter++] = Character.forDigit(counter / 10, 10);
            chars[indexCounter++] = Character.forDigit(counter % 10, 10);
        } else if (counter < 10000) {
            chars[indexCounter++] = Character.forDigit(counter / 1000, 10);
            counter = counter % 1000;
            chars[indexCounter++] = Character.forDigit(counter / 100, 10);
            counter = counter % 100;
            chars[indexCounter++] = Character.forDigit(counter / 10, 10);
            chars[indexCounter++] = Character.forDigit(counter % 10, 10);
        }
        return indexCounter;
    }
}