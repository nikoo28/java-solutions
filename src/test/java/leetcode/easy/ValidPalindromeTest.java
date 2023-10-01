package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

  private final ValidPalindrome validPalindrome;

  ValidPalindromeTest() {
    validPalindrome = new ValidPalindrome();
  }

  @Test
  void testValidPalindrome1() {
    String s = "racecar";
    assertTrue(validPalindrome.validPalindrome(s));
  }

  @Test
  void testValidPalindrome2() {
    String s = "raceacar";
    assertFalse(validPalindrome.validPalindrome(s));
  }
}