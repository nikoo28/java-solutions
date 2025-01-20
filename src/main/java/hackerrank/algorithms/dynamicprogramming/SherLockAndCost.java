package hackerrank.algorithms.dynamicprogramming;

import java.util.List;

public class SherLockAndCost {

  /**
   * Approach:
   * I can use dynamic programming to solve this problem efficiently. Let’s break down the approach:
   * <p>
   * 1.) Initialize two arrays: dp[i][0] and dp[i][1]. These arrays will store the maximum sum of absolute differences for the first i elements of the input array.
   * 2.) Iterate through the input array from left to right:
   * Update dp[i][0] and dp[i][1] based on the previous values and the current element.
   * 3.) The final answer is the maximum value between dp[N-1][0] and dp[N-1][1].
   */
  int sherlockAndCostProblem(List<Integer> list) {
    int N = list.size();
    int[][] dp = new int[N][2];
    dp[0][0] = 0;
    dp[0][1] = 0;

    for (int i = 1; i < N; i++) {
      int curr = list.get(i);
      int prev = list.get(i - 1);

      dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prev - 1);
      dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + curr - 1);
    }

    return Math.max(dp[N - 1][0], dp[N - 1][1]);
  }
}
