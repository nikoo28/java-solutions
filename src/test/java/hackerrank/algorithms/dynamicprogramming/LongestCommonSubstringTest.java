package hackerrank.algorithms.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonSubstringTest {

  private final LongestCommonSubstring longestCommonSubstring;

  LongestCommonSubstringTest() {
    longestCommonSubstring = new LongestCommonSubstring();
  }

  @Test
  void testLongestCommonSubstring1() {
    String m = "zfbcdzb";
    String n = "zbcdf";

    assertEquals(3, longestCommonSubstring.longestCommonSubstring(m, n));
  }

  @Test
  void testLongestCommonSubstring2() {
    String m = "abcdxyz";
    String n = "xyzabcd";

    assertEquals(4, longestCommonSubstring.longestCommonSubstring(m, n));
  }

  @Test
  void testLongestCommonSubstring3() {
    String m = "dadef";
    String n = "adwce";

    assertEquals(2, longestCommonSubstring.longestCommonSubstring(m, n));
  }
}