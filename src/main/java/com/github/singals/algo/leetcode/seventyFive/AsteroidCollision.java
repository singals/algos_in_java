package com.github.singals.algo.leetcode.seventyFive;

import java.util.Stack;

/**
 * We are given an array asteroids of integers representing asteroids in a row.
 * <p>
 * For each asteroid, the absolute value represents its size, and the sign represents
 * its direction (positive meaning right, negative meaning left). Each asteroid moves
 * at the same speed.
 * <p>
 * Find out the state of the asteroids after all collisions. If two asteroids meet,
 * the smaller one will explode. If both are the same size, both will explode.
 * Two asteroids moving in the same direction will never meet.
 */
public class AsteroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            asteroidsCollide(asteroid, stack);
        }
        int[] res = new int[stack.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;
    }

    private static void asteroidsCollide(int asteroid, Stack<Integer> stack) {
        if (stack.isEmpty()) {
            stack.push(asteroid);
        } else {
            Integer prevAsteroid = stack.pop();
            if (prevAsteroid > 0 && asteroid < 0) {
                if (Math.abs(prevAsteroid) == Math.abs(asteroid)) return;
                stack.push(prevAsteroid > asteroid * -1 ? prevAsteroid : asteroid);
                //possibility of previous element being of a different sign as well
                asteroidsCollide(stack.pop(), stack);
            } else {
                stack.push(prevAsteroid);
                stack.push(asteroid);
            }
        }
    }
}
