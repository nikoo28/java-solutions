package leetcode;

/**
 * Created by nikoo28 on 7/20/19 2:28 PM
 */

public class RotateImage {

  public void rotate(int[][] matrix) {

    // Transpose the matrix
    for (int i = 0; i < matrix.length; i++) {
      for (int j = i + 1; j < matrix.length; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }

    // Reverse each row
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length / 2; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[i][matrix.length - j - 1];
        matrix[i][matrix.length - j - 1] = temp;
      }
    }
  }

}
