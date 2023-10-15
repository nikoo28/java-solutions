package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumLengthOfRepeatedSubarrayTest {

  private final MaximumLengthOfRepeatedSubarray maximumLengthOfRepeatedSubarray;

  MaximumLengthOfRepeatedSubarrayTest() {
    maximumLengthOfRepeatedSubarray = new MaximumLengthOfRepeatedSubarray();
  }

  @Test
  void testFindLength1() {
    int[] nums1 = {1, 2, 3, 2, 1};
    int[] nums2 = {3, 2, 1, 4, 7};

    assertEquals(3, maximumLengthOfRepeatedSubarray.findLength(nums1, nums2));
  }

  @Test
  void testFindLength2() {
    int[] nums1 = {0, 0, 0, 0, 0};
    int[] nums2 = {0, 0, 0, 0};

    assertEquals(4, maximumLengthOfRepeatedSubarray.findLength(nums1, nums2));
  }
}