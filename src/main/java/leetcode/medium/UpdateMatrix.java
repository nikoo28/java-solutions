package leetcode.medium;

public class UpdateMatrix {

  int[][] updateMatrix(int[][] mat) {
    int rows = mat.length;
    int cols = mat[0].length;
    int[][] result = new int[rows][cols];

    // Initialize the result matrix with maximum values
    for (int i = 0; i < rows; i++)
      for (int j = 0; j < cols; j++)
        result[i][j] = Integer.MAX_VALUE;

    // First pass: top-left to bottom-right
    for (int i = 0; i < rows; i++)
      for (int j = 0; j < cols; j++)
        if (mat[i][j] == 0) result[i][j] = 0;
        else {
          if (i > 0)
            result[i][j] = Math.min(result[i][j], result[i - 1][j] + 1);
          if (j > 0)
            result[i][j] = Math.min(result[i][j], result[i][j - 1] + 1);
        }

    // Second pass: bottom-right to top-left
    for (int i = rows - 1; i >= 0; i--)
      for (int j = cols - 1; j >= 0; j--)
        if (mat[i][j] != 0) {
          if (i < rows - 1)
            result[i][j] = Math.min(result[i][j], result[i + 1][j] + 1);
          if (j < cols - 1)
            result[i][j] = Math.min(result[i][j], result[i][j + 1] + 1);
        }

    return result;
  }

}
