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
    assertEquals(5, climbingStairs.climbStairs(4));
    assertEquals(8, climbingStairs.climbStairs(5));
    assertEquals(13, climbingStairs.climbStairs(6));
  }
}