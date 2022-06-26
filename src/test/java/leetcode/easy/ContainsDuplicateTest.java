package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 10/11/19 12:12 AM
 */

class ContainsDuplicateTest {

  private final ContainsDuplicate containsDuplicate;

  ContainsDuplicateTest() {
    containsDuplicate = new ContainsDuplicate();
  }

  @Test
  void testContainsDuplicate1() {
    int[] nums = {1, 2, 3, 1};
    assertTrue(containsDuplicate.containsDuplicate(nums));
  }

  @Test
  void testContainsDuplicate2() {
    int[] nums = {1, 2, 3, 4};
    assertFalse(containsDuplicate.containsDuplicate(nums));
  }

  @Test
  void testContainsDuplicate3() {
    int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
    assertTrue(containsDuplicate.containsDuplicate(nums));
  }
}