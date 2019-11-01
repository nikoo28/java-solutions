package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 10/19/19 3:36 PM
 */

class NumberOf1BitsTest {

  private NumberOf1Bits numberOf1Bits = new NumberOf1Bits();

  @Test
  void testHammingWeight() {
    assertEquals(3, numberOf1Bits.hammingWeight(521));
    assertEquals(1, numberOf1Bits.hammingWeight(2097152));
    assertEquals(31, numberOf1Bits.hammingWeight(Integer.MAX_VALUE));
  }
}