package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumVowelsInASubstringTest {

  private final MaximumVowelsInASubstring maximumVowelsInASubstring;

  MaximumVowelsInASubstringTest() {
    maximumVowelsInASubstring = new MaximumVowelsInASubstring();
  }

  @Test
  void testMaxVowels1() {
    String s = "abciiidef";
    int k = 3;

    assertEquals(3, maximumVowelsInASubstring.maxVowels(s, k));
  }

  @Test
  void testMaxVowels2() {
    String s = "aeiou";
    int k = 2;

    assertEquals(2, maximumVowelsInASubstring.maxVowels(s, k));
  }

  @Test
  void testMaxVowels3() {
    String s = "leetcode";
    int k = 3;

    assertEquals(2, maximumVowelsInASubstring.maxVowels(s, k));
  }
}