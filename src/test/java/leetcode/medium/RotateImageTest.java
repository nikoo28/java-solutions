package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateImageTest {

  private final RotateImage rotateImage;

  RotateImageTest() {
    rotateImage = new RotateImage();
  }

  @Test
  void testRotate1() {
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] expected = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};

    int[][] actual = rotateImage.rotate2(matrix);

    for (int i = 0; i < matrix.length; i++) {
      assertArrayEquals(expected[i], actual[i]);
    }
  }

  @Test
  void testRotate2() {
    int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
    int[][] expected = {{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}};

    int[][] actual = rotateImage.rotate2(matrix);

    for (int i = 0; i < matrix.length; i++) {
      assertArrayEquals(expected[i], actual[i]);
    }
  }

  @Test
  void testRotate3() {
    int[][] matrix = {{1}};
    int[][] expected = {{1}};

    int[][] actual = rotateImage.rotate2(matrix);

    for (int i = 0; i < matrix.length; i++) {
      assertArrayEquals(expected[i], actual[i]);
    }
  }

  @Test
  void testRotate4() {
    int[][] matrix = {{1, 2}, {3, 4}};
    int[][] expected = {{3, 1}, {4, 2}};

    int[][] actual = rotateImage.rotate2(matrix);

    for (int i = 0; i < matrix.length; i++) {
      assertArrayEquals(expected[i], actual[i]);
    }
  }
}