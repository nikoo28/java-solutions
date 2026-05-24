package leetcode.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RodCuttingTest {

  private final RodCutting rodCutting;

  RodCuttingTest() {
    rodCutting = new RodCutting();
  }

  @Test
  void testCutRod1() {
    int[] prices = {0, 1, 5, 8, 9, 10, 17, 17, 20};
    int result = rodCutting.cutRod(prices);
    assertEquals(22, result);
  }

  @Test
  void testCutRod2() {
    int[] prices = {0, 3, 5, 8, 9, 10, 17, 17, 20};
    int result = rodCutting.cutRod(prices);
    assertEquals(24, result);
  }

  @Test
  void testCutRod3() {
    int[] prices = {0, 3};
    int result = rodCutting.cutRod(prices);
    assertEquals(3, result);
  }
}