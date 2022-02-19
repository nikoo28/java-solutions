package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

  private final LongestCommonPrefix longestCommonPrefix;

  LongestCommonPrefixTest() {
    longestCommonPrefix = new LongestCommonPrefix();
  }

  @Test
  void testLongestCommonPrefix1() {
    String[] strs = {"flower","flow","flight"};
    String expected = "fl";

    assertEquals(expected, longestCommonPrefix.longestCommonPrefix(strs));
  }

  @Test
  void testLongestCommonPrefix2() {
    String[] strs = {"flower","we","car"};
    String expected = "";

    assertEquals(expected, longestCommonPrefix.longestCommonPrefix(strs));
  }

  @Test
  void testLongestCommonPrefix3() {
    String[] strs = {"club","clutch","clumsy"};
    String expected = "clu";

    assertEquals(expected, longestCommonPrefix.longestCommonPrefix(strs));
  }
}