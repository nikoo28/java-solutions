package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 7/3/20 8:44 PM
 */

class ValidAnagramTest {

  ValidAnagram validAnagram = new ValidAnagram();

  @Test
  void testIsAnagram1() {
    assertEquals(false, validAnagram.isAnagram("rat", "car"));
  }

  @Test
  void testIsAnagram2() {
    assertEquals(true, validAnagram.isAnagram("anagram", "nagaram"));
  }
}