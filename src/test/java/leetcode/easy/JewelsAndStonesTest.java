package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JewelsAndStonesTest {

  private final JewelsAndStones jewelsAndStones;

  JewelsAndStonesTest() {
    jewelsAndStones = new JewelsAndStones();
  }

  @Test
  void testNumJewelsInStones1() {
    String jewels = "aA";
    String stones = "aAAbbbb";

    assertEquals(3, jewelsAndStones.numJewelsInStones(jewels, stones));
  }

  @Test
  void testNumJewelsInStones2() {
    String jewels = "z";
    String stones = "ZZ";

    assertEquals(0, jewelsAndStones.numJewelsInStones(jewels, stones));
  }
}