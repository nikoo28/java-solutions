package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheDuplicateNumberTest {

  private final FindTheDuplicateNumber findTheDuplicateNumber;

  FindTheDuplicateNumberTest() {
    findTheDuplicateNumber = new FindTheDuplicateNumber();
  }

  @Test
  void testFindDuplicates1() {
    int[] nums = {1, 3, 4, 2, 2};

    assertEquals(2, findTheDuplicateNumber.findDuplicate(nums));
    assertEquals(2, findTheDuplicateNumber.findDuplicatesSorting(nums));
    assertEquals(2, findTheDuplicateNumber.findDuplicatesHashSet(nums));
  }

  @Test
  void testFindDuplicates2() {
    int[] nums = {3, 1, 3, 4, 2};

    assertEquals(3, findTheDuplicateNumber.findDuplicate(nums));
    assertEquals(3, findTheDuplicateNumber.findDuplicatesSorting(nums));
    assertEquals(3, findTheDuplicateNumber.findDuplicatesHashSet(nums));
  }

  @Test
  void testFindDuplicates3() {
    int[] nums = {1, 1};

    assertEquals(1, findTheDuplicateNumber.findDuplicate(nums));
    assertEquals(1, findTheDuplicateNumber.findDuplicatesSorting(nums));
    assertEquals(1, findTheDuplicateNumber.findDuplicatesHashSet(nums));
  }

  @Test
  void testFindDuplicates4() {
    int[] nums = {1, 1, 2};

    assertEquals(1, findTheDuplicateNumber.findDuplicate(nums));
    assertEquals(1, findTheDuplicateNumber.findDuplicatesSorting(nums));
    assertEquals(1, findTheDuplicateNumber.findDuplicatesHashSet(nums));
  }

  @Test
  void testFindDuplicates5() {
    int[] nums = {2, 2, 2, 2, 2};

    assertEquals(2, findTheDuplicateNumber.findDuplicate(nums));
    assertEquals(2, findTheDuplicateNumber.findDuplicatesSorting(nums));
    assertEquals(2, findTheDuplicateNumber.findDuplicatesHashSet(nums));
  }
}