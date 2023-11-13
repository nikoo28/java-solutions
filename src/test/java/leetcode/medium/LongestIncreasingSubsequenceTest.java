package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestIncreasingSubsequenceTest {

  private final LongestIncreasingSubsequence longestIncreasingSubsequence;

  LongestIncreasingSubsequenceTest() {
    longestIncreasingSubsequence = new LongestIncreasingSubsequence();
  }

  @Test
  void testLengthOfLIS1() {
    int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};

    assertEquals(4, longestIncreasingSubsequence.lengthOfLIS(nums));
  }

  @Test
  void testLengthOfLIS2() {
    int[] nums = {0, 1, 0, 3, 2, 3};

    assertEquals(4, longestIncreasingSubsequence.lengthOfLIS(nums));
  }

  @Test
  void testLengthOfLIS3() {
    int[] nums = {7, 7, 7, 7, 7, 7, 7};

    assertEquals(1, longestIncreasingSubsequence.lengthOfLIS(nums));
  }

  @Test
  void testLengthOfLIS4() {
    int[] nums = {3, 4, -1, 0, 6, 2, 3};

    assertEquals(4, longestIncreasingSubsequence.lengthOfLIS(nums));
  }
}