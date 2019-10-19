package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 10/19/19 3:14 PM
 */

class HappyNumberTest {

  HappyNumber happyNumber = new HappyNumber();

  @Test
  void testIsHappy() {
    assertTrue(happyNumber.isHappy(19));
  }
}