package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 10/19/19 3:21 PM
 */

class UglyNumberTest {

  private UglyNumber uglyNumber = new UglyNumber();

  @Test
  void testIsUgly() {
    assertTrue(uglyNumber.isUgly(8));
    assertTrue(uglyNumber.isUgly(6));
    assertFalse(uglyNumber.isUgly(14));
  }
}