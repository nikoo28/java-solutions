package leetcode.medium;

public class PalindromicSubstrings {

  int countSubstrings(String s) {

    int count = 0;

    for (int i = 0; i < s.length(); i++) {

      // Count palindromes with odd length
      count += countPalindromes(s, i, i);

      // Count palindromes with even length
      count += countPalindromes(s, i, i + 1);
    }

    return count;

  }

  private int countPalindromes(String s, int left, int right) {

    int count = 0;

    // Check for palindromes
    while (left >= 0 && right < s.length()
        && s.charAt(left) == s.charAt(right)) {
      count++;
      left--;
      right++;
    }

    return count;
  }

}
