package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthMissingPositiveNumberTest {

  private final KthMissingPositiveNumber kthMissingPositiveNumber;

  KthMissingPositiveNumberTest() {
    kthMissingPositiveNumber = new KthMissingPositiveNumber();
  }

  @Test
  void testFindKthPositive1() {
    int[] arr = {2, 3, 4, 7, 11};
    int k = 5;
    assertEquals(9, kthMissingPositiveNumber.findKthPositive(arr, k));
  }

  @Test
  void testFindKthPositive2() {
    int[] arr = {1, 2, 3, 4};
    int k = 2;
    assertEquals(6, kthMissingPositiveNumber.findKthPositive(arr, k));
  }

  @Test
  void testFindKthPositive3() {
    int[] arr = {1, 3, 5, 7, 9};
    int k = 2;
    assertEquals(4, kthMissingPositiveNumber.findKthPositive(arr, k));
  }

  @Test
  void testFindKthPositive4() {
    int[] arr = {1};
    int k = 1;
    assertEquals(2, kthMissingPositiveNumber.findKthPositive(arr, k));
  }

  @Test
  void testFindKthPositive5() {
    int[] arr = {2};
    int k = 1;
    assertEquals(1, kthMissingPositiveNumber.findKthPositive(arr, k));
  }
}