package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchA2DMatrixTest {

  private final SearchA2DMatrix searchA2DMatrix;

  SearchA2DMatrixTest() {
    searchA2DMatrix = new SearchA2DMatrix();
  }

  @Test
  void testSearchMatrix1() {
    int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
    assertTrue(searchA2DMatrix.searchMatrix(matrix, 3));
    assertFalse(searchA2DMatrix.searchMatrix(matrix, 13));
  }

  @Test
  void testSearchMatrix2() {
    int[][] matrix = {{1}, {10}, {60}};
    assertFalse(searchA2DMatrix.searchMatrix(matrix, 0));
    assertTrue(searchA2DMatrix.searchMatrix(matrix, 10));
    assertFalse(searchA2DMatrix.searchMatrix(matrix, 65));
  }
}