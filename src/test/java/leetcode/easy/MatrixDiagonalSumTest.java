package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixDiagonalSumTest {

  private final MatrixDiagonalSum matrixDiagonalSum;

  MatrixDiagonalSumTest() {
    matrixDiagonalSum = new MatrixDiagonalSum();
  }

  @Test
  void testDiagonalSum1() {
    int[][] mat = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    assertEquals(25, matrixDiagonalSum.diagonalSum(mat));
  }

  @Test
  void testDiagonalSum2() {
    int[][] mat = {
        {1, 1, 1, 1},
        {1, 1, 1, 1},
        {1, 1, 1, 1},
        {1, 1, 1, 1}
    };
    assertEquals(8, matrixDiagonalSum.diagonalSum(mat));
  }

  @Test
  void testDiagonalSum3() {
    int[][] mat = {
        {5}
    };
    assertEquals(5, matrixDiagonalSum.diagonalSum(mat));
  }

  @Test
  void testDiagonalSum4() {
    int[][] mat = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}
    };
    assertEquals(68, matrixDiagonalSum.diagonalSum(mat));
  }
}