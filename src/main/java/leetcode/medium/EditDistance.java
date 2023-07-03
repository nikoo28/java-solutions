package leetcode.medium;

public class EditDistance {

  int minDistance(String word1, String word2) {

    int m = word1.length();
    int n = word2.length();

    // dp[i][j] := min operations to convert word1 to word2
    int[][] costDP = new int[m + 1][n + 1];

    // Initialize DP matrix
    for (int i = 1; i <= m; ++i) costDP[i][0] = i;
    for (int j = 1; j <= n; ++j) costDP[0][j] = j;

    for (int i = 1; i <= m; ++i)
      for (int j = 1; j <= n; ++j)

        //same characters
        if (word1.charAt(i - 1) == word2.charAt(j - 1))
          // Copy from top left
          costDP[i][j] = costDP[i - 1][j - 1];
        else {
          // Get minimum of all 3 neighbors
          int topLeft = costDP[i - 1][j - 1];
          int top = costDP[i - 1][j];
          int left = costDP[i][j - 1];
          costDP[i][j] = Math.min(topLeft, Math.min(top, left)) + 1;
        }

    return costDP[m][n];
  }

}
