package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumProductAfterKIncrementsTest {

  private final MaximumProductAfterKIncrements maximumProductAfterKIncrements;

  MaximumProductAfterKIncrementsTest() {
    maximumProductAfterKIncrements = new MaximumProductAfterKIncrements();
  }

  @Test
  void testMaximumProduct1() {
    int[] nums = {0, 4};
    int k = 5;

    assertEquals(20, maximumProductAfterKIncrements.maximumProduct(nums, k));
  }

  @Test
  void testMaximumProduct2() {
    int[] nums = {6, 3, 3, 2};
    int k = 2;

    assertEquals(216, maximumProductAfterKIncrements.maximumProduct(nums, k));
  }

  @Test
  void testMaximumProduct3() {
    int[] nums = {6, 3, 4, 2, 5};
    int k = 4;

    assertEquals(2400, maximumProductAfterKIncrements.maximumProduct(nums, k));
  }

  @Test
  void testMaximumProduct4() {
    int[] nums = {24, 5, 64, 53, 26, 38};
    int k = 54;

    assertEquals(180820950, maximumProductAfterKIncrements.maximumProduct(nums, k));
  }
}