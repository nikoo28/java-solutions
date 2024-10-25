package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumIncrementToMakeArrayUniqueTest {

  private final MinimumIncrementToMakeArrayUnique minimumIncrementToMakeArrayUnique;

  MinimumIncrementToMakeArrayUniqueTest() {
    minimumIncrementToMakeArrayUnique = new MinimumIncrementToMakeArrayUnique();
  }

  @Test
  void testMinIncrementForUnique1() {
    int[] nums = {1, 2, 2};
    assertEquals(1, minimumIncrementToMakeArrayUnique.minIncrementForUnique(nums));
  }

  @Test
  void testMinIncrementForUnique2() {
    int[] nums = {3, 2, 1, 2, 1, 7};
    assertEquals(6, minimumIncrementToMakeArrayUnique.minIncrementForUnique(nums));
  }

  @Test
  void testMinIncrementForUnique3() {
    int[] nums = {1, 2, 2, 3, 3, 4, 4, 5, 5, 6};
    assertEquals(20, minimumIncrementToMakeArrayUnique.minIncrementForUnique(nums));
  }
}