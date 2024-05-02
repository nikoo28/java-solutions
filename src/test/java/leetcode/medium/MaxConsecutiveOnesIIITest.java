package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxConsecutiveOnesIIITest {

  private final MaxConsecutiveOnesIII maxConsecutiveOnesIII;

  MaxConsecutiveOnesIIITest() {
    maxConsecutiveOnesIII = new MaxConsecutiveOnesIII();
  }

  @Test
  void testLongestOnes1() {
    int[] nums = {1, 1, 0, 0, 1, 1, 1, 0, 1, 1};
    int k = 1;
    assertEquals(6, maxConsecutiveOnesIII.longestOnes(nums, k));
  }

  @Test
  void testLongestOnes2() {
    int[] nums = {1, 0, 0, 0, 1, 1, 1, 0, 1, 1};
    int k = 2;
    assertEquals(7, maxConsecutiveOnesIII.longestOnes(nums, k));
  }

  @Test
  void testLongestOnes3() {
    int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1};
    int k = 0;
    assertEquals(4, maxConsecutiveOnesIII.longestOnes(nums, k));
  }

  @Test
  void testLongestOnes4() {
    int[] nums = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int k = 2;
    assertEquals(2, maxConsecutiveOnesIII.longestOnes(nums, k));
  }

  @Test
  void testLongestOnes5() {
    int[] nums = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
    int k = 3;
    assertEquals(10, maxConsecutiveOnesIII.longestOnes(nums, k));
  }

  @Test
  void testLongestOnes6() {
    int[] nums = {0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0};
    int k = 2;
    assertEquals(6, maxConsecutiveOnesIII.longestOnes(nums, k));
  }
}