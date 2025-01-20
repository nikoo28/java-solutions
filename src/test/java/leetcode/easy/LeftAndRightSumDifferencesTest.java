package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeftAndRightSumDifferencesTest {

  private final LeftAndRightSumDifferences leftAndRightSumDifferences;

  LeftAndRightSumDifferencesTest() {
    leftAndRightSumDifferences = new LeftAndRightSumDifferences();
  }

  @Test
  void testLeftRightDifference1() {
    int[] nums = {10, 4, 8, 3};
    int[] expected = {15, 1, 11, 22};
    assertArrayEquals(expected, leftAndRightSumDifferences.leftRightDifference(nums));
  }

  @Test
  void testLeftRightDifference2() {
    int[] nums = {4, 2, 1, 3};
    int[] expected = {6, 0, 3, 7};
    assertArrayEquals(expected, leftAndRightSumDifferences.leftRightDifference(nums));
  }

  @Test
  void testLeftRightDifference3() {
    int[] nums = {1, 2, 3, 4};
    int[] expected = {9, 6, 1, 6};
    assertArrayEquals(expected, leftAndRightSumDifferences.leftRightDifference(nums));
  }

  @Test
  void testLeftRightDifference4() {
    int[] nums = {1, 1, 1, 1};
    int[] expected = {3, 1, 1, 3};
    assertArrayEquals(expected, leftAndRightSumDifferences.leftRightDifference(nums));
  }

  @Test
  void testLeftRightDifference5() {
    int[] nums = {1};
    int[] expected = {0};
    assertArrayEquals(expected, leftAndRightSumDifferences.leftRightDifference(nums));
  }
}