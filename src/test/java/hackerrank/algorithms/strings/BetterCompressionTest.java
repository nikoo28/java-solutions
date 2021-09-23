package hackerrank.algorithms.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BetterCompressionTest {

  private final BetterCompression betterCompression;

  BetterCompressionTest() {
    betterCompression = new BetterCompression();
  }

  @Test
  void testBetterCompression1() {
    String s = "a3c9b2c1";

    assertEquals("a3b2c10", betterCompression.betterCompression(s));
  }

  @Test
  void testBetterCompression2() {
    String s = "a34";

    assertEquals("a34", betterCompression.betterCompression(s));
  }

  @Test
  void testBetterCompression3() {
    String s = "a34b121c1a22";

    assertEquals("a56b121c1", betterCompression.betterCompression(s));
  }
}