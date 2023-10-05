package leetcode.easy;

public class ValidPalindromeII {

  boolean validPalindrome(String s) {
    int left = 0;
    int right = s.length() - 1;

    while (left < right) {
      // Keep moving till characters match
      if (s.charAt(left) == s.charAt(right)) {
        left++;
        right--;
      } else {
        // Try deleting 1 character from either direction
        return isPalindrome(s, left + 1, right)
            || isPalindrome(s, left, right - 1);
      }
    }

    return true;
  }

  private boolean isPalindrome(String s, int left, int right) {
    while (left < right) {
      if (s.charAt(left) == s.charAt(right)) {
        left++;
        right--;
      } else return false;
    }
    return true;
  }

}
