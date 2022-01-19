package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

  private final SearchInsertPosition searchInsertPosition;

  SearchInsertPositionTest() {
    searchInsertPosition = new SearchInsertPosition();
  }

  @Test
  void testSearchInsert1() {
    int[] nums = {1,3,5,6};
    int target = 5;

    assertEquals(2, searchInsertPosition.searchInsert(nums, target));
  }

  @Test
  void testSearchInsert2() {
    int[] nums = {1,3,5,6};
    int target = 2;

    assertEquals(1, searchInsertPosition.searchInsert(nums, target));
  }

  @Test
  void testSearchInsert3() {
    int[] nums = {1,3,5,6};
    int target = 7;

    assertEquals(4, searchInsertPosition.searchInsert(nums, target));
  }
}