package leetcode.medium;

import java.util.*;

public class WordBreak {

  boolean wordBreak(String s, List<String> wordDict) {

    // Convert the dictionary to a set for O(1) lookups
    Set<String> wordSet = new HashSet<>(wordDict);

    // Find the maximum word length in the dictionary
    int maxLen = 0;
    for (String word : wordDict) {
      maxLen = Math.max(maxLen, word.length());
    }

    int n = s.length();
    // dp[i] states if the substring s[0..i] can be segmented
    boolean[] dp = new boolean[n + 1];

    // Base case: empty string is valid
    dp[0] = true;

    for (int i = 1; i <= n; i++)

      // Check prefixes of length up to maxLen
      for (int j = i - 1; j >= Math.max(0, i - maxLen); j--)
        if (dp[j] && wordSet.contains(s.substring(j, i))) {
          dp[i] = true;
          break; // No need to check further prefixes
        }

    return dp[n];
  }

}
