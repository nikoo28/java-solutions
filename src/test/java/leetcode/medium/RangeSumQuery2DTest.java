package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangeSumQuery2DTest {

  @Test
  void testBasicSum() {
    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    RangeSumQuery2D rsq = new RangeSumQuery2D(matrix);
    assertEquals(12, rsq.sumRegion(0, 0, 1, 1)); // 1+2+4+5
  }

  @org.junit.jupiter.api.Test
  void testEntireMatrix() {
    int[][] matrix = {
        {1, 2},
        {3, 4}
    };
    RangeSumQuery2D rsq = new RangeSumQuery2D(matrix);
    assertEquals(10, rsq.sumRegion(0, 0, 1, 1)); // 1+2+3+4
  }

  @org.junit.jupiter.api.Test
  void testSingleElement() {
    int[][] matrix = {
        {5, 6},
        {7, 8}
    };
    RangeSumQuery2D rsq = new RangeSumQuery2D(matrix);
    assertEquals(6, rsq.sumRegion(0, 1, 0, 1)); // 6
  }

  @org.junit.jupiter.api.Test
  void testRowQuery() {
    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6}
    };
    RangeSumQuery2D rsq = new RangeSumQuery2D(matrix);
    assertEquals(6, rsq.sumRegion(0, 0, 0, 2)); // 1+2+3
  }

  @org.junit.jupiter.api.Test
  void testColumnQuery() {
    int[][] matrix = {
        {1, 2},
        {3, 4},
        {5, 6}
    };
    RangeSumQuery2D rsq = new RangeSumQuery2D(matrix);
    assertEquals(9, rsq.sumRegion(0, 0, 2, 0)); // 1+3+5
  }
}