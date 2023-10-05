package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeIITest {

  private final ValidPalindromeII validPalindromeII;

  ValidPalindromeIITest() {
    validPalindromeII = new ValidPalindromeII();
  }

  @Test
  void testValidPalindrome1() {
    String s = "abca";
    assertTrue(validPalindromeII.validPalindrome(s));
  }

  @Test
  void testValidPalindrome2() {
    String s = "abc";
    assertFalse(validPalindromeII.validPalindrome(s));
  }

  @Test
  void testValidPalindrome3() {
    String s = "abbva";
    assertTrue(validPalindromeII.validPalindrome(s));
  }
}