package leetcode.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 11/2/19 3:07 PM
 */

class TrappingRainWaterTest {

  private TrappingRainWater trappingRainWater = new TrappingRainWater();

  @Test
  void testTrap() {
    int[] heights = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

    assertEquals(6, trappingRainWater.trap(heights));
  }

  @Test
  void testTrap2() {
    int[] heights = {0, 1, 0, 2, 1, 0, 1, 1};

    assertEquals(2, trappingRainWater.trap(heights));
  }

  @Test
  void testTrap3() {
    int[] heights = {0, 0, 0, 0, 0, 1, 0};

    assertEquals(0, trappingRainWater.trap(heights));
  }

  @Test
  void testTrap4() {
    int[] heights = {0, 1, 0, 5555, 1, 0, 1, 45};

    assertEquals(134, trappingRainWater.trap(heights));
  }

  @Test
  void testTrap5() {
    int[] heights = {0, 1};

    assertEquals(0, trappingRainWater.trap(heights));
  }
}