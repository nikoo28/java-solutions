package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestFibonacciSubsequence {

  int lengthOfLongestFibonacciSubsequence(int[] arr) {
    int len = arr.length;
    int dp[][] = new int[len][len];
    int result = 0;

    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < len; i++) {
      map.put(arr[i], i);
      for (int j = 1; j < len; j++) {
        dp[i][j] = 2;
      }
    }

    for (int i = 0; i < len; i++) {
      for (int j = i + 1; j < len; j++) {
        int k = arr[i] + arr[j];
        if (map.containsKey(k)) {
          int index = map.get(k);
          dp[j][index] = dp[i][j] + 1;
        }
      }
    }

    for (int i = 0; i < len; i++) {
      for (int j = i + 1; j < len; j++) {
        result = Math.max(result, dp[i][j]);
      }
    }

    return result == 2 ? 0 : result;
  }
}
