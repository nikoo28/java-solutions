package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumSizeSubarraySumTest {

  private final MinimumSizeSubarraySum minimumSizeSubarraySum;

  MinimumSizeSubarraySumTest() {
    minimumSizeSubarraySum = new MinimumSizeSubarraySum();
  }

  @Test
  void testMinSubArrayLen1() {
    int[] nums = {2, 3, 1, 2, 4, 3};
    int target = 7;

    assertEquals(2, minimumSizeSubarraySum.minSubArrayLen(target, nums));
  }

  @Test
  void testMinSubArrayLen2() {
    int[] nums = {1, 4, 4};
    int target = 4;

    assertEquals(1, minimumSizeSubarraySum.minSubArrayLen(target, nums));
  }

  @Test
  void testMinSubArrayLen3() {
    int[] nums = {2, 3, 1, 2, 4, 3};
    int target = 99;

    assertEquals(0, minimumSizeSubarraySum.minSubArrayLen(target, nums));
  }
}