package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxConsecutiveOnesTest {

  private final MaxConsecutiveOnes maxConsecutiveOnes;

  MaxConsecutiveOnesTest() {
    maxConsecutiveOnes = new MaxConsecutiveOnes();
  }

  @Test
  void testFindMaxConsecutiveOnes1() {
    int[] nums = {1, 1, 0, 1, 1, 1};
    assertEquals(3, maxConsecutiveOnes.findMaxConsecutiveOnes(nums));
  }

  @Test
  void testFindMaxConsecutiveOnes2() {
    int[] nums = {1, 0, 1, 1, 0, 1};
    assertEquals(2, maxConsecutiveOnes.findMaxConsecutiveOnes(nums));
  }

  @Test
  void testFindMaxConsecutiveOnes3() {
    int[] nums = {1, 1, 1, 1, 1, 1};
    assertEquals(6, maxConsecutiveOnes.findMaxConsecutiveOnes(nums));
  }

  @Test
  void testFindMaxConsecutiveOnes4() {
    int[] nums = {0, 0, 0, 0, 0, 0};
    assertEquals(0, maxConsecutiveOnes.findMaxConsecutiveOnes(nums));
  }

  @Test
  void testFindMaxConsecutiveOnes5() {
    int[] nums = {1, 1, 1, 0, 0, 0};
    assertEquals(3, maxConsecutiveOnes.findMaxConsecutiveOnes(nums));
  }
}