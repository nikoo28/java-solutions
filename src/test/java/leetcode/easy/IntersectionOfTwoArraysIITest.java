package leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 10/16/19 1:08 AM
 */

class IntersectionOfTwoArraysIITest {

  private IntersectionOfTwoArraysII intersectionOfTwoArraysII = new IntersectionOfTwoArraysII();

  @Test
  void testIntersect1() {
    int[] nums1 = {1, 2, 2, 1};
    int[] nums2 = {2, 2};

    int[] expected = {2, 2};
    int[] actual = intersectionOfTwoArraysII.intersect(nums1, nums2);
    Arrays.sort(actual);
    Arrays.sort(expected);
    assertArrayEquals(expected, actual);
  }

  @Test
  void testIntersect2() {
    int[] nums1 = {4, 9, 5};
    int[] nums2 = {9, 4, 9, 8, 4};

    int[] expected = {4, 9};
    int[] actual = intersectionOfTwoArraysII.intersect(nums1, nums2);
    Arrays.sort(actual);
    Arrays.sort(expected);
    assertArrayEquals(expected, actual);
  }
}