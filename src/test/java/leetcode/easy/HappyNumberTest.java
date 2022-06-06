package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 10/19/19 3:14 PM
 */

class HappyNumberTest {

  private HappyNumber happyNumber = new HappyNumber();

  @Test
  void testIsHappy() {
    assertTrue(happyNumber.isHappy(7));
    assertTrue(happyNumber.isHappy(19));
    assertTrue(happyNumber.isHappy(31));
    assertTrue(happyNumber.isHappy(8455));
    assertTrue(happyNumber.isHappy(46154));
    assertTrue(happyNumber.isHappy(99942));

    assertFalse(happyNumber.isHappy(42));
    assertFalse(happyNumber.isHappy(243));
    assertFalse(happyNumber.isHappy(343));
    assertFalse(happyNumber.isHappy(1134));
    assertFalse(happyNumber.isHappy(99999));
    assertFalse(happyNumber.isHappy(756345));
  }
}