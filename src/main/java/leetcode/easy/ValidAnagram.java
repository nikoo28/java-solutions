package leetcode.easy;

/**
 * Created by nikoo28 on 9/23/18 12:40 PM
 */

class ValidAnagram {

  public boolean isAnagram(String s, String t) {

    if (s.length() != t.length())
      return false;

    int[] counts = new int[26];
    for (int i = 0; i < s.length(); i++) {
      counts[s.charAt(i) - 'a']++;
      counts[t.charAt(i) - 'a']--;
    }

    for (int count : counts) {
      if (count != 0)
        return false;
    }

    return true;
  }

}
