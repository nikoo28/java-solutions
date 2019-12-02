package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 11/9/19 1:37 AM
 */

class LongestSubstringWithoutRepeatingCharactersTest {

  private LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters =
      new LongestSubstringWithoutRepeatingCharacters();

  @Test
  void lengthOfLongestSubstring1() {
    String s = "abcabcbb";

    assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s));
  }

  @Test
  void lengthOfLongestSubstring2() {
    String s = "bbbbb";

    assertEquals(1, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s));
  }

  @Test
  void lengthOfLongestSubstring3() {
    String s = "pwwkew";

    assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s));
  }

  @Test
  void lengthOfLongestSubstring4() {
    String s = "";

    assertEquals(0, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s));
  }
}