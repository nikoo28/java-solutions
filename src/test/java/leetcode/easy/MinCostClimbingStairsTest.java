package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinCostClimbingStairsTest {

  private final MinCostClimbingStairs minCostClimbingStairs;

  MinCostClimbingStairsTest() {
    minCostClimbingStairs = new MinCostClimbingStairs();
  }

  @Test
  void testMinCostClimbingStairs1() {
    int[] cost = {10, 15, 20};
    assertEquals(15, minCostClimbingStairs.minCostClimbingStairs(cost));
  }

  @Test
  void testMinCostClimbingStairs2() {
    int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
    assertEquals(6, minCostClimbingStairs.minCostClimbingStairs(cost));
  }

  @Test
  void testMinCostClimbingStairs3() {
    int[] cost = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    assertEquals(5, minCostClimbingStairs.minCostClimbingStairs(cost));
  }

  @Test
  void testMinCostClimbingStairs4() {
    int[] cost = {1, 2};
    assertEquals(1, minCostClimbingStairs.minCostClimbingStairs(cost));
  }
}