package hackerrank.algorithms.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 10/10/20 4:49 PM
 */

class TwoStringsTest {

  TwoStrings twoStrings = new TwoStrings();

  @Test
  void testTwoStrings1() {
    String s1 = "art";
    String s2 = "a";

    assertEquals("YES", twoStrings.twoStrings(s1, s2));
  }

  @Test
  void testTwoStrings2() {
    String s1 = "bart";
    String s2 = "trap";

    assertEquals("YES", twoStrings.twoStrings(s1, s2));
    assertEquals("YES", twoStrings.twoStringsMethodTwo(s1, s2));
  }

  @Test
  void testTwoStrings3() {
    String s1 = "study";
    String s2 = "algo";

    assertEquals("NO", twoStrings.twoStrings(s1, s2));
    assertEquals("NO", twoStrings.twoStringsMethodTwo(s1, s2));
  }

  @Test
  void testTwoStrings4() {
    String s1 = "wouldyoulikefries";
    String s2 = "abcabcabcabcabcabc";

    assertEquals("NO", twoStrings.twoStrings(s1, s2));
    assertEquals("NO", twoStrings.twoStringsMethodTwo(s1, s2));
  }
}