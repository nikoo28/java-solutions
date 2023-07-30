package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumAverageSubarrayITest {

  private final MaximumAverageSubarrayI maximumAverageSubarrayI;

  MaximumAverageSubarrayITest() {
    maximumAverageSubarrayI = new MaximumAverageSubarrayI();
  }

  @Test
  void testFindMaxAverage1() {
    int k = 4;
    int[] nums = {1, 12, -5, -6, 50, 3};

    assertEquals(12.75, maximumAverageSubarrayI.findMaxAverage(nums, k));
  }

  @Test
  void testFindMaxAverage2() {
    int k = 1;
    int[] nums = {5};

    assertEquals(5.0, maximumAverageSubarrayI.findMaxAverage(nums, k));
  }

  @Test
  void testFindMaxAverage3() {
    int k = 4;
    int[] nums = {1, 12, -5, -6, 50, 3, 0, -45, 23};

    assertEquals(12.75, maximumAverageSubarrayI.findMaxAverage(nums, k));
  }
}