package hackerrank.algorithms.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CamelCaseTest {

  private final CamelCase camelCase;

  public CamelCaseTest() {
    camelCase = new CamelCase();
  }

  @Test
  void testCamelcase1() {
    String s = "oneTwoThree";
    assertEquals(3, camelCase.camelcase(s));
  }

  @Test
  void testCamelcase2() {
    String s = "saveChangesInTheEditor";
    assertEquals(5, camelCase.camelcase(s));
  }

  @Test
  void testCamelcase3() {
    String s = "a";
    assertEquals(1, camelCase.camelcase(s));
  }

  @Test
  void testCamelcase4() {
    String s = "aBCD";
    assertEquals(4, camelCase.camelcase(s));
  }
}