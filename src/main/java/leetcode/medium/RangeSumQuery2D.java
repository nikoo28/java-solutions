package leetcode.medium;

public class RangeSumQuery2D {

  private int[][] prefix;

  public RangeSumQuery2D(int[][] matrix) {
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
      return;
    }

    int m = matrix.length;
    int n = matrix[0].length;

    prefix = new int[m][n];

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        int top = (i > 0) ? prefix[i - 1][j] : 0;
        int left = (j > 0) ? prefix[i][j - 1] : 0;
        int topLeft = (i > 0 && j > 0) ? prefix[i - 1][j - 1] : 0;

        prefix[i][j] = matrix[i][j] + top + left - topLeft;
      }
    }
  }

  public int sumRegion(int row1, int col1, int row2, int col2) {
    int total = prefix[row2][col2];
    int top = (row1 > 0) ? prefix[row1 - 1][col2] : 0;
    int left = (col1 > 0) ? prefix[row2][col1 - 1] : 0;
    int topLeft = (row1 > 0 && col1 > 0) ? prefix[row1 - 1][col1 - 1] : 0;

    return total - top - left + topLeft;
  }

}
