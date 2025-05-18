package leetcode.medium;

public class MaximalSquare {

  int maximalSquare(char[][] matrix) {

    int rows = matrix.length;
    int cols = matrix[0].length;
    int[][] dp = new int[rows][cols];
    int maxSide = 0;

    // Fill the dp table
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (matrix[i][j] == '1') {

          // Special handling for the first row and first column
          if (i == 0 || j == 0)
            dp[i][j] = 1;
          else
            // For others, dp[i][j] is the minimum of the three neighbors
            dp[i][j] = 1 +
                Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]);

          maxSide = Math.max(maxSide, dp[i][j]);
        }
      }
    }

    // Return the area of the largest square
    return maxSide * maxSide;
  }

}
