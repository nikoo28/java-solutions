package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KokoEatingBananasTest {

  private final KokoEatingBananas kokoEatingBananas;

  KokoEatingBananasTest() {
    kokoEatingBananas = new KokoEatingBananas();
  }

  @Test
  void testMinEatingSpeed1() {
    int[] piles = {3, 6, 7, 11};
    int h = 8;
    assertEquals(4, kokoEatingBananas.minEatingSpeed(piles, h));
  }

  @Test
  void testMinEatingSpeed2() {
    int[] piles = {30, 11, 23, 4, 20};
    int h = 5;
    assertEquals(30, kokoEatingBananas.minEatingSpeed(piles, h));
  }

  @Test
  void testMinEatingSpeed3() {
    int[] piles = {30, 11, 23, 4, 20};
    int h = 6;
    assertEquals(23, kokoEatingBananas.minEatingSpeed(piles, h));
  }

  @Test
  void testMinEatingSpeed4() {
    int[] piles = {312884470};
    int h = 312884469;
    assertEquals(2, kokoEatingBananas.minEatingSpeed(piles, h));
  }
}