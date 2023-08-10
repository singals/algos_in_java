package com.github.singals.algo.leetcode.seventyFive;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Dota2SenateTest {

    @Test
    @DisplayName("predict-party-victory-when-r-and-d-are-equal")
    void predictPartyVictoryWhenRAndDAreEqual() {
        String res = Dota2Senate.predictPartyVictory("RD");
        assertEquals("Radiant", res);

        res = Dota2Senate.predictPartyVictory("DR");
        assertEquals("Dire", res);

        res = Dota2Senate.predictPartyVictory("DRRD");
        assertEquals("Dire", res);

        res = Dota2Senate.predictPartyVictory("RDDR");
        assertEquals("Radiant", res);

        res = Dota2Senate.predictPartyVictory("DDRR");
        assertEquals("Dire", res);

        res = Dota2Senate.predictPartyVictory("RRDD");
        assertEquals("Radiant", res);
    }

    @Test
    @DisplayName("predict-party-victory-when-someone-has-majority")
    void predictPartyVictoryWhenSomeoneHasMajority() {
        String res = Dota2Senate.predictPartyVictory("RDD");
        assertEquals("Dire", res);

        res = Dota2Senate.predictPartyVictory("DRR");
        assertEquals("Radiant", res);

        res = Dota2Senate.predictPartyVictory("DDR");
        assertEquals("Dire", res);

        res = Dota2Senate.predictPartyVictory("RDDRR");
        assertEquals("Radiant", res);

        res = Dota2Senate.predictPartyVictory("DDRRR");
        assertEquals("Dire", res);

        res = Dota2Senate.predictPartyVictory("DRDRR");
        assertEquals("Dire", res);

        res = Dota2Senate.predictPartyVictory("DRRRD");
        assertEquals("Radiant", res);
    }

}