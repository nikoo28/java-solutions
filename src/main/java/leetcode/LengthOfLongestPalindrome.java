package leetcode;

import java.util.HashSet;

/**
 * Created by nikoo28 on 4/30/18 7:54 PM
 */

class LengthOfLongestPalindrome {

  private static int longestPalindrome(String s) {

    if (s == null || s.length() == 0)
      return 0;

    HashSet<Character> hs = new HashSet<>();
    int count = 0;

    for (int i = 0; i < s.length(); i++) {
      if (hs.contains(s.charAt(i))) {
        hs.remove(s.charAt(i));
        count++;
      } else {
        hs.add(s.charAt(i));
      }
    }
    if (!hs.isEmpty())
      return count * 2 + 1;

    return count * 2;
  }

  public static void main(String[] args) {
    System.out.println(longestPalindrome("abcda"));
  }

}
