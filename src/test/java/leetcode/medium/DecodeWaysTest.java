package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeWaysTest {

  private final DecodeWays decodeWays;

  DecodeWaysTest() {
    decodeWays = new DecodeWays();
  }

  @Test
  void testNumDecodings1() {
    assertEquals(2, decodeWays.numDecodings("12"));
  }

  @Test
  void testNumDecodings2() {
    assertEquals(3, decodeWays.numDecodings("226"));
  }

  @Test
  void testNumDecodings3() {
    assertEquals(0, decodeWays.numDecodings("0"));
  }

  @Test
  void testNumDecodings4() {
    assertEquals(0, decodeWays.numDecodings("06"));
  }

  @Test
  void testNumDecodings5() {
    assertEquals(4, decodeWays.numDecodings("122016"));
  }
}