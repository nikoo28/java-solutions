package leetcode.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 11/2/19 5:06 PM
 */

class TrappingRainWaterIITest {

  private TrappingRainWaterII trappingRainWaterII = new TrappingRainWaterII();

  @Test
  void testTrapRainWater1() {
    int[][] heightMap = {
        {1, 4, 3, 1, 3, 2},
        {3, 2, 1, 3, 2, 4},
        {2, 3, 3, 2, 3, 1}
    };

    assertEquals(4, trappingRainWaterII.trapRainWater(heightMap));
  }

  @Test
  void testTrapRainWater2() {
    int[][] heightMap = {};

    assertEquals(0, trappingRainWaterII.trapRainWater(heightMap));
  }

}