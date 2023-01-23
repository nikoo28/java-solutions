package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobberTest {

  private final HouseRobber houseRobber;

  HouseRobberTest() {
    houseRobber = new HouseRobber();
  }

  @Test
  void testRob1() {
    int[] nums = {2, 1, 1, 2};

    int expectedLoot = 4;

    assertEquals(expectedLoot, houseRobber.rob(nums));
  }

  @Test
  void testRob2() {
    int[] nums = {1, 2};

    int expectedLoot = 2;

    assertEquals(expectedLoot, houseRobber.rob(nums));
  }

  @Test
  void testRob3() {
    int[] nums = {2, 7, 9, 3, 1};

    int expectedLoot = 12;

    assertEquals(expectedLoot, houseRobber.rob(nums));
  }

  @Test
  void testRob4() {
    int[] nums = {1};

    int expectedLoot = 1;

    assertEquals(expectedLoot, houseRobber.rob(nums));
  }
}