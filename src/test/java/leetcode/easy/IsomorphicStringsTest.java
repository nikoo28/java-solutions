package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsomorphicStringsTest {

  private final IsomorphicStrings isomorphicStrings;

  IsomorphicStringsTest() {
    isomorphicStrings = new IsomorphicStrings();
  }

  @Test
  void testIsIsomorphic1() {
    String s = "badc";
    String t = "baba";

    assertFalse(isomorphicStrings.isIsomorphic(s, t));
  }

  @Test
  void testIsIsomorphic2() {
    String s = "add";
    String t = "egg";

    assertTrue(isomorphicStrings.isIsomorphic(s, t));
  }

  @Test
  void testIsIsomorphic3() {
    String s = "foo";
    String t = "bar";

    assertFalse(isomorphicStrings.isIsomorphic(s, t));
  }

  @Test
  void testIsIsomorphic4() {
    String s = "paper";
    String t = "title";

    assertTrue(isomorphicStrings.isIsomorphic(s, t));
  }
}