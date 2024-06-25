package leetcode.easy;

public class MatrixDiagonalSum {

  int diagonalSum(int[][] mat) {

    int sum = 0;
    int n = mat.length;

    // Get the sum of both diagonals
    for (int i = 0; i < n; i++) {
      sum += mat[i][i];
      sum += mat[i][n - i - 1];
    }

    // If the matrix is odd
    // Subtract the duplicate element
    if (n % 2 != 0) {
      sum -= mat[n / 2][n / 2];
    }

    return sum;
  }

}
