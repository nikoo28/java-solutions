package leetcode;

/**
 * Created by nikoo28 on 12/18/17 10:14 PM
 */

public class LongestPalindromicSubstring {

  public String longestPalindrome(String str) {

    int maxLength = 1; // The result (length of LPS)

    int start = 0;
    int len = str.length();

    int low = 0, high = 0;

    // One by one consider every character as center
    // point of even and length palindromes
    for (int i = 1; i < len; ++i) {
      // Find the longest even length palindrome with
      // center points as i-1 and i.
      low = i - 1;
      high = i;
      while (low >= 0 && high < len
          && str.charAt(low) == str.charAt(high)) {
        if (high - low + 1 > maxLength) {
          start = low;
          maxLength = high - low + 1;
        }
        --low;
        ++high;
      }

      // Find the longest odd length palindrome with
      // center point as i
      low = i - 1;
      high = i + 1;
      while (low >= 0 && high < len
          && str.charAt(low) == str.charAt(high)) {
        if (high - low + 1 > maxLength) {
          start = low;
          maxLength = high - low + 1;
        }
        --low;
        ++high;
      }
    }

    return str.substring(start, start + maxLength);
  }

}
