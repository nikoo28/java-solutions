package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 10/19/19 3:28 PM
 */

class ClimbingStairsTest {

  private ClimbingStairs climbingStairs = new ClimbingStairs();

  @Test
  void testClimbStairs() {
    assertEquals(2, climbingStairs.climbStairs(2));
    assertEquals(3, climbingStairs.climbStairs(3));
  }
}