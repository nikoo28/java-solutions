package leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by nikoo28 on 11/2/19 11:18 PM
 */

class SpiralMatrixTest {

  private SpiralMatrix spiralMatrix = new SpiralMatrix();

  @Test
  void testSpiralOrder1() {
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    Integer[] output = {1, 2, 3, 6, 9, 8, 7, 4, 5};

    List<Integer> expected = Arrays.asList(output);
    assertEquals(expected, spiralMatrix.spiralOrder(matrix));
  }

  @Test
  void testSpiralOrder2() {
    int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

    Integer[] output = {1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7};

    List<Integer> expected = Arrays.asList(output);
    assertEquals(expected, spiralMatrix.spiralOrder(matrix));
  }

  @Test
  void testSpiralOrder3() {
    int[][] matrix = {{1, 2, 3, 4}};

    Integer[] output = {1, 2, 3, 4};

    List<Integer> expected = Arrays.asList(output);
    assertEquals(expected, spiralMatrix.spiralOrder(matrix));
  }

  @Test
  void testSpiralOrder4() {
    int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}};

    Integer[] output = {1, 2, 3, 4, 8, 7, 6, 5};

    List<Integer> expected = Arrays.asList(output);
    assertEquals(expected, spiralMatrix.spiralOrder(matrix));
  }

}