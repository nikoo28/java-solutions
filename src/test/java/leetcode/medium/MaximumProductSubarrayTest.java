package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumProductSubarrayTest {

  private final MaximumProductSubarray maximumProductSubarray;

  MaximumProductSubarrayTest() {
    maximumProductSubarray = new MaximumProductSubarray();
  }

  @Test
  void testMaxProduct1() {
    int[] nums = {2, 3, -2, 4};
    assertEquals(6, maximumProductSubarray.maxProduct(nums));
  }

  @Test
  void testMaxProduct2() {
    int[] nums = {-2, 0, -1};
    assertEquals(0, maximumProductSubarray.maxProduct(nums));
  }

  @Test
  void testMaxProduct3() {
    int[] nums = {2, 3, -2, -5, 6, -1, 4};
    assertEquals(360, maximumProductSubarray.maxProduct(nums));
  }

  @Test
  void testMaxProduct4() {
    int[] nums = {0, 0};
    assertEquals(0, maximumProductSubarray.maxProduct(nums));
  }

  @Test
  void testMaxProduct5() {
    int[] nums = { 0, 10, 10, 10, 10, 10, 10, 10, 10, 10, -10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 0 };
    assertEquals(1000000000, maximumProductSubarray.maxProduct(nums));
  }
}