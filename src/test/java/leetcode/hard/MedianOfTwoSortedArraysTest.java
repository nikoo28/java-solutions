package leetcode.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 2019-09-14 19:36
 */

class MedianOfTwoSortedArraysTest {

  private MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();

  @Test
  void testfindMedianSortedArrays1() {
    int[] nums1 = {1, 3, 5, 7};
    int[] nums2 = {2, 4, 6, 8, 10};
    assertEquals(5.0, medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
  }

  @Test
  void testfindMedianSortedArrays2() {
    int[] nums1 = {1, 3, 8, 9, 15};
    int[] nums2 = {7, 11, 18, 19, 21, 25};
    assertEquals(11.0, medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
  }

  @Test
  void testfindMedianSortedArrays3() {
    int[] nums1 = {1};
    int[] nums2 = {7};
    assertEquals(4.0, medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2));
  }
}
