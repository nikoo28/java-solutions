package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameIIITest {

  private final JumpGameIII jumpGameIII;

  JumpGameIIITest() {
    jumpGameIII = new JumpGameIII();
  }

  @Test
  void testCanReach1() {
    int[] arr = {4, 2, 3, 0, 3, 1, 2};
    int start_index = 5;

    assertTrue(jumpGameIII.canReach(arr, start_index));
  }

  @Test
  void testCanReach2() {
    int[] arr = {4, 2, 3, 0, 3, 1, 2};
    int start_index = 0;

    assertTrue(jumpGameIII.canReach(arr, start_index));
  }

  @Test
  void testCanReach3() {
    int[] arr = {3, 0, 2, 1, 2};
    int start_index = 2;

    assertFalse(jumpGameIII.canReach(arr, start_index));
  }
}