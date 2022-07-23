package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackspaceStringCompareTest {

  private final BackspaceStringCompare backspaceStringCompare;

  BackspaceStringCompareTest() {
    backspaceStringCompare = new BackspaceStringCompare();
  }

  @Test
  void testBackspaceCompare1() {
    String s = "ab#c";
    String t = "ad#c";

    assertTrue(backspaceStringCompare.backspaceCompare(s, t));
  }

  @Test
  void testBackspaceCompare2() {
    String s = "ab##";
    String t = "c#d#";

    assertTrue(backspaceStringCompare.backspaceCompare(s, t));
  }

  @Test
  void testBackspaceCompare3() {
    String s = "a#c";
    String t = "b";

    assertFalse(backspaceStringCompare.backspaceCompare(s, t));
  }

  @Test
  void testBackspaceCompare4() {
    String s = "aav######";
    String t = "aav#####";

    assertTrue(backspaceStringCompare.backspaceCompare(s, t));
  }

  @Test
  void testBackspaceCompare5() {
    String s = "######";
    String t = "######";

    assertTrue(backspaceStringCompare.backspaceCompare(s, t));
  }
}