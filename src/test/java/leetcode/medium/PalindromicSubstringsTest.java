package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromicSubstringsTest {

  private final PalindromicSubstrings palindromicSubstrings;

  PalindromicSubstringsTest() {
    palindromicSubstrings = new PalindromicSubstrings();
  }

  @Test
  void testCountSubstrings1() {
    assertEquals(3, palindromicSubstrings.countSubstrings("abc"));
  }

  @Test
  void testCountSubstrings2() {
    assertEquals(6, palindromicSubstrings.countSubstrings("aaa"));
  }

  @Test
  void testCountSubstrings3() {
    assertEquals(6, palindromicSubstrings.countSubstrings("abba"));
  }

  @Test
  void testCountSubstrings4() {
    assertEquals(7, palindromicSubstrings.countSubstrings("abbac"));
  }

  @Test
  void testCountSubstrings5() {
    assertEquals(9, palindromicSubstrings.countSubstrings("abccba"));
  }
}