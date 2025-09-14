package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubArraySumEqualsKTest {

  private final SubArraySumEqualsK subArraySumEqualsK;

  SubArraySumEqualsKTest() {
    subArraySumEqualsK = new SubArraySumEqualsK();
  }

  @Test
  void testSubarraySum1() {
    int[] nums = {1, 1, 1};
    int k = 2;

    assertEquals(2, subArraySumEqualsK.subarraySum(nums, k));
  }

  @Test
  void testSubarraySum2() {
    int[] nums = {1, 2, 3};
    int k = 3;

    assertEquals(2, subArraySumEqualsK.subarraySum(nums, k));
  }

  @Test
  void testSubarraySum3() {
    int[] nums = {1, -1, 0};
    int k = 0;

    assertEquals(3, subArraySumEqualsK.subarraySum(nums, k));
  }
}