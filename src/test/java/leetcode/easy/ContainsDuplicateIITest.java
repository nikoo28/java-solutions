package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 10/11/19 12:32 AM
 */

class ContainsDuplicateIITest {

  private ContainsDuplicateII containsDuplicateII = new ContainsDuplicateII();

  @Test
  void testContainsNearbyDuplicate1() {
    int[] nums = {1, 2, 3, 1};
    assertTrue(containsDuplicateII.containsNearbyDuplicate(nums, 3));
  }

  @Test
  void testContainsNearbyDuplicate2() {
    int[] nums = {1, 0, 1, 1};
    assertTrue(containsDuplicateII.containsNearbyDuplicate(nums, 1));
  }

  @Test
  void testContainsNearbyDuplicate3() {
    int[] nums = {1, 2, 3, 1, 2, 3};
    assertFalse(containsDuplicateII.containsNearbyDuplicate(nums, 2));
  }
}