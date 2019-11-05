package leetcode.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 11/5/19 12:32 AM
 */

class LongestValidParenthesesTest {

  private LongestValidParentheses longestValidParentheses = new LongestValidParentheses();

  @Test
  void testLongestValidParentheses1() {
    String s = "(()";
    assertEquals(2, longestValidParentheses.longestValidParentheses(s));
  }

  @Test
  void testLongestValidParentheses2() {
    String s = ")()())";
    assertEquals(4, longestValidParentheses.longestValidParentheses(s));
  }

  @Test
  void testLongestValidParentheses3() {
    String s = ")()())((()())";
    assertEquals(6, longestValidParentheses.longestValidParentheses(s));
  }
}