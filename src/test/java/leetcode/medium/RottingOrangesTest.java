package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RottingOrangesTest {

  private final RottingOranges rottingOranges;

  RottingOrangesTest() {
    rottingOranges = new RottingOranges();
  }

  @Test
  void testOrangesRotting1() {
    int[][] grid = {
        {2, 1, 1},
        {1, 1, 0},
        {0, 1, 1}
    };

    assertEquals(4, rottingOranges.orangesRotting(grid));
  }

  @Test
  void testOrangesRotting2() {
    int[][] grid = {
        {2, 1, 1},
        {0, 1, 1},
        {1, 0, 1}
    };

    assertEquals(-1, rottingOranges.orangesRotting(grid));
  }

  @Test
  void testOrangesRotting3() {
    int[][] grid = {
        {0, 2}
    };

    assertEquals(0, rottingOranges.orangesRotting(grid));
  }
}