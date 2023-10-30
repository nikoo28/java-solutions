package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParanthesesTest {

  private final ValidParantheses validParantheses;

  ValidParanthesesTest() {
    validParantheses = new ValidParantheses();
  }

  @Test
  void testIsValid1() {
    String s = "()[]{}";
    assertTrue(validParantheses.isValid(s));
  }

  @Test
  void testIsValid2() {
    String s = "(]";
    assertFalse(validParantheses.isValid(s));
  }

  @Test
  void testIsValid3() {
    String s = "}";
    assertFalse(validParantheses.isValid(s));
  }

  @Test
  void testIsValid4() {
    String s = "(";
    assertFalse(validParantheses.isValid(s));
  }

  @Test
  void testIsValid5() {
    String s = "[{()[]}()]";
    assertTrue(validParantheses.isValid(s));
  }
}