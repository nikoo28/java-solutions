package leetcode.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 11/9/19 2:03 AM
 */

class MinimumWindowSubstringTest {

  private MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();

  @Test
  void minWindow1() {
    String S = "ADOBECODEBANC";
    String T = "ABC";

    String expectedResult = "BANC";
    assertEquals(expectedResult, minimumWindowSubstring.minWindow(S, T));
  }

  @Test
  void minWindow2() {
    String S = "a";
    String T = "aa";

    String expectedResult = "";
    assertEquals(expectedResult, minimumWindowSubstring.minWindow(S, T));
  }

  @Test
  void minWindow3() {
    String S = "a";
    String T = "b";

    String expectedResult = "";
    assertEquals(expectedResult, minimumWindowSubstring.minWindow(S, T));
  }

  @Test
  void minWindow4() {
    String S = "ABAACBAB";
    String T = "ABC";

    String expectedResult = "ACB";
    assertEquals(expectedResult, minimumWindowSubstring.minWindow(S, T));
  }
}