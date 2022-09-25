package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobberIITest {

  private final HouseRobberII houseRobberII;

  HouseRobberIITest() {
    houseRobberII = new HouseRobberII();
  }

  @Test
  void testRob1() {
    int[] nums = {2, 3, 2};

    int expectedLoot = 3;

    assertEquals(expectedLoot, houseRobberII.rob(nums));
  }

  @Test
  void testRob2() {
    int[] nums = {1, 2, 3, 1};

    int expectedLoot = 4;

    assertEquals(expectedLoot, houseRobberII.rob(nums));
  }

  @Test
  void testRob3() {
    int[] nums = {1, 2, 3};

    int expectedLoot = 3;

    assertEquals(expectedLoot, houseRobberII.rob(nums));
  }

  @Test
  void testRob4() {
    int[] nums = {0};

    int expectedLoot = 0;

    assertEquals(expectedLoot, houseRobberII.rob(nums));
  }

  @Test
  void testRob5() {
    int[] nums = {0, 0};

    int expectedLoot = 0;

    assertEquals(expectedLoot, houseRobberII.rob(nums));
  }
}