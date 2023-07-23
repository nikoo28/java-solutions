package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceTest {

  private final IsSubsequence isSubsequence;

  IsSubsequenceTest() {
    isSubsequence = new IsSubsequence();
  }

  @Test
  void testIsSubsequence1() {
    String s = "abc";
    String t = "ahbgdc";

    assertTrue(isSubsequence.isSubsequence(s, t));
  }

  @Test
  void testIsSubsequence2() {
    String s = "abx";
    String t = "ahbgdc";

    assertFalse(isSubsequence.isSubsequence(s, t));
  }

  @Test
  void testIsSubsequence3() {
    String s = "";
    String t = "ahbgdc";

    assertTrue(isSubsequence.isSubsequence(s, t));
  }

  @Test
  void testIsSubsequence4() {
    String s = "ahbgdc";
    String t = "";

    assertFalse(isSubsequence.isSubsequence(s, t));
  }
}