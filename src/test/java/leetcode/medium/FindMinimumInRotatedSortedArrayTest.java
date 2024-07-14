package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMinimumInRotatedSortedArrayTest {

  private final FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray;

  FindMinimumInRotatedSortedArrayTest() {
    findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray();
  }

  @Test
  void testFindMin1() {
    int[] nums = {3, 4, 5, 1, 2};
    assertEquals(1, findMinimumInRotatedSortedArray.findMin(nums));
  }

  @Test
  void testFindMin2() {
    int[] nums = {4, 5, 6, 7, 0, 1, 2};
    assertEquals(0, findMinimumInRotatedSortedArray.findMin(nums));
  }

  @Test
  void testFindMin3() {
    int[] nums = {11, 13, 15, 17};
    assertEquals(11, findMinimumInRotatedSortedArray.findMin(nums));
  }

  @Test
  void testFindMin4() {
    int[] nums = {1};
    assertEquals(1, findMinimumInRotatedSortedArray.findMin(nums));
  }
}