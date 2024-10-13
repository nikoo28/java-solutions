package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TargetSumTest {

  private final TargetSum targetSum;

  TargetSumTest() {
    targetSum = new TargetSum();
  }

  @Test
  void testFindTargetSumWays1() {
    int[] nums = {1, 1, 1, 1, 1};
    int target = 3;
    assertEquals(5, targetSum.findTargetSumWays(nums, target));
  }

  @Test
  void testFindTargetSumWays2() {
    int[] nums = {1};
    int target = 1;
    assertEquals(1, targetSum.findTargetSumWays(nums, target));
  }

  @Test
  void testFindTargetSumWays3() {
    int[] nums = {1};
    int target = 2;
    assertEquals(0, targetSum.findTargetSumWays(nums, target));
  }

  @Test
  void testFindTargetSumWays4() {
    int[] nums = {1, 2, 3, 4, 5};
    int target = 10;
    assertEquals(0, targetSum.findTargetSumWays(nums, target));
  }
}