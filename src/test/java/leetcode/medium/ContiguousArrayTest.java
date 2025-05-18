package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContiguousArrayTest {

  private final ContiguousArray contiguousArray;

  ContiguousArrayTest() {
    contiguousArray = new ContiguousArray();
  }

  @Test
  void testFindMaxLength1() {
    int[] nums = {0, 1, 0, 1, 0, 1};
    assertEquals(6, contiguousArray.findMaxLength(nums));
  }

  @Test
  void testFindMaxLength2() {
    int[] nums = {0};
    assertEquals(0, contiguousArray.findMaxLength(nums));
  }

  @Test
  void testFindMaxLength3() {
    int[] nums = {0, 1};
    assertEquals(2, contiguousArray.findMaxLength(nums));
  }

  @Test
  void testFindMaxLength4() {
    int[] nums = {0, 1, 1, 0, 1};
    assertEquals(4, contiguousArray.findMaxLength(nums));
  }
}