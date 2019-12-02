package leetcode.hard;

/**
 * Created by nikoo28 on 11/9/19 1:41 AM
 */

class MinimumWindowSubstring {

  String minWindow(String s, String t) {

    // Count characters in s
    int[] mapS = new int[256];

    // Count characters in t
    int[] mapT = new int[256];

    for (char ch : t.toCharArray())
      mapT[ch]++;

    String result = "";
    int right = 0, min = Integer.MAX_VALUE;

    // Two pointers of the sliding window: i(left), right
    for (int i = 0; i < s.length(); i++) {

      while (right < s.length() && !isDesirable(mapS, mapT)) {
        mapS[s.charAt(right)]++;

        // Extend the right pointer of the sliding window
        right++;
      }

      if (isDesirable(mapS, mapT) && min > right - i + 1) {
        result = s.substring(i, right);
        min = right - i + 1;
      }

      // Shrink the left pointer from i to i + 1
      mapS[s.charAt(i)]--;
    }

    return result;
  }

  // Runtime = O(256) = O(1)
  private boolean isDesirable(int[] mapS, int[] mapT) {
    // s should cover all characters in t
    for (int i = 0; i < mapT.length; i++) {
      if (mapT[i] > mapS[i])
        return false;
    }
    return true;
  }
}
