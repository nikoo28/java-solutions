package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 11/2/19 10:16 PM
 */

class LongestPalindromicSubstringTest {

  private LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();

  @Test
  void longestPalindrome1() {
    String s = "babad";

    String actual = longestPalindromicSubstring.longestPalindrome(s);

    assertTrue(actual.equals("bab") || actual.equals("aba"));
  }

  @Test
  void longestPalindrome2() {
    String s = "cbbd";

    String actual = longestPalindromicSubstring.longestPalindrome(s);

    assertEquals("bb", actual);
  }
}