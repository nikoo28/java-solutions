package leetcode.easy;

public class ValidPalindrome {

  boolean validPalindrome(String s) {
    // Get the left and right pointers
    int left = 0;
    int right = s.length() - 1;

    // Start a loop and compare characters
    while (left < right)
      // If same, move both pointers
      if (s.charAt(left) == s.charAt(right)) {
        left++;
        right--;
      }
      // If not, simply return false
      else
        return false;

    // If we come out of the loop, then all
    // characters have matched, return true
    return true;
  }

}
