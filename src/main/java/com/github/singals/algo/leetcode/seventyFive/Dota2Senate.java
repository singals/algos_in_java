package com.github.singals.algo.leetcode.seventyFive;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * In the world of Dota2, there are two parties: the Radiant and the Dire.
 * <p>
 * The Dota2 senate consists of senators coming from two parties. Now the
 * Senate wants to decide on a change in the Dota2 game. The voting for this
 * change is a round-based procedure. In each round, each senator can exercise
 * one of the two rights:
 * <p>
 * Ban one senator's right: A senator can make another senator lose all his rights
 * in this and all the following rounds.
 * Announce the victory: If this senator found the senators who still have rights
 * to vote are all from the same party, he can announce the victory and
 * decide on the change in the game.
 * <p>
 * Given a string senate representing each senator's party belonging. The character
 * 'R' and 'D' represent the Radiant party and the Dire party. Then if there are n
 * senators, the size of the given string will be n.
 * <p>
 * The round-based procedure starts from the first senator to the last senator in the
 * given order. This procedure will last until the end of voting. All the senators who
 * have lost their rights will be skipped during the procedure.
 * <p>
 * Suppose every senator is smart enough and will play the best strategy for his own
 * party. Predict which party will finally announce the victory and change the Dota2
 * game. The output should be "Radiant" or "Dire".
 */
public class Dota2Senate {
    public static String predictPartyVictory(String senate) {
        Deque<Character> senateQueue = new LinkedList<>();

        for (int i = 0; i < senate.length(); i++) {
            senateQueue.add(senate.charAt(i));
        }

        boolean isUnanimous = false;
        while (!isUnanimous) isUnanimous = vote(senateQueue);
        if (senateQueue.remove() == 'R') return "Radiant";
        else return "Dire";
    }

    private static boolean vote(Deque<Character> senateQueue) {
        Iterator<Character> senateIterator = senateQueue.iterator();
        int eliminateR = 0, eliminateD = 0;
        int rCount = 0, dCount = 0;
        while (senateIterator.hasNext()) {
            Character ch = senateIterator.next();
            if (ch == 'R') {
                if (eliminateR > 0) {
                    senateIterator.remove();
                    eliminateR--;
                } else {
                    eliminateD++;
                    rCount++;
                }
            } else {
                if (eliminateD > 0) {
                    senateIterator.remove();
                    eliminateD--;
                } else {
                    eliminateR++;
                    dCount++;
                }
            }
        }

        senateIterator = senateQueue.iterator();
        while (senateIterator.hasNext() && (eliminateR > 0 || eliminateD > 0)) {
            Character ch = senateIterator.next();
            if (eliminateR > 0 && ch == 'R') {
                senateIterator.remove();
                rCount--;
                eliminateR--;
            } else if (eliminateD > 0 && ch == 'D') {
                senateIterator.remove();
                dCount--;
                eliminateD--;
            }
        }

        return (rCount > 0 && dCount == 0) || (rCount == 0 && dCount > 0);
    }
}

