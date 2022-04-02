package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextGreaterElementITest {

  private final NextGreaterElementI nextGreaterElementI;

  NextGreaterElementITest() {
    nextGreaterElementI = new NextGreaterElementI();
  }

  @Test
  void testNextGreaterElement1() {
    int[] nums1 = {4, 1, 2};
    int[] nums2 = {1, 3, 4, 2};

    int[] expected = {-1, 3, -1};
    int[] actual = nextGreaterElementI.nextGreaterElement(nums1, nums2);

    assertArrayEquals(expected, actual);
  }

  @Test
  void testNextGreaterElement2() {
    int[] nums1 = {2, 4};
    int[] nums2 = {1, 2, 3, 4};

    int[] expected = {3, -1};
    int[] actual = nextGreaterElementI.nextGreaterElement(nums1, nums2);

    assertArrayEquals(expected, actual);
  }
}