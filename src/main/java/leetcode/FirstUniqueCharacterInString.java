package leetcode;

/**
 * Created by nikoo28 on 12/17/17 9:01 PM
 */

class FirstUniqueCharacterInString {

  public int firstUniqChar(String s) {

    int[] freq = new int[26];
    for (int i = 0; i < s.length(); i++) freq[s.charAt(i) - 'a']++;
    for (int i = 0; i < s.length(); i++) if (freq[s.charAt(i) - 'a'] == 1) return i;
    return -1;
  }

}
