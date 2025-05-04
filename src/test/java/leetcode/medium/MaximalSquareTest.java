package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximalSquareTest {

  private final MaximalSquare maximalSquare;

  MaximalSquareTest() {
    maximalSquare = new MaximalSquare();
  }

  @Test
  void testMaximalSquare1() {
    char[][] matrix = {
      {'1', '0', '1', '0', '0'},
      {'1', '0', '1', '1', '1'},
      {'1', '1', '1', '1', '1'},
      {'1', '0', '0', '1', '0'}
    };
    assertEquals(4, maximalSquare.maximalSquare(matrix));
  }

  @Test
  void testMaximalSquare2() {
    char[][] matrix = {
      {'0', '1'},
      {'1', '0'}
    };
    assertEquals(1, maximalSquare.maximalSquare(matrix));
  }

  @Test
  void testMaximalSquare3() {
    char[][] matrix = {
      {'0', '0'},
      {'0', '0'}
    };
    assertEquals(0, maximalSquare.maximalSquare(matrix));
  }

  @Test
  void testMaximalSquare4() {
    char[][] matrix = {
      {'1', '1', '1', '1'},
      {'1', '1', '1', '1'},
      {'1', '1', '1', '1'},
      {'0', '0', '0', '0'}
    };
    assertEquals(9, maximalSquare.maximalSquare(matrix));
  }

  @Test
  void testMaximalSquare5() {
    char[][] matrix = {
        {'1', '1', '1', '1'},
    };
    assertEquals(1, maximalSquare.maximalSquare(matrix));
  }
}