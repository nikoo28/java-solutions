package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class FindPivotIndexTest {

  private final FindPivotIndex findPivotIndex;

  FindPivotIndexTest() {
    findPivotIndex = new FindPivotIndex();
  }

  @Test
  void testPivotIndex1() {
    int[] nums = {1, 7, 3, 6, 5, 6};
    assertEquals(3, findPivotIndex.pivotIndex(nums));
  }

  @Test
  void testPivotIndex2() {
    int[] nums = {1, 2, 3};
    assertEquals(-1, findPivotIndex.pivotIndex(nums));
  }

  @Test
  void testPivotIndex3() {
    int[] nums = {2, 1, -1};
    assertEquals(0, findPivotIndex.pivotIndex(nums));
  }

  @Test
  void testPivotIndex4() {
    int[] nums = {0, 0, 0, 0, 1};
    assertEquals(4, findPivotIndex.pivotIndex(nums));
  }

  @Test
  void testPivotIndex5() {
    int[] nums = {1, 2, 3, 4, 5, 6};
    assertEquals(-1, findPivotIndex.pivotIndex(nums));
  }
}