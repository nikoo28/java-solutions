package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 10/11/19 12:12 AM
 */

class ContainsDuplicateTest {

  ContainsDuplicate containsDuplicate = new ContainsDuplicate();

  @Test
  void testContainsDuplicate1() {
    int[] nums = {1, 2, 3, 1};
    assertEquals(true, containsDuplicate.containsDuplicate(nums));
  }

  @Test
  void testContainsDuplicate2() {
    int[] nums = {1, 2, 3, 4};
    assertEquals(false, containsDuplicate.containsDuplicate(nums));
  }

  @Test
  void testContainsDuplicate3() {
    int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
    assertEquals(true, containsDuplicate.containsDuplicate(nums));
  }
}