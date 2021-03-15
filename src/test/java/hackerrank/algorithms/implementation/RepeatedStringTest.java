package hackerrank.algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 3/14/21 4:41 PM
 */

class RepeatedStringTest {

  private final RepeatedString repeatedString;

  public RepeatedStringTest() {
    repeatedString = new RepeatedString();
  }

  @Test
  void testRepeatedString1() {
    String s = "aba";
    long n = 10;

    assertEquals(7, repeatedString.repeatedString(s, n));
  }

  @Test
  void testRepeatedString2() {
    String s = "a";
    long n = 1000000000000L;

    assertEquals(1000000000000L, repeatedString.repeatedString(s, n));
  }

  @Test
  void testRepeatedString3() {
    String s = "aab";
    long n = 882787;

    assertEquals(588525, repeatedString.repeatedString(s, n));
  }
}