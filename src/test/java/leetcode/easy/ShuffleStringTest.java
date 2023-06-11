package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShuffleStringTest {

  private final ShuffleString shuffleString;

  ShuffleStringTest() {
    shuffleString = new ShuffleString();
  }

  @Test
  void testRestoreString1() {
    String s = "codeleet";
    int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};

    assertEquals("leetcode", shuffleString.restoreString(s, indices));
  }

  @Test
  void testRestoreString2() {
    String s = "abc";
    int[] indices = {0, 1, 2};

    assertEquals("abc", shuffleString.restoreString(s, indices));
  }
}