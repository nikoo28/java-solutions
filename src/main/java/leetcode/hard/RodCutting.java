package leetcode.hard;

// Given a rod of length n and an array price[]. price[i] denotes the price of a piece of length i.
// Determine the maximum amount obtained by cutting the rod into pieces and selling the pieces.

public class RodCutting {

  int cutRod(int[] price) {
    int n = price.length - 1;
    int[][] dp = new int[n + 1][n + 1];

    // Use a 2d matrix memoization
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (j >= i) {

          // Max of not including the current piece or including it
          dp[i][j] = Math.max(dp[i - 1][j], price[i] + dp[i][j - i]);
        } else {

          // Current length is too long, just copy the value from the row above
          dp[i][j] = dp[i - 1][j];
        }
      }
    }

    return dp[n][n];
  }

}
