package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseOnlyLettersTest {

  private final ReverseOnlyLetters reverseOnlyLetters;

  ReverseOnlyLettersTest() {
    reverseOnlyLetters = new ReverseOnlyLetters();
  }

  @Test
  void testReverseOnlyLetters1() {
    String s = "ab-cd";
    String expected = "dc-ba";
    assertEquals(expected, reverseOnlyLetters.reverseOnlyLetters(s));
  }

  @Test
  void testReverseOnlyLetters2() {
    String s = "a-bC-dEf-ghIj";
    String expected = "j-Ih-gfE-dCba";
    assertEquals(expected, reverseOnlyLetters.reverseOnlyLetters(s));
  }

  @Test
  void testReverseOnlyLetters3() {
    String s = "Test1ng-Leet=code-Q!";
    String expected = "Qedo1ct-eeLg=ntse-T!";
    assertEquals(expected, reverseOnlyLetters.reverseOnlyLetters(s));
  }
}