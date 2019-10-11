package leetcode;

/**
 * Created by nikoo28 on 9/23/18 11:41 AM
 */

class ToeplitzMatrix {

  public boolean isToeplitzMatrix(int[][] matrix) {

    int rows = matrix.length;
    int cols = matrix[0].length;

    for (int i = 0; i < rows; i++) {
      int row = i;
      int col = 0;
      int num = matrix[row][col];
      row++;
      col++;
      if (notSame(matrix, rows, cols, row, col, num)) return false;
    }

    for (int i = 0; i < cols; i++) {
      int row = 0;
      int col = i;
      int num = matrix[row][col];
      row++;
      col++;
      if (notSame(matrix, rows, cols, row, col, num)) return false;
    }

    return true;

  }

  private boolean notSame(int[][] matrix, int rows, int cols, int row, int col, int num) {
    while (row < rows && col < cols) {
      if (matrix[row][col] == num) {
        row++;
        col++;
      } else
        return true;
    }
    return false;
  }

}
