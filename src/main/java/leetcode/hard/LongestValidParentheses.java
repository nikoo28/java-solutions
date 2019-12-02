package leetcode.hard;

/**
 * Created by nikoo28 on 11/5/19 12:32 AM
 */

class LongestValidParentheses {

  int longestValidParentheses(String s) {

    int leftMax = 0;
    int left = 0;
    int right = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(')
        left++;
      else
        right++;

      if (left == right) {
        leftMax = Math.max(leftMax, 2 * left);
      } else if (right > left) {
        left = right = 0;
      }
    }

    int rightMax = 0;
    left = 0;
    right = 0;
    for (int i = s.length() - 1; i > -1; i--) {
      if (s.charAt(i) == '(')
        left++;
      else
        right++;

      if (left == right) {
        rightMax = Math.max(rightMax, 2 * left);
      } else if (left > right) {
        left = right = 0;
      }
    }

    return Math.max(leftMax, rightMax);
  }
}
