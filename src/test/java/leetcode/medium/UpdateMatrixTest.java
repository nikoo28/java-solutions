package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpdateMatrixTest {

  private final UpdateMatrix updateMatrix;

  UpdateMatrixTest() {
    updateMatrix = new UpdateMatrix();
  }

  @Test
  void testUpdateMatrix1() {
    int[][] mat = {
        {0, 0, 0},
        {0, 1, 0},
        {1, 1, 1}
    };
    int[][] expected = {
        {0, 0, 0},
        {0, 1, 0},
        {1, 2, 1}
    };
    assertArrayEquals(expected, updateMatrix.updateMatrix(mat));
  }

  @Test
  void testUpdateMatrix2() {
    int[][] mat = {
        {0, 0, 0},
        {0, 1, 0},
        {1, 1, 1}
    };
    int[][] expected = {
        {0, 0, 0},
        {0, 1, 0},
        {1, 2, 1}
    };
    assertArrayEquals(expected, updateMatrix.updateMatrix(mat));
  }
}