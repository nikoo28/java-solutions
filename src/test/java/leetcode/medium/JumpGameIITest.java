package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameIITest {

  private final JumpGameII jumpGameII;

  JumpGameIITest() {
    jumpGameII = new JumpGameII();
  }

  @Test
  void testJump1() {
    int[] arr = {2, 3, 1, 1, 4};
    assertEquals(2, jumpGameII.jump(arr));
  }

  @Test
  void testJump2() {
    int[] arr = {2, 3, 1, 4, 1, 1, 1, 2};
    assertEquals(3, jumpGameII.jump(arr));
  }

  @Test
  void testJump3() {
    int[] arr = {2, 4, 1, 2, 3, 1, 1, 2};
    assertEquals(3, jumpGameII.jump(arr));
  }

  @Test
  void testJump4() {
    int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
    assertEquals(3, jumpGameII.jump(arr));
  }

  @Test
  void testJump5() {
    int[] arr = {9};
    assertEquals(0, jumpGameII.jump(arr));
  }

  @Test
  void testJump6() {
    int[] arr = {1, 4, 3, 2, 6, 7};
    assertEquals(2, jumpGameII.jump(arr));
  }
}