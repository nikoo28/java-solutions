package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestRepeatingCharacterReplacementTest {

  private final LongestRepeatingCharacterReplacement longestRepeatingCharacterReplacement;

  LongestRepeatingCharacterReplacementTest() {
    longestRepeatingCharacterReplacement = new LongestRepeatingCharacterReplacement();
  }

  @Test
  void testCharacterReplacement1() {
    assertEquals(4, longestRepeatingCharacterReplacement.characterReplacement("ABAB", 2));
  }

  @Test
  void testCharacterReplacement2() {
    assertEquals(4, longestRepeatingCharacterReplacement.characterReplacement("AABABBA", 1));
  }

  @Test
  void testCharacterReplacement3() {
    assertEquals(2, longestRepeatingCharacterReplacement.characterReplacement("AABABBA", 0));
  }

  @Test
  void testCharacterReplacement4() {
    assertEquals(6, longestRepeatingCharacterReplacement.characterReplacement("AABABCCBCCB", 2));
  }
}