package leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SetMatrixZeroesTest {

  private final SetMatrixZeroes setMatrixZeroes;

  SetMatrixZeroesTest() {
    setMatrixZeroes = new SetMatrixZeroes();
  }

  @Test
  void testSetZeroes1() {
    int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
    int[][] expected = {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};

    setMatrixZeroes.setZeroes(matrix);
    assertTrue(Arrays.deepEquals(expected, matrix));
  }

  @Test
  void testSetZeroes2() {
    int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
    int[][] expected = {{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}};

    setMatrixZeroes.setZeroes(matrix);
    assertTrue(Arrays.deepEquals(expected, matrix));
  }
}