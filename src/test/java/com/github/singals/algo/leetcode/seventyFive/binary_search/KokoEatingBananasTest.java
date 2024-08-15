package com.github.singals.algo.leetcode.seventyFive.binary_search;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KokoEatingBananasTest {

    private int[] piles;
    private int h;
    private int expectedResult;
    private int actualResult;

    @Test
    @DisplayName("min-eating-speed-test-one")
    void minEatingSpeedTestOne() {
        piles = new int[]{3, 6, 7, 11};
        h = 8;
        expectedResult = 4;

        actualResult = KokoEatingBananas.minEatingSpeed(piles, h);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("min-eating-speed-test-two")
    void minEatingSpeedTestTwo() {
        piles = new int[]{30, 11, 23, 4, 20};
        h = 5;
        expectedResult = 30;

        actualResult = KokoEatingBananas.minEatingSpeed(piles, h);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("min-eating-speed-test-three")
    void minEatingSpeedTestThree() {
        piles = new int[]{30, 11, 23, 4, 20};
        h = 6;
        expectedResult = 23;

        actualResult = KokoEatingBananas.minEatingSpeed(piles, h);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("min-eating-speed-test-four")
    void minEatingSpeedTestFour() {
        piles = new int[]{332484035, 524908576, 855865114, 632922376, 222257295, 690155293, 112677673, 679580077,
                337406589, 290818316, 877337160, 901728858, 679284947, 688210097, 692137887, 718203285, 629455728,
                941802184};
        h = 823855818;
        expectedResult = 14;

        actualResult = KokoEatingBananas.minEatingSpeed(piles, h);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("min-eating-speed-test-five")
    void minEatingSpeedTestFive() {
        piles = new int[]{312884470};
        h = 968709470;
        expectedResult = 1;

        actualResult = KokoEatingBananas.minEatingSpeed(piles, h);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("min-eating-speed-test-six")
    void minEatingSpeedTestSix() {
        piles = new int[]{1000000000, 1000000000};
        h = 3;
        expectedResult = 1000000000;

        actualResult = KokoEatingBananas.minEatingSpeed(piles, h);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("min-eating-speed-test-seven")
    void minEatingSpeedTestSeven() {
        piles = new int[]{873375536, 395271806, 617254718, 970525912, 634754347, 824202576, 694181619, 20191396,
                886462834, 442389139, 572655464, 438946009, 791566709, 776244944, 694340852, 419438893, 784015530,
                588954527, 282060288, 269101141, 499386849, 846936808, 92389214, 385055341, 56742915, 803341674,
                837907634, 728867715, 20958651, 167651719, 345626668, 701905050, 932332403, 572486583, 603363649,
                967330688, 484233747, 859566856, 446838995, 375409782, 220949961, 72860128, 998899684, 615754807,
                383344277, 36322529, 154308670, 335291837, 927055440, 28020467, 558059248, 999492426, 991026255,
                30205761, 884639109, 61689648, 742973721, 395173120, 38459914, 705636911, 30019578, 968014413,
                126489328, 738983100, 793184186, 871576545, 768870427, 955396670, 328003949, 786890382, 450361695,
                994581348, 158169007, 309034664, 388541713, 142633427, 390169457, 161995664, 906356894, 379954831,
                448138536};
        h = 943223529;
        expectedResult = 46;

        actualResult = KokoEatingBananas.minEatingSpeed(piles, h);

        assertEquals(expectedResult, actualResult);
    }
}