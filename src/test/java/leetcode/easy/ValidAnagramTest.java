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

  @Test
  void testIsAnagram3() {
    assertEquals(false, validAnagram.isAnagram("mississippi", "mips"));
  }

  @Test
  void testIsAnagram4() {
    assertEquals(true, validAnagram.isAnagram("silent", "listen"));
  }

  @Test
  void testIsAnagram5() {
    assertEquals(true, validAnagram.isAnagram("a decimal point", "im a dot in place"));
  }
}