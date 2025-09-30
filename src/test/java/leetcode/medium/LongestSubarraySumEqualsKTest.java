package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubarraySumEqualsKTest {

  private final LongestSubarraySumEqualsK longestSubarraySumEqualsK;

  LongestSubarraySumEqualsKTest() {
    longestSubarraySumEqualsK = new LongestSubarraySumEqualsK();
  }

  @Test
  void testLongestSubarray1() {
    int[] nums = {1, -1, 5, -2, 3};
    int k = 3;
    assertEquals(2, longestSubarraySumEqualsK.longestSubarray(nums, k));
  }

  @Test
  void testLongestSubarray2() {
    int[] nums = {-2, -1, 2, 1};
    int k = 1;
    assertEquals(2, longestSubarraySumEqualsK.longestSubarray(nums, k));
  }

  @Test
  void testLongestSubarray3() {
    int[] nums = {10, 2, 2, 7, 8 , 1, 1, 1, 1, -10};
    int k = 4;
    assertEquals(4, longestSubarraySumEqualsK.longestSubarray(nums, k));
  }
}