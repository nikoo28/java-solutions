package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonSubsequenceTest {

  private final LongestCommonSubsequence longestCommonSubsequence;

  LongestCommonSubsequenceTest() {
    longestCommonSubsequence = new LongestCommonSubsequence();
  }

  @Test
  void testLongestCommonSubsequence1() {
    String str1 = "abcdaf";
    String str2 = "acbcf";

    assertEquals(4, longestCommonSubsequence.longestCommonSubsequence(str1, str2));
  }

  @Test
  void testLongestCommonSubsequence2() {
    String str1 = "skjbfbkjlsehefiuwehsensuibefewjkbde";
    String str2 = "wjlxheniugcfnweyncwgfcwurycouivghucntgxuoiwhm";

    assertEquals(13, longestCommonSubsequence.longestCommonSubsequence(str1, str2));
  }

  @Test
  void testLongestCommonSubsequence3() {
    String str1 = "abc";
    String str2 = "def";

    assertEquals(0, longestCommonSubsequence.longestCommonSubsequence(str1, str2));
  }

  @Test
  void testLongestCommonSubsequence4() {
    String str1 = "abcdaf";
    String str2 = "";

    assertEquals(0, longestCommonSubsequence.longestCommonSubsequence(str1, str2));
  }
}