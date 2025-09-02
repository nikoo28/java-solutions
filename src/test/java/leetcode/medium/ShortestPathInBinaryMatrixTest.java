package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestPathInBinaryMatrixTest {

  private final ShortestPathInBinaryMatrix shortestPathInBinaryMatrix;

  ShortestPathInBinaryMatrixTest() {
    shortestPathInBinaryMatrix = new ShortestPathInBinaryMatrix();
  }

  @Test
  void testShortestPathBinaryMatrix1() {
    int[][] grid = {
      {0, 1},
      {1, 0}
    };
    assertEquals(2, shortestPathInBinaryMatrix.shortestPathBinaryMatrix(grid));
  }

  @Test
  void testShortestPathBinaryMatrix2() {
    int[][] grid = {
      {0, 0, 0},
      {1, 1, 0},
      {1, 1, 0}
    };
    assertEquals(4, shortestPathInBinaryMatrix.shortestPathBinaryMatrix(grid));
  }
}