package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfUniqueElementsTest {

  private final SumOfUniqueElements sumOfUniqueElements;

  SumOfUniqueElementsTest() {
    sumOfUniqueElements = new SumOfUniqueElements();
  }

  @Test
  void testSumOfUnique1() {
    int[] nums = {1, 2, 3, 2};
    assertEquals(4, sumOfUniqueElements.sumOfUnique(nums));
  }

  @Test
  void testSumOfUnique2() {
    int[] nums = {1, 1, 1, 1, 1};
    assertEquals(0, sumOfUniqueElements.sumOfUnique(nums));
  }

  @Test
  void testSumOfUnique3() {
    int[] nums = {1, 2, 3, 4, 5};
    assertEquals(15, sumOfUniqueElements.sumOfUnique(nums));
  }
}