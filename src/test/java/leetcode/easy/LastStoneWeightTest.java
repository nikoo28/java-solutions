package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastStoneWeightTest {

  private final LastStoneWeight lastStoneWeight;

  LastStoneWeightTest() {
    lastStoneWeight = new LastStoneWeight();
  }

  @Test
  void testLastStoneWeight1() {
    int[] stones = {2, 7, 4, 1, 8, 1};
    assertEquals(1, lastStoneWeight.lastStoneWeight(stones));
  }

  @Test
  void testLastStoneWeight2() {
    int[] stones = {1, 3};
    assertEquals(2, lastStoneWeight.lastStoneWeight(stones));
  }

  @Test
  void testLastStoneWeight3() {
    int[] stones = {2, 2};
    assertEquals(0, lastStoneWeight.lastStoneWeight(stones));
  }

  @Test
  void testLastStoneWeight4() {
    int[] stones = {1, 1, 1, 1, 1};
    assertEquals(1, lastStoneWeight.lastStoneWeight(stones));
  }
}